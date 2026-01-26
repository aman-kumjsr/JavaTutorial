
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
    // Constructor can be make by three types 1. Non-parameterised, 2. Parameterised 3. 
    
    // 1. Non - Parameterised Constructor
    
    // Student(){
    //     System.out.println("Non-Parameterside constructor called");
    // }

    // 2. Parameterised Constructor 
    // 
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

        Student student1 = new Student();
        student1.name = "Aman Kumar";
        student1.age = 22;

        Student student2 = new Student();
        student2.name = "Rajan Rana";
        student2.age = 30;

        student1.printInfo();
        student2.printInfo();
    }
}
