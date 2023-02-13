 class A{

    void display(){
        System.out.println("This is display method with zero parameter.");
    }

    void display(String name){  
        System.out.println("Display method with one parameter, Name = "+name);
    }

    void display(String name, int age){
        System.out.println("Display method with two parameter, Name = "+name + " and age = " +age);
    }
}

 class MethodOverloading{

   
    public static void main(String[] args){
        A ob=new A();
        ob.display();
        ob.display("Sumit");            //Method Overloading
        ob.display("Amit", 30);     //Method Overloading
       
    }
}