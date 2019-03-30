# Anotacion AfterViews

La documentaci?n de esta anotaci?n la veremos en el siguiente enlace:

<https://github.com/androidannotations/androidannotations/wiki/Injecting-Views#afterviews>

La anotaci?n `@AfterViews` indica que se debe llamar al m?todo que tenga dicha anotaci?n despu?s de que se haya **realizado el binding de vistas**. Puedes anotar m?ltiples m?todos con @AfterViews.

El m?todo anotado **AfterInject** se iniciar? **después** del m?todo **onCreate**. La sucesi?n de ejecuci?n ser? la siguiente:

```
\---------------- m?todo anotado con AfterExtras
   |------------- m?todo anotado con AfterInject
      |---------- onCreate
         |------- m?todo anotado con AfterView
            |---- onStart
               |- onResume
```

***NOTA A TENER EN CUENTA PR?XIMAS CLASES***: Cuando se llama a `onCreate()`, los campos `@ViewById` a?n no est?n configurados. Por lo tanto, puedes usar `@AfterViews` para escribir c?digo que dependa de las vistas.

```
    @AfterViews
    void updateTextWithDate() {
        // Do something
    }
```


Don't forget that you should not use any "@ViewById" (we will see it in next classes) annotated object in onCreate():

***IMPORTANTE***: No olvides que no se debe usar ning?n objeto anotado `@ViewById` (lo veremos en las siguientes clases) en onCreate() ya que no estar? incializado:

```
	@EActivity(R.layout.main)
	public class MyActivity extends Activity {

	    @ViewById
	    TextView myTextView;

	    @Override
	    public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// DON'T DO THIS !! It will throw a NullPointerException, myTextView is not set yet.
		// myTextView.setText("Date: " + new Date());
	    }
```

Puedes asumir con seguridad que los campos `@ViewById`, `@Extra`, etc. ya estar?n inicializados en los m?todos anotados con @AfterViews.