# Anotacion EBean

La documentación de esta anotación la veremos en el siguiente enlace:

<https://github.com/androidannotations/androidannotations/wiki/Enhance-custom-classes>

Con la anotación "@EBean" procederemos a crear beans. Éstos son fragmentos de lógica atomica, es decir independientes de la demás lógica.

La principal diferencia entre ésta y "@EApplication" es que "@EBean" no es una aplicación en si sino que es un fragmento de lógica.

Puedes usar esta anotación en clases que no son componentes standard de Android (como una Activity o un Service).

```
	@EBean
	public class MyClass {

	}
```

Las clases anotadas "@EBean" serán instanciadas con la anotación "@Bean" que la veremos en próximas clases (<https://github.com/androidannotations/androidannotations/wiki/Enhance-custom-classes#injecting-enhanced-classes>). Por ahora, no veremos la funcionalidad de esta clase.

### (1) Usando la anotación EBean

Crea un nuevo paquete  en "com.example.openwebinar.enhancedcomponents.newappication" y lo llamaremos "beans".
En ese path crearemos una nueva clase Java llamada "RandomNumbers" y añade el siguiente código:

```
	@EBean
	public class RandomNumbers {

	    RandomNumbers() {
		System.out.println("In creation time: \n\n" +
		        "***************************************************************************\n" +
		        "******************************* Bean created ******************************\n" +
		        "***************************************************************************\n\n");
	    }
	}
```

Los beans no son necesarios registrarlos en el manifest.

En la clase  "SubApplication" añadiremos

```
    @Bean //We will see in class "Anotación Bean" from "Inyección" section.
    RandomNumbers randomNumbers;
```

La anotación "@Bean" la veremos en próximas clases.

### (2) Test it!

Lanza la aplicación en el emulador. En la consola deberías ver el siguiente log:

```
	I/System.out: In creation time:
	    ***************************************************************************
	    ******************************* Bean created ******************************
	    ***************************************************************************
```
