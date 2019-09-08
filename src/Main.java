import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numberOfDogs = 0;
        int numberOfCats = 0;

        List<Cat> cats = new ArrayList<>(0);
        List<Dog> dogs = new ArrayList<>(0);


        boolean stayInLoop = true;
        while (stayInLoop) {

            printChoices();
            char choice = makeAChoice();

            switch (choice) {
                case 'a':
                    System.out.print("Name = ");
                    Scanner scn = new Scanner(System.in);
                    String name = scn.nextLine();
                    System.out.print("Color = ");
                    String color = scn.nextLine();

                    cats.add(createCat(name,color));
                    break;
                case 'b':
                    System.out.print("Name = ");
                    Scanner scn1 = new Scanner(System.in);
                    String dogName = scn1.nextLine();
                    System.out.print("Color = ");
                    String dogColor = scn1.nextLine();
                    dogs.add(createDog(dogName,dogColor));
                    break;
                case 'c':
                    printCats(cats);
                    break;
                case 'd':
                    printDogs(dogs);
                    break;
                case 'q':
                    stayInLoop = false;
                    break;
            }
        }
    }
    public static void printChoices(){

        System.out.println("a) Add cat");
        System.out.println("b) Add dog");
        System.out.println("c) List cats");
        System.out.println("d) List dogs");
        System.out.println("q) Quit Program");

    }

    public static void printDogs(List<Dog> dogs){
        for (Dog dog:dogs
             ) {
            System.out.println(dog);
        }
    }
    public static void printCats(List<Cat> cats){
        for (Cat cat:cats
        ) {
            System.out.println(cat);
        }
    }
    public static char makeAChoice(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Select a letter which represent your choice");
        while (!scn.hasNext("[abcdq]")){
            System.out.println("Your input is not valid.");
            printChoices();
            System.out.println("Select a letter which represent your choice");
            scn.next();
        }
        char myChar = scn.next().charAt(0);
        return myChar;
    }

    public static Dog createDog(String name, String color){

        return new Dog(name,color);
    }
    public static Cat createCat(String name, String color){

        return new Cat(name,color);
    }



}
