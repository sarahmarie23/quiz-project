import java.util.*;
public class Quiz {
    public static void main (String[] args) {
        String[][] array = {{"Manatees were commonly said to be which magical creature?\n\tA. Loch Ness monster\n\tB. Mermaids\n\tC. The Kraken", "B"},
                            {"How fast do manatees swim?\n\tA. 1-3 mph\n\tB. 8-10 mph\n\tC. 3-5 mph", "C"},
                            {"Manatees are also sometimes called _____.\n\tA. Sea mules\n\tB. Sea cows\n\tC. Sea sloths", "B"},
                            {"Are manatees warm or cold blooded?\n\tA. Cold\n\tB. Warm\n\tC. Depends on the weather", "B"},
                            {"Are manatees a/an ________?\n\tA. Omnivore\n\tB. Carnivore\n\tC. Herbivore", "C"},
                            {"Which manatees are larger?\n\tA. They are all the same size.\n\tB. Female\n\tC. Male", "B"},
                            {"Manatees can hold their breath for up to _____ minutes.\n\tA. 20\n\tB. 4\n\tC. 15", "A"},
                            {"What land animal is the manatee genetically closest too?\n\tA. Elephant\n\tB. Cows\n\tC. Hippos", "A"},
                            {"What is a group of manatees called?\n\tA. A murder\n\tB. A congregation\n\tC. An aggregation", "C"},
                            {"About how many pounds of food could a 1,300 lb manatee eat?\n\tA. 50 lbs\n\tB. 130 lbs\n\tC. 100lbs", "B"}};
        int score = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Let's see how much YOU know about manatees!");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Question " + (i+1) + ": " + array[i][0]);
            String answer = input.nextLine().toUpperCase();
            while (!answer.equals("A") && !answer.equals("B") && !answer.equals("C")) {
                System.out.println("Invalid try again");
                answer = input.nextLine().toUpperCase();
            }
            if (answer.equals(array[i][1])){
                    System.out.println("Correct!");
                    score++;
            } else {
                    System.out.println("Sorry, the correct answer was " + (array[i][1]));
            }
            System.out.println();
        }
        System.out.println("You got " + score + " right and " + (10 - score) + " wrong");
        if (score > 8) {
            System.out.println("Wow, you're a manatee expert!");
        } else if (score > 5 && score <= 8) {
            System.out.println("You sure know some manatee facts.");
        } else {
            System.out.println("Hope you learned a little something about manatees :)");
        }
    }
}
