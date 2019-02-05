# Anotacion ColorRes

Para esta clase puedes emplear el proyecto que hemos creado en la clase anterior.
El "@AnimationRes" permite obtener una animación desde la ubicación de los recursos. La documentación de esta anotación la veremos en el siguiente enlace:

<https://github.com/androidannotations/androidannotations/wiki/Resources#animationres>

### Añadiendo las animaciones

Vamos a añadir los siguientes recursos en `res >> anim >> zoom_in_animation.xml` y `res >> anim >> zoom_out_animation.xml`:

***zoom_in_animation.xml***

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:fillAfter="true">
    <scale xmlns:android="http://schemas.android.com/apk/res/android"
        android:duration="5000"
        android:fromXScale="1"
        android:fromYScale="1"
        android:pivotX="40%"
        android:pivotY="40%"
        android:toXScale="3"
        android:toYScale="3">
    </scale>
</set>
```

***zoom_out_animation.xml***

```
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:fillAfter="true" >
    <scale
        xmlns:android="http://schemas.android.com/apk/res/android"
        android:duration="5000"
        android:fromXScale="2.0"
        android:fromYScale="2.0"
        android:pivotX="45%"
        android:pivotY="45%"
        android:toXScale="0.6"
        android:toYScale="0.6" >
    </scale>
</set>
```

### Inicializando los recursos en el Java

Para inicializar un boolean de Java desde un recurso de booleanos, debe agregar "@AnimationRes" y hay tres formas:

&nbsp;&nbsp;&nbsp;- Utilizando el ID de recurso

&nbsp;&nbsp;&nbsp;- Directamente

&nbsp;&nbsp;&nbsp;- Directamente con más de una variable.

#### Usando el ID de recurso

El identificador del recurso debe estar en el parámetro del "@AnimationRes":

```
    @AnimationRes(R.anim.zoom_in_animation)
    Animation zoomInAnimation;
```

#### Directamente

El identificador será el nombre de la variable.

```
    @AnimationRes
    Animation zoom_in_animation;
```

#### Directamente con más de una variable.

La misma filosofía que la opción previa pero con más de una variable.

```
    @AnimationRes
    Animation zoom_in_animation, zoom_in_animationb;
```

### Recuperando todos los recursos

A continuación agregaremos este código en la clase `MainActivity`:

```
    @AnimationRes(R.anim.zoom_in_animation)
    Animation zoomInAnimation;
    @AnimationRes
    Animation zoom_in_animation;
```

Finalmente vamos a actualizar el método anotacon con "@AfterViews":

```
        System.out.println("=============================> zoomInAnimation: " + zoomInAnimation + "\n\n" +
                           "=============================> zoom_in_animation: " + zoom_in_animation + "\n\n");
```