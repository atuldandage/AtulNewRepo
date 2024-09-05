package com.collection;
import java.util.ArrayList;

public class NameManager {
    // Declare ArrayList as a class field
      private ArrayList<String> names;
  private static int a;
    // Constructor to initialize the ArrayList
    public NameManager() {
       names = new ArrayList<>();
       
       System.out.println(a);
    }

    // Method to add a name to the ArrayList
    public void addName(String name) {
    	names.add(name);
    }

    // Method to print all names in the ArrayList
    public void printNames() {
       System.out.println("Names in the list: " + names);
    }

    public static void main(String[] args) {
        // Create an instance of NameManager
        NameManager manager = new NameManager();

        // Add names to the ArrayList
        manager.addName("Alice");
        manager.addName("Bob");
        manager.addName("Charlie");
        NameManager.a=23;
        // Print the names in the ArrayList
       manager.printNames();
      
       
    }
}
