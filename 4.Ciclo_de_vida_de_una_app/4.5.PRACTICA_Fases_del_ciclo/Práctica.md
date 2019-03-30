# Práctica #3

### Mostrar en el debugger las distintas fases del ciclo

El objetivo será ver las diferentes fases del ciclo de vida en AndroidAnnotations en una aplicación Android. Adicionalmente validar cuándo se inicializan las anotaciones "@Extra", "@Bean" y "@App" y finalmente comparar cuando se ejecutan las anotaciones del ciclo de vida en AndroidAnnotations y de Android (onCreate, onStart, onResume, onPause, onStop, onRestart, onDestroy).

***NOTAS***:
&nbsp;&nbsp;&nbsp;- Para hacer uso de la anotación "@Extra" se debe crear una nueva "Activity" y ser llamada desde la "MainActivity". Además se deberá registrar en el manifest, como una nueva activity.

&nbsp;&nbsp;&nbsp;- Para hacer uso de la anotación "@Bean" se deberá crear una clase con un "@EBean"

&nbsp;&nbsp;&nbsp;- La documentación de la anotación "@AfterInject" dice:

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*When the constructor of your @EBean annotated class is called,*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*it's fields have not been injected yet.*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*If you need to execute code at build time, after dependency injection,*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;*you should use the @AfterInject annotation on some methods.*

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Para validar el correcto funcionamiento de la anotación "@AfterInject" se recomienda crear al menos dos "@EBean".

&nbsp;&nbsp;&nbsp;- Se deberá hacer una nueva aplicación e instanciarla con la anotación @App. Además se deberá registrar en el manifest, dentro de la aplicación.
