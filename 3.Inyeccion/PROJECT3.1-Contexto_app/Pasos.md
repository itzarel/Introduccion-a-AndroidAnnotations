# Práctica #2

Para obtener el contexto de la aplicación emplear la anotación "@RootContext"

<https://github.com/androidannotations/androidannotations/wiki/Enhance-custom-classes#injecting-the-root-context>

Para usarlo poner en la "MainActivity" la siguiente anotación

```
    @RootContext
    Context context;
```

Crear un evento de botón, por ejemplo en el "onCreate()" del "MainActivity"

```
        Button button = findViewById(R.id.customButton_);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getContextInfo();
            }
        });
```

Donde "getContextInfo()" es:

```
    private void getContextInfo() {
        System.out.println("INFO ======> " + context.getApplicationInfo() );
        System.out.println("PACK ======> " + context.getPackageName() );
        System.out.println("PATH ======> " + context.getPackageResourcePath() );
        System.out.println("CONT ======> " + context.getApplicationContext() );
    }
```

Compliar la aplicación, generará un error:

```
	org.androidannotations.annotations.RootContext can only be used in a class annotated with @org.androidannotations.annotations.EBean.
```

Para solucionarlo crearemos un clase con la anotación "@EBean" en el package "com.example.openwebinar.enhancedcomponents.newappication.beans" que se llamará "ContextInfo" y tendrá la notación anteriormente mencionada.

Acontinuación cortaremos el método "getContextInfo()" de "MainActivity" y lo pegaremos en el nuevo bean, haremos el acceso al método público y la clase quedará:

```
	@EBean
	public class ContextInfo {

	    @RootContext
	    Context context;

	    public void getContextInfo() {
		System.out.println("INFO ======> " + context.getApplicationInfo() );
		System.out.println("PACK ======> " + context.getPackageName() );
		System.out.println("PATH ======> " + context.getPackageResourcePath() );
		System.out.println("CONT ======> " + context.getApplicationContext() );
	    }
	}
```

Ahora deberemos instanciar el nuevo bean con la respectiva anotación en la "MainActivity":

```
    @RootContext
    Context context;
```

Y el método "getContextInfo()" será invocado desde el evento de ratón.

Finalmente eliminar la anotación "@RootContext" de la "MainActivity".


Cuando se ejecute la aplicación y se pulse sobre el botón se deberá ver:

```
    INFO ======> ApplicationInfo{e086c53 com.example.openwebinar.enhancedcomponents}
    PACK ======> com.example.openwebinar.enhancedcomponents
    PATH ======> /data/app/com.example.openwebinar.enhancedcomponents-qQIetyANAE-8fDwEhgPIqQ==/base.apk
    CONT ======> com.example.openwebinar.enhancedcomponents.newappication.SubApplication_@5c99990
```
