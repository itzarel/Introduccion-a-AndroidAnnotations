# Anotacion App

La documentación de esta anotación la veremos en el siguiente enlace:

<https://github.com/androidannotations/androidannotations/wiki/Enhancing-the-Application-class#injecting-your-application-class>

Esta anotación te permitirá llamar a otra aplicación. Recuerda que en el manifest debe estar registrada la nuva app, por ejemplo:

```
    <application
        android:name=".newappication.SubApplication_"
```

En la clase "MainActivity" debremos añadir:

```
    @App
    SubApplication subApplication;
```

Con esta nueva anotación tú podrás llamar a los métodos de la app "SubApplication".
