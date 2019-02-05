# Repetición del anterior proyecto pero con AA

Ahora crearemos un nuevo proyecto pero con los mismos objetos de UI que en la anterior aplicación.
Puedes crear un nuevo proyecto o copiar el anterior.

### (1) Añade las dependencias

Añade en "app/build.gradle"

```
def AAVersion = '4.5.2'
	dependencies {
	    annotationProcessor "org.androidannotations:androidannotations:$AAVersion"
	    implementation "org.androidannotations:androidannotations-api:$AAVersion"
	}
```

Build project: Gradle > (root) > Tasks > Build > build

### (2) Añade las anotaciones

¡!***IMPORTANTE***¡! - Veremos todas las anotaciones aquí explicadas en próximas clases.

Añade en la definición de la clase:

```
	@EActivity(R.layout.activity_main)
```

Elimina:

```
	Button bChangeTv = null;
```

Y cambia:

```
	TextView tvHelloWorld = null; -->  @ViewById(R.id.tv_hello_world)
                                       TextView tvHelloWorld;

	String englishHelloWorld = null; -->  @StringRes(R.string.tv_first_hello_world)
                                          String englishHelloWorld;
	String spanishHelloWorld = null	 -->  @StringRes(R.string.tv_second_hello_world)
                                          String spanishHelloWorld;
	String frenchHelloWorld = null;  -->  @StringRes(R.string.tv_third_hello_world)
                                          String frenchHelloWorld;
```

Elimina el resto de código como por ejemplo "onCreate" salvo el método ****bChangeTvEvent***.

```
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
```

En el método "bChangeTvEvent" añade la anotación que se muestra a continuación pero mantén el ámbito del método como "private"

```
	@Click(R.id.b_change_tv)
```

Nuestro código ya está finalizado, vamos a optimizar los import no usados:

```
	IntelliJ (or Android Studio) --> ctrl + alt + o
```

A continuación compilaremos la aplicación y obtendremos el siguiente error:

```
Build project: Gradle > (root) > Tasks > Build > build
	BUILD FAILED in Xs
        	<project_path>/app/src/main/java/com/example/openwebinar/installingandroidannframework/MainActivity.java:37: warning: Element bChangeTvEvent() invalidated by ClickHandler
                private void bChangeTvEvent() {
                             ^
```

Este error es debido a que el ambito del método *bChangeTvEvent* es privado y para AA los métodos deberán ser sin modificador de ámbito:

```
		─────────────────────────────────────────────────────────────
			        │ Class │ Package │ Subclass │ Subclass │ World
			        │       │         │(same pkg)│(diff pkg)│
		────────────┼───────┼─────────┼──────────┼──────────┼────────
		public      │   y   │    y    │    y     │     y    │   y
		────────────┼───────┼─────────┼──────────┼──────────┼────────
		protected   │   y   │    y    │    y     │     y    │   n
		────────────┼───────┼─────────┼──────────┼──────────┼────────
		no modifier │   y   │    y    │    y     │     n    │   n
		────────────┼───────┼─────────┼──────────┼──────────┼────────
		private     │   y   │    n    │    n     │     n    │   n
		─────────────────────────────────────────────────────────────
		y - accessible
		n - not accessible
```
**Via**: <https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html>

Es **necesario** dejar el método **sin modificador de ámbito** o por defecto para que **AA** pueda **generar y acceder** a nuestros métodos desde sus clases generadas, las que concluyen con "`_`" (por ejemplo"`MainActivity_`").

Por ello eliminaremos la palabra reservada "private" del método "bChangeTvEvent", volveremos a compilar y obtendremos:

```
	BUILD SUCCESSFUL in Xs
```

### (3) Execute the app in the emulator

El comportamiento debería ser el mismo que en el proyecto anterior pero con menos código.

