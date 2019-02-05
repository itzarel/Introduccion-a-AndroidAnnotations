# Práctica #4

Se recomienda copiar el proyecto empleado en las clases anteriores

Crear un nuevo layout `avenger.xml`.

Agregar un TextView y debajo 5 LinearLayout en línea para poderles cambiar el color de fondo.

A continuación dentro del paquete "com.example.openwebinar.resources" crearemos uno nuevo llamado "customobjects". En este paquete crearemos una nueva clase "Avenger" y la referenciaremos con el layout empleando la anotación `@EViewGroup(R.layout.avenger)`.

En esta clase deberemos crear los respectivos objetos del Textview y de los LinearLayout. Éstos serán inicializados en un método anotado con `@AfterViews`. Finalmente en esta clase, deberemos crear un método público que permita poner el texto al TextView y el color de fondo a los LinearLayout.

Abrir `activity_main.xml` y añadir 6 objetos de tipo "Avenger", poner cada uno a continuación del otro, de manera vertical y en visibilidad GONE.
En la actividad `MainActivity` en el método anotado con `@AfterViews` inicializar todos los objetos personalizados puestos en el `activity_main.xml`. Después de cada inicialización poner:

```
        if (<IS AVENGER>) {
            <AVENGER>_ avenger;
            avenger = findViewById(R.id.<AVENGER ID>);
            avenger.setVisibility(View.VISIBLE);
            avenger.initAvenger(<AVENGER ACTOR>, <AVENGER HERO>,
				<AVENGER COLOR 1>, <AVENGER COLOR 2>, <AVENGER COLOR 3>, <AVENGER COLOR 4>, <AVENGER COLOR 5>);
            if (<BOOLEAN TO SELECT ANIM>) {
                avenger.startAnimation(flip);
            } else {
                avenger.startAnimation(fade_in);
            }
        }
```

Donde:

```
	<IS AVENGER>       --> Es el booleano que procede de los recursos para mostrar el respectivo vengador.
	<AVENGER>_         --> Es el objeto personalizado creado anteriormente.
	R.id.<AVENGER ID>  --> Es el id del objeto personalizado el cual está declarado en el layout.
	<AVENGER ACTOR>    --> Será el string con el nombre del actor que procede de los recursos.
	<AVENGER HERO>     --> Será el string con el héroe que procede de los recursos.
	<AVENGER COLOR X>  --> Serán los valores con los colores de cada vengador que procede de los recursos.
```

Cuando se lance la aplicación y se cambien los diferentes booleanos existentes, la interfaz cargará unos elementos u otros.
