public class MethodDemo {
    public static void main(String[] args) {  //Defining the main method
        greet();
        printMessage("This is my message!"); //Printing the message

 }

public static void greet() {
   System.out.println("Hello from the greet method!");  //Printing greet method 
 
}

public static void printMessage(String message) {   //And printing the given passed message
        System.out.println(message);


    }
}