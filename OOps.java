public class OOps{
    // defining some variables here
    static String name;
    static int age;

    // defining main class static method
    static void set(String n,int a){
        name = n;
        age = a;
    }

    // Method for getting the value displayed
    static void get(){
        System.out.println("The Value of name variable is : " + name);
        System.out.println("The Valeu of age variable is : " + age);
    }

    // defining the main method here
    public static void main(String[] args){
        // Calling the methods directly by the class name
        OOps.set("Ack Wolver", 21);
        OOps.get();
    }
}