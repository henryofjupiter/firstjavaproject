import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)

    public static void main(String[] args) {
        String userInput;


        initializeDogList();
        initializeMonkeyList();
        Scanner scanner = new Scanner(System.in);

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods
        // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.
        while (true) {
            displayMenu();
            userInput = scanner.next();
            if (userInput.equals("q")) {
                break;
            }
            else if (userInput.equals("1")) {
                intakeNewDog(new Scanner(System.in));

            }
            else if (userInput.equals("2")) {
                intakeNewMonkey(new Scanner(System.in));
            }
            else if (userInput.equals("3")) {
                reserveAnimal(new Scanner(System.in));
            }

        }

    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey0 = new Monkey( "Sky", "Capuchin", "male", "1", "25.6", "13inches", "14 feet", "16 inches", "05-12-2019", "United States", "intake", false, "Russia");

        monkeyList.add(monkey0);
    }


    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(@NotNull Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n");
                return; //returns to menu
            }
        }

        // Add the code to instantiate a new dog and add it to the appropriate list
        Dog dog4 = new Dog();

        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the dog's acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What is the dog's acquisition country?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the dog's training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("What is the dog's reserve?");
        boolean reserve = scanner.nextBoolean();

        System.out.println("What is the dog's in-service country?");
        String inServiceCountry = scanner.nextLine();

        dog4.setName(name);
        dog4.setBreed(breed);
        dog4.setGender(gender);
        dog4.setAge(age);
        dog4.setWeight(weight);
        dog4.setAcquisitionDate(acquisitionDate);
        dog4.setAcquisitionLocation(acquisitionCountry);
        dog4.setTrainingStatus(trainingStatus);
        dog4.setReserved(reserve);
        dog4.setInServiceCountry(inServiceCountry);
        dogList.add(dog4);

    }


    // Complete intakeNewMonkey
    //Instantiate and add the new monkey to the appropriate list
    // For the project submission you must also  validate the input
    // to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(@NotNull Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for(Monkey monkey: monkeyList) {
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n");
                return;
            }

            Monkey monkey1 = new Monkey();

            System.out.println("What is the monkey's species?");
            String species = scanner.nextLine();

            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();

            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();

            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();

            System.out.println("What is the monkey's acquisition date?");
            String acquisitionDate = scanner.nextLine();

            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scanner.nextLine();

            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();

            System.out.println("What is the monkey's reserve?");
            boolean reserve = scanner.nextBoolean();

            System.out.println("What is the monkey's in-service country?");
            String inServiceCountry = scanner.nextLine();

            monkey1.setAge(age);
            monkey1.setSpecies(species);
            monkey1.setGender(gender);
            monkey1.setWeight(weight);
            monkey1.setAcquisitionDate(acquisitionDate);
            monkey1.setAcquisitionLocation(acquisitionCountry);
            monkey1.setTrainingStatus(trainingStatus);
            monkey1.setReserved(reserve);
            monkey1.setInServiceCountry(inServiceCountry);
            monkeyList.add(monkey1);

        }
    }

    // Complete reserveAnimal
    // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(@NotNull Scanner scanner) {
        System.out.println("Input Animal for Reserve");
        String reserve = scanner.nextLine();


    }

    // Complete printAnimals
    // Include the animal name, status, acquisition country and if the animal is reserved.
    // Remember that this method connects to three different menu items.
    // The printAnimals() method has three different outputs
    // based on the listType parameter
    // dog - prints the list of dogs
    // monkey - prints the list of monkeys
    // available - prints a combined list of all animals that are
    // fully trained ("in service") but not reserved
    // Remember that you only have to fully implement ONE of these lists.
    // The other lists can have a print statement saying "This option needs to be implemented".
    // To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals() {
        System.out.println("The method printAnimals needs to be implemented");

    }
}

