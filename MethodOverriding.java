class A{
    int a=10;
    void show(){
        System.out.println("I am in Class A.");
    }
}
class B extends A{
    int a=20;
    void show(){
        System.out.println("I am in Class B.");
    }
}
class C extends B{
    int a=30;
    void show(){
        System.out.println("I am in Class C.");
    }
}
public class MethodOverriding {
    public static void main(String[] args){

        A ob=new A();
        ob.show();
        System.out.println("a = " +ob.a);

        C ob1=new C();
        ob1.show();
        System.out.println("a = " +ob1.a);

        B ob2=new B();
        ob2.show();
        System.out.println("a = " +ob2.a);

        A ob3=new C();                           //Method Overriding (Parent reference is holding child object).  
        ob3.show();                              //it is refer to child method.
        System.out.println("a = "+ob3.a);        //it refers data members of parents class.
     }
}
