# Anotacion EApplication

La documentación de esta anotación la veremos en el siguiente enlace:

<https://github.com/androidannotations/androidannotations/wiki/Enhancing-the-Application-class>

Con la anotación "@EApplication" tu puedes crear una subaplicación que podrás correr dentro de tu aplicación principal. La puedes emplear, por ejemplo, para dividir la lógica de la aplicación (para separar los DAO/factorías de la aplicación básica), para administrar excepciones o propósitos extra.

```
	@EApplication
	public class MyApplication extends Application {

	}
```

La clase que esté anotada "@EApplication" podrá ser instanciada con la anotación"@App" que la veremos en próximas clases (<https://github.com/androidannotations/androidannotations/wiki/Enhancing-the-Application-class#injecting-your-application-class>). Por ahora, no veremos la funcionalidad de esta clase.

`-----------------------`

¡! - MUY IMPORTANTE - ¡!


`-----------------------`

Para que la nueva aplicación pueda funcionar correctamente deberemos añadir una nueva linear en el "AndroidManifest.xml" la cual será "android:name" dentro del tag "application".

### (1) Probando la anotación EApplication

Crea un nuevo paquete en "com.example.openwebinar.enhancedcomponents". Lo llamaremos "newappication".
En este path crea una nueva clase llamada "SubApplication" y añade el siguiente código:

```
	@EApplication
	public class SubApplication extends Application {

	    public void onCreate() {
		super.onCreate();
		System.out.println("In creation time: \n\n" +
		        "***************************************************************************\n" +
		        "******************************* Hello World *******************************\n" +
		        "***************************************************************************\n\n");
	    }
	}
```

A continuación abre  "AndroidManifest.xml" y añade

```
	android:name=".newappication.SubApplication_"
```

Es muy importante usar `"_"` porque estamos haciendo referencia a la clase que va a generar AndroidAnnotation.

En la actividad principal añade

```
    @App //We will see in class "Anotación App" from "Inyección" section.
    SubApplication subApplication;
```

Veremos en las próximas clases la anotación *@App*.

### (2) Test it!

Lanza la aplicación en el emulador. En la consola deberías ver el siguiente log:

```
	I/System.out: In creation time:
	    ***************************************************************************
	    ******************************* Hello World *******************************
	    ***************************************************************************
```
