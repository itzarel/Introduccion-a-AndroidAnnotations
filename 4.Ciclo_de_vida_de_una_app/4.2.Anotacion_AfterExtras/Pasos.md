# Anotacion AfterExtras

La documentación de esta anotación la veremos en el siguiente enlace:

<https://github.com/androidannotations/androidannotations/wiki/Extras#executing-code-after-extras-injection>

Si necesita ejecutar código después de la inyección de extras, deberás hacer uso de la anotación `@AfterExtras` en sobre el método a usar.

El método anotado **AfterExtras** se iniciará **antes** que el método **onCreate**.

```
  @AfterExtras
  public void doSomethingAfterExtrasInjection() {
    // someExtra and anotherExtra are set to the value contained in the incoming intent
    // if an intent does not contain one of the extra values the field remains unchanged
  }
```