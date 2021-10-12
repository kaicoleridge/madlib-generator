import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        //Generates random integer between 1 & 50
        int min = 1; //Min Number
        int max = 100; //Max Number
        int random_num = (int)Math.floor(Math.random()*(max-min+1)+min);
        welcomeMessage();
       askQuestions();
    }

       private static void askQuestions(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = userInput.nextLine();
        System.out.println("Name a place in the world");
        String place = userInput.nextLine();
        System.out.println("Name a animal");
        String animal = userInput.nextLine();
        System.out.println("Name an object");
        String object = userInput.nextLine();
        System.out.println("Name an adjective");
        String adjective = userInput.nextLine();
        System.out.println("Name a second adjective");
        String adjective2 = userInput.nextLine();
        System.out.println("Name an verb");
        String verb1 = userInput.nextLine();
        System.out.println("Name a second verb");
        String verb2 = userInput.nextLine();
        System.out.println("Please wait...");
        timeDelay();
        System.out.println("Generated Libs Completed!");
        System.out.println("--------------------------");
        options();
    }





    public static void welcomeMessage(){
        System.out.println("------------------------------------------");
        System.out.println("Welcome to MAD LIB Game. Developed by Kai Coleridge");
        System.out.println("© 2021, Kai Coleridge \nGitHub: https://github.com/kaicoleridge");
        System.out.println("Twitter: https://twitter.com/kaicoleridge");
        System.out.println("Website: https://coleridge.me");
        System.out.println("------------------------------------------");
    }

    private static void generatedLib1(){
        String generatedStory = "Hello";
        System.out.println(generatedStory);
    }

    private static void generatedLib2(){
        String generatedStory2 = "Hello";
    }

    private static void generatedLib3(){
        String generatedStory3 = "Hello";
    }

    public static void options(){

        String userChoice;

        do {
            System.out.println("Please pick a generated lib");
            System.out.println("⚫ 1 > The First");
            System.out.println("⚫ 2 > The Second");
            System.out.println("⚫ 3 > The Third");
            Scanner sc = new Scanner(System.in);
            userChoice = sc.nextLine();

            switch (userChoice)
            {
                case "1":
                    generatedLib1();
                    break;
                case "2":
                   generatedLib2();
                    break;
                case "3":
                   generatedLib3();
                    break;
                default:
                    System.err.println("Invalid choice. Please pick a number between 1 & 3 to generate lib");
            }
        } while (userChoice != "3");
        }


    private static void timeDelay(){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException exception){
            Thread.currentThread().interrupt();
        }
    }


}
