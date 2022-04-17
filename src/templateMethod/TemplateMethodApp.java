package templateMethod;

public class TemplateMethodApp {
    public  static void main(String[] args){
//        A a = new A();
//        a.method();
//
//        System.out.println();
//
//        B b = new B();
//        b.method();

        C a = new A();
        a.templateMethod();
        System.out.println();

        C b = new B();
        b.templateMethod();
    }
}

abstract class C{
    void templateMethod() {
        System.out.print("1");
        differ();
        System.out.print("3");

    }
    abstract void differ();
}

class A extends C{
    void differ(){
        System.out.print("2");
    }
}
class B extends C{
    void differ(){
        System.out.print("4");
    }

//
//class A{
//    void method(){
//        System.out.print("1");
//        System.out.print("2");
//        System.out.print("3");
//    }
//}
//class B{
//    void method(){
//        System.out.print("1");
//        System.out.print("4");
//        System.out.print("3");
//    }
}