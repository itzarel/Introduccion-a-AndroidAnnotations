# Práctica #3

Crear un nuevo proyecto.

Añadir la extensión de AndroidAnnotations.

Añadir los siguientes nuevos paquetes:

```
	apps
	beans
	extras
```

Dentro del paquete apps añadir la siguiente clase:

```
	@EApplication
	public class NewApp extends Application {
	}
```

Dentro del paquete beans añadir las siguientes clases.

Primero:

```
	@EBean
	public class FirstBean {

	    @Bean
	    SecondBean secondBean;

	    @App
	    NewApp newApp;

	    public FirstBean() {
		System.out.println("}}}}}}}}}}}}}}}}}}}}}}}}}}}}}: FirstBean::secondBean " + secondBean);
		System.out.println("}}}}}}}}}}}}}}}}}}}}}}}}}}}}}: FirstBean::secondBean " + newApp);
	    }

	    // https://github.com/androidannotations/androidannotations/wiki/Enhance-custom-classes#executing-code-after-dependency-injection
	    @AfterInject
	    public void initAfterInjection() {
		System.out.println("+++++++++++++++++++++++++++++: FirstBean::initAfterInjection");
		System.out.println("+++++++++++++++++++++++++++++: FirstBean::secondBean: " + newApp);
	    }

	}
```

Poniendo un log en el constructor se visualizará que las dos variables no están inicializadas.

Posteriormente, cuando pase por el método "initAfterInjection" se verá que sendas variables ya están inicialidas.

Segundo:

```
	@EBean
	public class SecondBean {
	}
```

En el package de extras añadir la siguiente clase:

```
	@EActivity(R.layout.activity_main)
	public class SecondActivity extends Activity {


	    @Extra
	    String message;

	    @Bean
	    FirstBean firstBean;

	    @App
	    NewApp newApp;

	    @ViewById(R.id.tv_hello_world)
	    TextView tvHelloWorld;

	    public SecondActivity() {
		System.out.println("*****************************: SecondActivity");
		System.out.println("*****************************: SecondActivity::message: " + message);
		System.out.println("*****************************: SecondActivity::firstBean: " + firstBean);
		System.out.println("*****************************: SecondActivity::newApp: " + newApp);
		System.out.println("*****************************: SecondActivity::tvHelloWorld: " + tvHelloWorld);
	    }

	    // https://github.com/androidannotations/androidannotations/wiki/Extras#executing-code-after-extras-injection
	    @AfterExtras
	    public void initAfterExtrasInjection() {
		System.out.println("*****************************: SecondActivity::initAfterExtrasInjection");
		System.out.println("*****************************: SecondActivity::message: " + message);
		System.out.println("*****************************: SecondActivity::firstBean: " + firstBean);
		System.out.println("*****************************: SecondActivity::newApp: " + newApp);
		System.out.println("*****************************: SecondActivity::tvHelloWorld: " + tvHelloWorld);
	    }

	    // https://github.com/androidannotations/androidannotations/wiki/Enhance-custom-classes#executing-code-after-dependency-injection
	    @AfterInject
	    public void initAfterInjection() {
		System.out.println("+++++++++++++++++++++++++++++: SecondActivity::initAfterInjection");
		System.out.println("+++++++++++++++++++++++++++++: SecondActivity::message: " + message);
		System.out.println("+++++++++++++++++++++++++++++: SecondActivity::firstBean: " + firstBean);
		System.out.println("+++++++++++++++++++++++++++++: SecondActivity::newApp: " + newApp);
		System.out.println("+++++++++++++++++++++++++++++: SecondActivity::tvHelloWorld: " + tvHelloWorld);
	    }

	    // https://github.com/androidannotations/androidannotations/wiki/Injecting-Views#afterviews
	    @AfterViews
	    void initAfterViewInjection() {
		System.out.println("-----------------------------: SecondActivity::initAfterViewInjection");
		System.out.println("-----------------------------: SecondActivity::message: " + message);
		System.out.println("-----------------------------: SecondActivity::firstBean: " + firstBean);
		System.out.println("-----------------------------: SecondActivity::newApp: " + newApp);
		System.out.println("-----------------------------: SecondActivity::tvHelloWorld: " + tvHelloWorld);
	    }
	}
```

Con esta clase podremos ver que en el constructor no hay nada inicializado. Posteriormente, desde la anotación "AfterExtras" estarán todos los objetos ya inicializados salvo los de UI que quedará inicializado después "AfterViews".

Finalmente en la clase "MainActivity" poner las anotaciones @AfterExtras a un método, @AfterInject a un método y @AfterViews a otro método. Adicionalmente poner sobreescritos los siguientes métodos:

```
	protected void onCreate (Bundle savedInstanceState)
	protected void onStart()
	protected void onResume()
```

En cada uno poner un log y verificar cuál se ha lanzado primero.

### Lanza la aplicación

El orden será de ejecución será:

```
	(1) @AfterExtras
	(2) @AfterInject
	(3) protected void onCreate (Bundle savedInstanceState)
	(4) @AfterViews
	(5) protected void onStart()
	(6) protected void onResume()
```

El orden de inicialización:

&nbsp;&nbsp;&nbsp;- **Constructor**: nunca hay nada inicializado
&nbsp;&nbsp;&nbsp;- **@AfterExtras** y **@AfterInject**: está todo inicializado, menos objetos de UI
&nbsp;&nbsp;&nbsp;- **@AfterViews**: Inicializa los objetos de UI
