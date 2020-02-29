package Day17;

public class WakeUp_FullNameCorrector {
    public static void main(String[] args) {
        // 12345678901234567
        String fullName = "SeRDar muHaMMedov";
        String firstName = fullName.substring(0, 7);
        String lastName = fullName.substring(7);
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