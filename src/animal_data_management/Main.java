package animal_data_management;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main
{
    private static boolean isValidResponse(String response, String[] validResponses) {
        for (String validResponse : validResponses) {
            if (response.equals(validResponse)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException {

        String loopCondition = "";
        String[] validResponses = {"yes", "y"};
        List<Animal> animals = new ArrayList<>();
        do {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Animal animal = new Animal();
            animal.inputData();
            animals.add(animal);
            System.out.println("Do you want to enter another animal?(yes/no)");
            loopCondition = br.readLine();
        } while (isValidResponse(loopCondition.toLowerCase(), validResponses));

        System.out.println("Total number of animals:" + animals.size());
        System.out.println();
        for (Animal animal : animals) {
            animal.display();
            System.out.println();
        }

    }


}
