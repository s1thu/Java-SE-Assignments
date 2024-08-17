package animal_data_management;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Animal {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name;
    int age;
    String species;
    private static int count;

    public Animal() {
count = count + 1;
    }

    public void inputData() throws IOException {
        System.out.print("Enter animal name:");
        this.name = br.readLine();
        System.out.print("Enter animal age:");
        this.age = Integer.parseInt(br.readLine());
        System.out.print("Enter animal species:");
        this.species = br.readLine();
    }

    void display(){
        System.out.println("Enter animal name:" + name);
        System.out.println("Enter animal age:" + age);
        System.out.println("Enter animal species:" + species);
    }

    private static boolean isValidResponse(String response, String[] validResponses) {
        for (String validResponse : validResponses) {
            if (response.equals(validResponse)) {
                return true;
            }
        }
        return false;
    }

    public static int getCount() {
        return count;
    }

    private static void displayAnimalInfo(Animal[] animals) {
        System.out.println("Total number of animals:" + getCount());
        System.out.println();
        //loop though animals and display their information
      for(int i = 0; i < getCount(); i++){
          animals[i].display();
          System.out.println();
      }
    }

    public static void main(String[] args) throws IOException {
        String loopCondition = "";
        String[] validResponses = {"yes", "y"};
        Animal[] animals = new Animal[100];

        do {
            Animal animal = new Animal();
            animal.inputData();
            animals[animal.getCount() - 1] = animal;
            System.out.println("Do you want to enter another animal?(yes/no)");
            loopCondition = br.readLine();
        } while (isValidResponse(loopCondition.toLowerCase(), validResponses));

        displayAnimalInfo(animals);
    }
}
