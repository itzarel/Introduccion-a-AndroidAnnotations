# Anotacion ColorRes

Para esta clase puedes emplear el proyecto que hemos creado en la clase anterior.
El "@BooleanRes" permite obtener un booleano desde la ubicación de los recursos. La documentación de esta anotación la veremos en el siguiente enlace:

<https://github.com/androidannotations/androidannotations/wiki/Resources#other-xxxres>

### Añadiendo los colores

Vamos a añadir los siguientes recursos en `res >> values >> booleans.xml`:

```
    Key = is_infinity_war
	    Value = true
    Key = is_iron_man
	    Value = false
    Key = is_viuda_negra
	    Value = false
    Key = is_capitan_america
	    Value = false
    Key = is_thor
	    Value = false
    Key = is_hulk
	    Value = false
    Key = is_sprider_man
	    Value = false
```

### Inicializando los recursos en el Java

Para inicializar un boolean de Java desde un recurso de booleanos, debe agregar "@BooleanRes" y hay tres formas:

&nbsp;&nbsp;&nbsp;- Utilizando el ID de recurso

&nbsp;&nbsp;&nbsp;- Directamente

&nbsp;&nbsp;&nbsp;- Directamente con más de una variable.

#### Usando el ID de recurso

El identificador del recurso debe estar en el parámetro del "@BooleanRes":

```
    @BooleanRes(R.bool.is_infinity_war)
    boolean isInfinityWarSelected;
```

#### Directamente

El identificador será el nombre de la variable.

```
    @BooleanRes
    boolean is_iron_man;
```

#### Directamente con más de una variable.

La misma filosofía que la opción previa pero con más de una variable.

```
    @BooleanRes
    boolean is_iron_man, is_iron_manb;
```

### Recuperando todos los recursos

A continuación agregaremos este código en la clase `MainActivity`:

```
    @BooleanRes(R.bool.is_infinity_war)
    boolean isInfinityWarSelected;
    @BooleanRes
    boolean is_iron_man, is_viuda_negra, is_capitan_america, is_thor, is_hulk, is_sprider_man;
```

Y actualizaremos el método b`generateAvengerInfo`:

```
    private String generateAvengerInfo(String actor, String heroe, int color1, int color2, int color3, int color4, int color5, boolean isSelected) {
        return actor + " as " + heroe + " with colors [#" + Integer.toHexString(color1).toUpperCase() + ", #" + Integer.toHexString(color2).toUpperCase() + ", #" + Integer.toHexString(color3).toUpperCase() + ", #" + Integer.toHexString(color4).toUpperCase() + ", #" + Integer.toHexString(color5).toUpperCase() + "]. Is " + heroe + " selected? " + isSelected + " \n\n";
    }
```

Finalmente vamos a actualizar el método anotado con `@AfterViews` y dentro del método mostraremos con el debugger todos los recursos que llaman al método anterior (generateAvengerInfo).