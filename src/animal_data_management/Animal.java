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

    public Animal() {

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

    private static void displayAnimalInfo(List<Animal> animals) {
        System.out.println("Total number of animals:" + animals.size());
        System.out.println();
        for (Animal animal : animals) {
            animal.display();
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        String loopCondition = "";
        String[] validResponses = {"yes", "y"};
        List<Animal> animals = new ArrayList<>();
        do {
            Animal animal = new Animal();
            animal.inputData();
            animals.add(animal);
            System.out.println("Do you want to enter another animal?(yes/no)");
            loopCondition = br.readLine();
        } while (isValidResponse(loopCondition.toLowerCase(), validResponses));

        displayAnimalInfo(animals);
    }
}
