# Anotacion AfterInject

La documentación de esta anotación la veremos en el siguiente enlace:

<https://github.com/androidannotations/androidannotations/wiki/Enhance-custom-classes#executing-code-after-dependency-injection>

Permite ejecutar código después de la inyección de dependencias, debe usar la anotación `@AfterInject` en algunos métodos que necesiten dependencias ya añadidas.

El método anotado **AfterInject** se iniciará **antes** que el método **onCreate**.

```
  @AfterInject
  public void doSomethingAfterInjection() {
    // notificationManager and dependency are set
  }
```