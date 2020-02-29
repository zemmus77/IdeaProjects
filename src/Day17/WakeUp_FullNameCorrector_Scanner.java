package Day17;

import java.util.Scanner;

public class WakeUp_FullNameCorrector_Scanner {
    public static void main(String[] args) {

                        // 12345678901234567
        String fullName = "SeRDar muHaMMedov";
        int indexOfSpace = fullName.indexOf(" ") ;

        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1);
        String firstNameCorrected =
                firstName.toUpperCase().substring(0, 1) +
                        firstName.toLowerCase().substring(1);
        System.out.println("First name Corrected: " + firstNameCorrected);
        String lastNameCorrected = lastName.toUpperCase().substring(0, 1) +
                lastName.toLowerCase().substring(1);
        System.out.println("Last name Corected: " + lastNameCorrected);
        fullName = firstNameCorrected + " " + lastNameCorrected;
        System.out.println(fullName);
    }
}
