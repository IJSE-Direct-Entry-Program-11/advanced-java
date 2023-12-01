import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE})
public @interface DEPAnnotation /* extends MyInterface */ /* extends SuperAnnotation */ {

    int x = 10;

    public abstract String myAttribute1();
    int myAttribute2() default 10;

//    void doSomething();                   // Attributes | Elements

//    void doSomething() throws Exception;

//    String myMethod(int x);

//    private void doSomething(){}

//    static void doSomething(){}

//    default String myDefaultMethod(){}

}

//interface MyInterface {}

//@interface SuperAnnotation {
//
//}
