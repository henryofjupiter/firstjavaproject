import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    public static String[] monkeySpecies = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin"};

    // Instance variables (if needed)
    public static void main(String[] args) {

        String userInput;

        initializeDogList();
        initializeMonkeyList();
        Scanner scanner = new Scanner(System.in);

        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        while (true) {
            displayMenu();
            userInput = scanner.next();


            if (userInput.equals("q")) {
                break;
            } else if (userInput.equals("1")) {
                intakeNewDog(new Scanner(System.in));

            } else if (userInput.equals("2")) {
                intakeNewMonkey(new Scanner(System.in));
            } else if (userInput.equals("3")) {
                reserveAnimal(new Scanner(System.in));
            }
            else if (userInput.equals("4")) {
                printAnimals();
            }
            else if(userInput.equals("5")) {
                System.out.println("This option needs to be implemented");
            }
            else if(userInput.equals("6")) {
                System.out.println("This option needs to be implemented");
            }
            else {
                System.out.println("Error, try again");
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
        Dog dog1 = new Dog("Dog", "Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Dog","Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Dog","Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
        Monkey monkey0 = new Monkey( "Monkey", "Capuchin", "Sky", "male", "1", "25.6", "13inches", "14 feet", "16 inches", "05-12-2019", "United States", "intake", false, "Russia");

        monkeyList.add(monkey0);
    }

    // The input validation to check that the dog is not already in the list
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

        System.out.print("What is the animal type (dog or monkey)?");
        String animalType = scanner.nextLine();

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

        System.out.println("What is the dog's in-service country?");
        String inServiceCountry = scanner.nextLine();

        System.out.println("What is the dog's reserve?");
        boolean reserve = scanner.nextBoolean();

        dog4.setAnimalType(animalType);
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

    //Instantiate and add the new monkey to the appropriate list
    //and validates input

    public static void intakeNewMonkey(@NotNull Scanner scanner) {
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine().trim();

        //returns to menu if monkey species isn't in array
        for (String monkeySpecy : monkeySpecies) {
            if (monkeySpecies[0].equalsIgnoreCase(species)) {
            } else if (monkeySpecies[1].equalsIgnoreCase(species)) {
            } else if (monkeySpecies[2].equalsIgnoreCase(species)) {
            } else if (monkeySpecies[3].equalsIgnoreCase(species)) {
            } else if (monkeySpecies[4].equalsIgnoreCase(species)) {
            } else if (monkeySpecies[5].equalsIgnoreCase(species)) {
            } else {
                System.out.println("Monkey species not accepted");
                return;
            }
        }

        //returns to menu if monkey name is already in array list
        for(Monkey monkey: monkeyList) {
            System.out.println("What is the monkey's name?");
            String name = scanner.nextLine();

            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n");
                return;
            }

            Monkey monkey1 = new Monkey();

            System.out.println("What is the animal type? (dog or monkey)");
            String animalType = scanner.nextLine();

            System.out.println("What is the monkey's gender?");
            String gender = scanner.nextLine();

            System.out.println("What is the monkey's age?");
            String age = scanner.nextLine();

            System.out.println("What is the monkey's weight?");
            String weight = scanner.nextLine();

            System.out.println("What is the monkey's tail length?");
            String tailLength = scanner.nextLine();

            System.out.println("What is the monkey's height?");
            String height = scanner.nextLine();

            System.out.println("What is the monkey's body length?");
            String bodyLength = scanner.nextLine();

            System.out.println("What is the monkey's acquisition date?");
            String acquisitionDate = scanner.nextLine();

            System.out.println("What is the monkey's acquisition country?");
            String acquisitionCountry = scanner.nextLine();

            System.out.println("What is the monkey's training status?");
            String trainingStatus = scanner.nextLine();

            System.out.println("What is the monkey's in-service country?");
            String inServiceCountry = scanner.nextLine();

            //boolean value error when reads boolean from input
            System.out.println("What is the monkey's reserve?");
            String tempReserve = scanner.nextLine();
            boolean reserve = Boolean.parseBoolean(tempReserve);

            monkey.setAnimalType(animalType);
            monkey1.setAge(age);
            monkey1.setSpecies(species);
            monkey1.setGender(gender);
            monkey1.setWeight(weight);
            monkey1.setTailLength(tailLength);
            monkey1.setHeight(height);
            monkey1.setBodyLength(bodyLength);
            monkey1.setAcquisitionDate(acquisitionDate);
            monkey1.setAcquisitionLocation(acquisitionCountry);
            monkey1.setTrainingStatus(trainingStatus);
            monkey1.setReserved(reserve);
            monkey1.setInServiceCountry(inServiceCountry);
            monkeyList.add(monkey1);

        }
    }

    //reserve animal
    public static void reserveAnimal(@NotNull Scanner scanner) {
        System.out.println("Input animal type for reserve");
        String animalForReserve = scanner.nextLine();

        System.out.println("Input service location");
        String serviceLocation = scanner.nextLine();

        //check for monkey
        for(Monkey monkey: monkeyList){
            if(monkey.getAnimalType().equalsIgnoreCase(animalForReserve)) {
                if(monkey.getInServiceLocation().equalsIgnoreCase(serviceLocation)) {
                    if(!monkey.getReserved()){
                        System.out.println(monkey.getName() + " is reserved");
                        monkey.setReserved(true);
                        return;
                    }else{
                        System.out.println("Animal can't be reserved");
                        return;
                    }
                }
            }
        }

        //check for dog
        for(Dog dog: dogList) {
            if(dog.getAnimalType().equalsIgnoreCase(animalForReserve)) {
                if (dog.getInServiceLocation().equalsIgnoreCase(serviceLocation)) {
                    if (!dog.getReserved()) {
                        System.out.println(dog.getName() + " is reserved");
                        dog.setReserved(true);
                        return;
                    } else {
                        System.out.println("Animal can't be reserved");
                        return;
                    }
                }
            }
        }
    }

    // Prints animal name, status, acquisition country and if the animal is reserved.
    public static void printAnimals() {
        for (Dog dog: dogList) {
            System.out.println("Name: " + dog.getName() + " -- " + "Acquisition Country: " + dog.getAcquisitionLocation()
                    + " -- " + "Reserved: " + dog.getReserved());
        }
    }
}

