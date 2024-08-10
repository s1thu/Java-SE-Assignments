package animal_data_management;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Set;

public class Animal {

    String name;
    int age;
    String species;

    public Animal() {

    }

    public void inputData() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
}
