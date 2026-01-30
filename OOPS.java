
class Pen {
    String color;
    String type; // ballpoint gel

    public void write() {
        System.out.println("Writing Something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student { // class name by convention is written with Captial first letter(PascalCase) and
                // Function is written in small first letter (camelCase)

    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(age);
    }
    // Constructor - In java constructor works is to construct Java Objects - Constructor name of a
    // any Class will be the same name as Class.

    // Constructor can be make by three types 1. Non-parameterised, 2. Parameterised 3. 
    
    // 1. Non - Parameterised Constructor - If no constructor is initialsed then java by default
    //  creates one non - parameterised constructor.
    
    // Student(){  // constructor called - Student() is constructor name same as Class name.
    //     System.out.println("Non-Parameterside constructor called");
    // }

    // 2. Parameterised Constructor 
    Student(String name, int age){
        System.out.print("Parameterised Constructor called");
        this.name = name;
        this.age = age;
    }

    // 3. Copy Constructor
    //  A copy constructor in Java is a constructor that creates a new object by copying the 
    //  field values of an existing object of the same class. Unlike languages like C++, Java
    //  does not have a built-in, default copy constructor; you must define it manually. 
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }


}
public class OOPS {
    public static void main(String args[]) {
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Ball Pen";

        // pen1.write();
        // pen1.printColor();

        // Pen pen2 = new Pen();
        // pen2.color = "Red";
        // pen2.type = "Fountain pen";

        // pen2.write();
        // pen2.printColor();

        // Student student1 = new Student();
        // student1.name = "Aman Kumar";
        // student1.age = 22;

        // Student student2 = new Student();
        // student2.name = "Rajan Rana";
        // student2.age = 30;

        // student1.printInfo();
        // student2.printInfo();

        // Parameterised constructor - object name = s1
        Student s1 = new Student("aman", 24);
        s1.printInfo();

        
    }
}
