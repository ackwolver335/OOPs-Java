public class OOps{
    // defining some variables here
    static String name;
    static int age;
    int id;

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
        OOps obj1 = new OOps();
        obj1.id = 23;
        System.out.println("Value of Default variable id : " + obj1.id);            // Created an object

        // Creating an Object as another example
        cat obj2 = new cat("Mandy","American",12,"White");
        System.out.println(obj2.getall());
    }
}

class cat{
    // Default Data Members or Instances
    String name;
    String breed;
    int age;
    String colour;
    
    // defining the constructor
    public cat(String name,String breed,int age,String colour){
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.colour = colour;
    }

    // Defining different methods of it
    public String getname() { return name; }
    public String getbreed() { return breed; }
    public int getage() { return age; }
    public String getclr() { return colour; }

    public String getall(){
        return ("Hi my name is : " + name + "\nMy Breed is : " +  breed + "\nMy Age is : " + age + "\nMy Colour is : " + colour);
    }
}