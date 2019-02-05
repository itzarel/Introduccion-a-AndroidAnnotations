# Anotacion EActivity

La documentación de esta anotación la veremos en el siguiente enlace:

<https://github.com/androidannotations/androidannotations/wiki/Enhance-activities#eactivity>

La anotación "@EActivity" es de las anotaciones más importantes porque indica que la actividad que lleve esta anotación estará mejorada por AndroidAnnotations.
Necesita un parámetro de entrada que será el layout id con el cual la actividad estará enlazada a la UI. El ejemplo de uso será el siguiente:

```
	@EActivity(R.layout.main)
	public class MyActivity extends Activity {
		//...
	}
```

Este id se puede dejar en blanco por lo cual no se seteará ningun layout a la actividad.
Esto nos permite que de manera programática la podamos configurar por ejemplo en el método "onCreate()". Un ejemplo de uso sería:

```
	@EActivity
	public class MyListActivity extends ListActivity {

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	    }

	}
```

Definiremos los siguientes layouts para poder validar el comportamiento dicho anteriormente:

&nbsp;&nbsp;&nbsp;- activity_main.xml   --> Default

&nbsp;&nbsp;&nbsp;- activity_second.xml --> With a default button

&nbsp;&nbsp;&nbsp;- activity_third.xml  --> With a default switch

Añade y lanzar los diferentes layouts. Lo podrás hacer programáticamente o manualmente:

```
	    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/**You can select the layout programatically*/
	    //      setContentView(R.layout.activity_main);
	    //      setContentView(R.layout.activity_second);
		    setContentView(R.layout.activity_third);
	    }
```


Recuerda que cuando empleamos AA en alguna clase se generará un nuevo main y éste deberá ser invocado desde el "AndroidManifest.xml".