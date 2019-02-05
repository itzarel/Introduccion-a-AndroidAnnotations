# Tests

## Pregunta 1

#### ¿En qué entorno está basado Android Studio?

1. IntelliJ

2. Eclipse

3. Netbeans

4. Visual Studio

> Respuesta [ 1 ]

## Pregunta 2

#### ¿Qué necesitamos en el build.gradle para añadir las dependencias de AA?

1. annotationProcessor - implementation

2. annotationProcessor - compile

3. compile - implementation

4. Las importaciones se hacen en el app.gradle

> Respuesta [ 1 ]

## Pregunta 3

#### ¿Si al compilar obtienes el siguiente error `error: The AndroidManifest.xml file contains the original component, and not the AndroidAnnotations generated component. Please register MainActivity_ instead of MainActivity` qué deberemos modificar?

1. AndroidAnnotations, Tag: category

2. AndroidAnnotations, Tag: intent-filter

3. Hay que cambiar el nombre de la actividad MainActivity

4. AndroidAnnotations, Tag: activity

> Respuesta [ 4 ]

## Pregunta 4

#### ¿Cuál es el path donde se genera el código de AA?

1. app/build/generated/source/buildConfig/debug/com/example/openwebinar/installingandroidannframework

2. app/src/main/java/com/example/openwebinar/installingandroidannframework

3. app/build/generated/source/apt/debug/com/example/openwebinar/installingandroidannframework

4. app/src/main/res/values

> Respuesta [ 3 ]

## Pregunta 5

#### ¿Con qué anotación podemos crear una subaplicación?

1. EBean

2. EApplication

3. EView

4. EActivity

> Respuesta [ 2 ]

## Pregunta 6

#### ¿Con que anotación podemos crear un bean?

1. EBean

2. EApplication

3. EView

4. EActivity

> Respuesta [ 1 ]

## Pregunta 7

#### ¿Con que anotación podemos recibir un mensaje de la clase llamante?

1. Bean

2. Extra

3. App

4. StringRes

> Respuesta [ 2 ]

## Pregunta 8

#### ¿Cómo podemos enviar un mensaje a un determinado método de la clase llamada?

1. Con la anotación Extra

2. <ACTIVITY_GENERATED_ANDROID_ANN>.intent(this).myMessage(<MESSAGE_ONE>, <MESSAGE_TWO>).start();

3. <ACTIVITY_GENERATED_ANDROID_ANN>_.intent(this).myMessage(<MESSAGE_ONE>, <MESSAGE_TWO>).start();

4. <ACTIVITY_GENERATED_ANDROID_ANN>_.intent(this).myMessage(<MESSAGE>).start();

> Respuesta [ 3 ]

## Pregunta 9

#### ¿Como se instancia una subaplicación?

1. EApplication

2. Bean

3. Extra

4. App

> Respuesta [ 4 ]

## Pregunta 10

#### ¿Con qué anotación podemos podemos recuperar la información del contexto?

1. GetContext

2. RootContext

3. Context

4. GetRoot

> Respuesta [ 2 ]

## Pregunta 11

#### ¿Qué método se llamara después de `onCreate(Bundle)` o después de `onRestart()` cuando la actividad se ha detenido?

1. onCreate

2. onStart

3. onResume

4. onRestart

> Respuesta [ 2 ]

## Pregunta 12

#### ¿Qué método se llama después de `onStop()` cuando la actividad actual se muestra al usuario?

1. onCreate

2. onStart

3. onResume

4. onRestart

> Respuesta [ 4 ]

## Pregunta 13

#### ¿Que se llama después de `onRestoreInstanceState(Bundle)`, `onRestart()` o `onPause()`?

1. onCreate

2. onStart

3. onResume

4. onRestart

> Respuesta [ 3 ]

## Pregunta 14

#### ¿Quién destruye un proceso de una aplicación?

1. La propia app

2. Android

3. Garbage collector

4. Java

> Respuesta [ 2 ]

## Pregunta 15

#### ¿Donde se crea y ejecuta una aplicación?

1. Dentro de un proceso Linux

2. Dentro de Android

3. Dentro de un contenedor

4. En Internet

> Respuesta [ 1 ]

## Pregunta 16

#### ¿Qué anotación se ejecuta antes del onCreate?

1. AfterInject, AfterViews

2. AfterViews

3. AfterExtras

4. AfterExtras, AfterInject

> Respuesta [ 4 ]

## Pregunta 17

#### ¿Qué método asegura la inicialización de los objetos de UI?

1. AfterInject

2. AfterViews

3. AfterExtras

4. Los objetos de UI están inicializados desde el comienzo de la app

> Respuesta [ 2 ]

## Pregunta 18

#### ¿Cuál es el orden correcto de ejecución?

1. AfterInject, AfterExtras, onCreate, AfterView, onStart, onResume

2. AfterExtras, AfterInject, onCreate, AfterView, onResume, onStart

3. AfterExtras, AfterInject, onCreate, AfterView, onStart, onResume

4. AfterExtras, AfterView, AfterInject

> Respuesta [ 3 ]

## Pregunta 19

#### ¿Asegura @AfterExtras y @AfterInject asegura que esté todo inicializado?

1. No

2. Sí

3. Podría ser

4. Está todo inicializado, menos objetos de UI

> Respuesta [ 4 ]

## Pregunta 20

#### ¿Qué permite recuperar un booleano desde los recursos?

1. StringRes

2. ColorRes

3. BooleanRes

4. AnimationRes

> Respuesta [ 3 ]

## Pregunta 21

#### ¿Qué permite recuperar un número entero?

1. StringRes

2. ColorRes

3. BooleanRes

4. AnimationRes

> Respuesta [ 2 ]

## Pregunta 22

#### ¿Qué permite recuperar una animación?

1. StringRes

2. ColorRes

3. BooleanRes

4. AnimationRes

> Respuesta [ 4 ]

## Pregunta 23

#### ¿Quién da el soporte a Android Studio?

1. Apple

2. Solaris

3. Microsoft

4. Google

> Respuesta [ 4 ]

## Pregunta 24

#### ¿Donde puedo ver la versión más reciente de AA?

1. <http://androidannotations.org/>

2. <https://github.com/androidannotations/androidannotations/wiki/ReleaseNotes>

3. <https://developer.android.com/studio/>

4. <https://gradle.org/>

> Respuesta [ 2 ]

## Pregunta 25

#### ¿Donde puedo ver las anotaciones disponibles?

1. <https://github.com/androidannotations/androidannotations/wiki/CustomizeAnnotationProcessing>

2. <https://github.com/androidannotations/androidannotations/wiki/Cookbook>

3. <https://github.com/androidannotations/androidannotations/wiki/AvailableAnnotations>

4. <https://github.com/androidannotations/androidannotations/wiki/Configuration>

> Respuesta [ 3 ]

## Pregunta 26

#### ¿Qué aplicación se lanza sobre el terminal o emulado?

1. La app que desarrollamos nosotros

2. Ninguna app se ejecuta, son los padres

3. La unión de las dos aplicaciónes

4. La app que genera AA

> Respuesta [ 3 ]

## Pregunta 27

#### ¿Dónde puedo consulta la documentación de la anotación EApplication?

1. <https://github.com/androidannotations/androidannotations/wiki/Enhancing-the-Application-class>

2. <https://github.com/androidannotations/androidannotations/wiki/Enhance-custom-classes>

3. <https://github.com/androidannotations/androidannotations/wiki/Enhance-Fragments>

4. <https://github.com/androidannotations/androidannotations/wiki/Enhance-activities>

> Respuesta [ 1 ]

## Pregunta 28

#### ¿Dónde se puede buscar dudas sobre AA?

1. <https://github.com/androidannotations/androidannotations/wiki/FAQ>

2. <https://github.com/androidannotations/androidannotations/issues>

3. <https://stackoverflow.com/questions/tagged/android-annotations>

4. <https://gitter.im/androidannotations/androidannotations>

> Respuesta [ 1, 2, 3, 4 ]

## Pregunta 29

#### ¿Dónde puedo consultar el código de AA?

1. <https://bitbucket.org/>

2. <https://subversion.apache.org/>

3. <https://git-scm.com/>

4. <https://github.com>

> Respuesta [ 4 ]