import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

// The class name must match the filename "Bogie.java"
public class Bogie { 
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public void display() {
        System.out.println("Bogie: " + name + " | Capacity: " + capacity);
    }

    // Move the main method inside the class named 'Bogie'
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Bogie> bogieList = new ArrayList<>();

        bogieList.add(new Bogie("Sleeper", 72));
        bogieList.add(new Bogie("AC Chair", 56));

        System.out.println("--- Train Consist Summary ---");
        for (Bogie b : bogieList) {
            b.display();
        }
        scanner.close();
    }
}
