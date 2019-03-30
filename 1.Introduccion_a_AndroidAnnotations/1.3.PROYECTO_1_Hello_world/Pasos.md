# Creación de un proyecto sin AA

### (1) Crea un nuevo proyecto

Crea un proyecto nuevo con la plantilla "Empty Activity".

Sólo debería haber una unica layaut, si lo hemos dejado por defecto se llamará "activity_main.xml".

### (2) Define los recursos

Abre "strings.xml" y añade:

```
    <string name="tv_first_hello_world">Hello World</string>
    <string name="tv_second_hello_world">Hola Mundo</string>
    <string name="tv_third_hello_world">Salut Monde</string>
    <string name="b_change_tv">Look for your own language</string>
```

### (3) Crea la UI

Abre "activity_main.xml" y añade:

```
    TextView
        id=tv_hello_world
        text=tv_first_hello_world
    Button
        id=b_change_tv
        text=b_change_tv
```

### (4) Lógica de la app

Crea e instancia los previos TextView & Button.
Crea un click event listener. Éste debería cambiar el texto del TextView con los recursos de "strings.xml"definidos anteriormente.

### (5) Execute the app in the emulator

Cuando se haga clic en el botón el texto del TextView deberá cambiar.
