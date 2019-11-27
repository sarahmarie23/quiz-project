import java.util.*;
import java.io.*;
public class quizProject {
    public static void main(String[] args) throws FileNotFoundException{
        String Q1 = "Manatees were commonly said to be which magical creature?\n\tA. Loch Ness monster\n\tB. Mermaids\n\tC. The Kraken";
        String Q2 = "How fast do manatees swim?\n\tA. 1-3 mph\n\tB. 8-10 mph\n\tC. 3-5 mph";
        String Q3 = "Manatees are also sometimes called _____.\n\tA. Sea mules\n\tB. Sea cows\n\tC. Sea sloths";
        String Q4 = "Are manatees warm or cold blooded?\n\tA. Cold\n\tB. Warm\n\tC. Depends on the weather";
        String Q5 = "Are manatees a/an ________?\n\tA. Omnivore\n\tB. Carnivore\n\tC. Herbivore";
        String Q6 = "Which manatees are larger?\n\tA. They are all the same size.\n\tB. Female\n\tC. Male";
        String Q7 = "Manatees can hold their breath for up to _____ minutes.\n\tA. 20\n\tB. 4\n\tC. 15";
        String Q8 = "What land animal is the manatee genetically closest too?\n\tA. Elephant\n\tB. Cows\n\tC. Hippos";
        String Q9 = "What is a group of manatees called?\n\tA. A murder\n\tB. A congregation\n\tC. An aggregation";
        String Q10 = "About how many pounds of food could a 1,300 lb manatee eat?\n\tA. 50 lbs\n\tB. 130 lbs\n\tC. 100lbs";
        String A = "B";
        String B = "C";
        String C = "B";
        String D = "B";
        String E = "C";
        String F = "B";
        String G = "A";
        String H = "A";
        String I = "C";
        String J = "C";
        int score = 0;
        String[][] array = {{Q1, Q2, Q3, Q4, Q5, Q6, Q7, Q8, Q9, Q10}, {A, B, C, D, E, F, G, H, I, J}};
        Scanner input = new Scanner(System.in);
        System.out.println("Let's see how much YOU know about manatees!");
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("Question " + (j+1) + ": " + array[i][j]);
                String ans = input.nextLine();
                String answer = ans.toUpperCase();
                /*if (answer != "A" || answer != "B" || answer != "C") {
                    System.out.println("Invalid answer try again");
                    input.next();
                } */
                if (answer.equals(array[1][j])){
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Sorry, the correct answer was " + (array[i+1][j]));
                }
            }
            System.out.println("You got " + score + " right and " + (10 - score) + " wrong");
        }
        if (score > 8) {
            System.out.println("Wow, you're a manatee expert!");
        } else if (score > 5 && score < 8) {
            System.out.println("You sure know some manatee facts.");
        } else {
            System.out.println("Hope you learned a little something about manatees :)");
        }
    }
}