import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numberOfDogs = 0;
        int numberOfCats = 0;

        Cat[] cats = new Cat[10];
        Dog[] dogs = new Dog[10];

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

                    cats[numberOfCats] = (createCat(name,color));
                    numberOfCats++;
                    break;
                case 'b':
                    System.out.print("Name = ");
                    Scanner scn1 = new Scanner(System.in);
                    String dogName = scn1.nextLine();
                    System.out.print("Color = ");
                    String dogColor = scn1.nextLine();
                    dogs[numberOfDogs] = (createDog(dogName,dogColor));
                    numberOfDogs++;
                    break;
                case 'c':
                    if (numberOfCats==0)break;
                    for (int i = 0; i < numberOfCats; i++) {
                        System.out.println(cats[i]);
                    }
                    break;
                case 'd':
                    if (numberOfDogs==0)break;
                    for (int i = 0; i < numberOfDogs; i++) {
                        System.out.println(dogs[i]);
                    }
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

    public static void printDogs(Dog... dogs){
        for (Dog dog:dogs
             ) {
            System.out.println(dog);
        }
    }
    public static void printCats(Cat... cats){
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
