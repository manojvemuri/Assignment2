// Manoj Kumar Vemuri ID 2022213
package Exercise3;

import java.util.*;

import static Exercise3.SingletonAssignment2.getInstance;

public class Assignment2Driver {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        String decision;
        boolean yn, repeat;


        System.out.println("\n\nHey, Would you like to create an instance of SingletonAssignment2? (yes/no)");
        decision = kbd.nextLine();
        switch (decision) {
            case "yes" -> {
                yn = true;
                repeat = true;
                SingletonAssignment2 instance1 = getInstance();

            }
            case "no" -> {
                yn = false;
                repeat = true;
                System.out.println("\n\nNo instance requested");
            }
        }


        if (repeat = true) {
            do {
                System.out.println("\n\nHey, Would you like to create an instance of SingletonAssignment2? (yes/no)");
                decision = kbd.nextLine();

                if ("yes".equals(decision)) {
                    yn = true;
                    repeat = true;
                    getInstance();
                } else if ("no".equals(decision)) {
                    yn = false;
                    repeat = false;
                    System.out.println("\n\nNo instance requested");
                }
            } while (repeat);
        }

    }
}

