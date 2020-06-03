import java.util.Scanner;

public class PetApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int amountToFeed;
        int amountToWater;
        int amountToPlay;
        int amountToWalk;
        int amountToOil;
        int numOfBrooms;
        String needGloves;
        int numOfGloves;
        String petToAdopt;
        String newPetName;
        String newPetType;

        PetShelter petShelter = new PetShelter();
        OrganicCat orgCat = new OrganicCat("Lola", "Organic Cat", 1, 1, 20, 30, 10, 1);
        OrganicDog orgDog = new OrganicDog("Maxie", "Organic Dog", 1, 1, 30, 40, 10, 1);
        RoboticCat roboCat = new RoboticCat("Julie", "Robotic Cat", 1, 1, 2);
        RoboticDog roboDog = new RoboticDog("Cooper", "Robotic Dog", 1, 1, 2);

        petShelter.addPet(orgCat);
        petShelter.addPet(orgDog);
        petShelter.addPet(roboCat);
        petShelter.addPet(roboDog);

        System.out.println("HI! Thank you for volunteering at the shelter today!");
        System.out.println();
        System.out.println("Here are our pets and their current status: ");
        System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
        petShelter.showAllPets();

        System.out.println();

        System.out.println("How would you like to volunteer today?");
        System.out.println("press 1 to feed all Organic pets");
        System.out.println("press 2 to water all Organic pets");
        System.out.println("press 3 to play with Organic pet");
        System.out.println("press 4 to walk all Dogs");
        System.out.println("press 5 to oil Robotic Pets");
        System.out.println("press 6 to clean Organic Dog's cages");
        System.out.println("press 7 to clean Organic Cat's litter box");
        System.out.println("press 8 to adopt a pet");
        System.out.println("press 9 to admit a pet");
        System.out.println("press 10 to quit");

        String response = input.nextLine();

        while (!response.equals("10")) {

            if (response.equals("1")) {
                System.out.println("Enter the number of cups you want to feed:");
                amountToFeed = input.nextInt();
                petShelter.feed("Lola", amountToFeed); //instead of specifying the name feed Organic only
                petShelter.feed("Maxie", amountToFeed); //instead of specifying the name feed Organic only
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                petShelter.showAllPets();
                input.nextLine();
            } else if (response.equals("2")) {
                System.out.println("Enter the number of cups you want to water:");
                amountToWater = input.nextInt();
                petShelter.water("Lola", amountToWater);
                petShelter.water("Maxie", amountToWater);
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                petShelter.showAllPets();
                input.nextLine();
            } else if (response.equals("3")) {
                System.out.println("What pet would you like to play with?");
                System.out.println("In the shelter we have Lola & Maxie");
                String petToPlay = input.next();
                if (petToPlay.toLowerCase().equals("lola")) {
                    System.out.println("You have selected " + petToPlay);
                    System.out.println("Enter the number of minutes you want to play");
                    amountToPlay = input.nextInt();
                    orgCat.play(amountToPlay);
                    System.out.println("Here is Lola's new chart:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                    System.out.println(orgCat.toString());
                } else if (petToPlay.toLowerCase().equals("maxie")) {
                    System.out.println("You have selected " + petToPlay);
                    System.out.println("Enter the number of minutes you want to play");
                    amountToPlay = input.nextInt();
                    orgDog.play(amountToPlay);
                    System.out.println("Here is Maxie's new chart:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                    System.out.println(orgDog.toString());
                }
                input.nextLine();
            } else if (response.equals("4")) {
                System.out.println("How many minutes will you be walking the dogs?");
                amountToWalk = input.nextInt();
                petShelter.walkAllOrgDogs("Maxie", amountToWalk);
                petShelter.walkAllRoboDogs("Cooper", amountToWalk);
                System.out.println("Here are the dog's new chart:");
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                System.out.println(orgDog.toString());
                System.out.println(roboDog.toString());
                input.nextLine();
            } else if (response.equals("5")) {
                System.out.println("Please add a number of oil drops to keep them running:");
                amountToOil = input.nextInt();
                petShelter.oilRoboticPets("Julie", amountToOil);
                petShelter.oilRoboticPets("Cooper", amountToOil);
                System.out.println("Here is Robotic Pet's chart: ");
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                System.out.println(roboCat.toString());
                System.out.println(roboDog.toString());
                input.nextLine();
            } else if (response.equals("6")) {
                System.out.println("How many brooms will you be needing? Please enter a number");
                numOfBrooms = input.nextInt();
                petShelter.cleanOrganicDogCages("Maxie", numOfBrooms);
                System.out.println("Here is Maxie's new chart:");
                System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                System.out.println(orgDog.toString());
                input.nextLine();
            } else if (response.equals("7")) {
                System.out.println("Do you need gloves(yes/no)?");
                needGloves = input.nextLine();
                if (needGloves.equals("yes")) {
                    System.out.println("How many gloves do you need? Please enter a number");
                    numOfGloves = input.nextInt();
                    petShelter.cleanOrganicCatLitterBox("Lola", numOfGloves);
                    System.out.println("Here is Lola's new chart:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                    System.out.println(orgCat.toString());
                } else if (needGloves.equals("no")) {
                    petShelter.cleanOrganicCatLitterBox("Lola", 3);
                    System.out.println("Thank you for cleaning with bare hands");
                    System.out.println("Here is Lola's new chart:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                    System.out.println(orgCat.toString());
                }
               // input.nextLine();
            } else if (response.equals("8")) {
                System.out.println("What pet would you like to adopt?");
                petToAdopt = input.nextLine();
                if (petToAdopt.toLowerCase().equals("lola")) {
                    System.out.println("You have chosen Lola");
                    petShelter.removePet(orgCat);
                    System.out.println("Here are our remaining pets:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                    petShelter.showAllPets();
                } else if (petToAdopt.toLowerCase().equals("maxie")) {
                    System.out.println("You have chosen Maxie");
                    petShelter.removePet(orgDog);
                    System.out.println("Here are our remaining pets:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                    petShelter.showAllPets();
                } else if (petToAdopt.toLowerCase().equals("julie")) {
                    System.out.println("You have chosen Julie");
                    petShelter.removePet(roboCat);
                    System.out.println("Here are our remaining pets:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                    petShelter.showAllPets();
                } else if (petToAdopt.toLowerCase().equals("cooper")) {
                    System.out.println("You have chosen Cooper");
                    petShelter.removePet(roboDog);
                    System.out.println("Here are our remaining pets:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                    petShelter.showAllPets();
                }
            } else if (response.equals("9")) {
                System.out.println("What is the name of the new pet joining our shelter?");
                newPetName = input.nextLine();
                System.out.println("What type of pet is it (Organic Cat, Organic Dog, Robotic Cat, or Robotic Dog)?");
                newPetType = input.nextLine();
                if (newPetType.toLowerCase().equals("organic cat")) {
                    petShelter.addPet(new OrganicCat(newPetName, newPetType, 1, 1, 1, 1, 1, 1));
                    System.out.println("Here is our updated list of pets:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                    petShelter.showAllPets();
                } else if (newPetType.toLowerCase().equals("organic dog")) {
                    petShelter.addPet(new OrganicDog(newPetName, newPetType, 1, 1, 1, 1, 1, 1));
                    System.out.println("Here is our updated list of pets:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                    petShelter.showAllPets();
                } else if (newPetType.toLowerCase().equals("robotic cat")) {
                    petShelter.addPet(new RoboticCat(newPetName, newPetType, 1, 1, 1));
                    System.out.println("Here is our updated list of pets:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                    petShelter.showAllPets();
                } else if (newPetType.toLowerCase().equals("robotic dog")) {
                    petShelter.addPet(new RoboticDog(newPetName, newPetType, 1, 1, 1));
                    System.out.println("Here is our updated list of pets:");
                    System.out.println("Name\tDescription\tHappiness\tHealth\tHunger\tThirst\tBored\tOil Level");
                    petShelter.showAllPets();
                }
            }

            System.out.println();
            System.out.println("How about an additional work?");
            System.out.println("press 1 to feed all Organic pets");
            System.out.println("press 2 to water all Organic pets");
            System.out.println("press 3 to play with Organic pet");
            System.out.println("press 4 to walk all Dogs");
            System.out.println("press 5 to oil Robotic Pets");
            System.out.println("press 6 to clean Organic Dog's cages");
            System.out.println("press 7 to clean Organic Cat's litter box");
            System.out.println("press 8 to adopt a pet");
            System.out.println("press 9 to admit a pet");
            System.out.println("press 10 to quit");

            response = input.nextLine();
        }
        System.out.println("Ciao, thank you for volunteering today!");
    }
}

//There is bug for option 7
        //if I eliminate line 138, then for YES it gives the menu 2x, NO works ok
        //if I add line 138, YES works ok, and for NO I have to hit enter again to show the menu
//after adding a new organic pet it is not updating the feed & thirst properties
//after adding new robotic pet, it is not updating the oil level
//after Lola & Maxi have been adopted, option 3 won't be valid

//as we get better with coding in the months, these will be picked up

