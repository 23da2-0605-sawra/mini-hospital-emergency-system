import java.util.Scanner;

public class Main {
    private static PatientBST patientBST = new PatientBST();
    private static EmergencyQueue emergencyQueue = new EmergencyQueue();
    private static TreatmentStack treatmentStack = new TreatmentStack();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = getUserChoice(scanner);

            switch (choice) {
                case 1:
                    registerNewPatient(scanner);
                    break;
                case 2:
                    searchPatient(scanner);
                    break;
                case 3:
                    deletePatient(scanner);
                    break;
                case 4:
                    displayAllPatients();
                    break;
                case 5:
                    addPatientToEmergencyQueue(scanner);
                    break;
                case 6:
                    viewEmergencyQueue();
                    break;
                case 7:
                    callNextPatientForTreatment();
                    break;
                case 8:
                    completeTreatment(scanner);
                    break;
                case 9:
                    viewTreatmentHistory();
                    break;
                case 10:
                    addPatientVisit(scanner);
                    break;
                case 11:
                    removePatientVisit(scanner);
                    break;
                case 12:
                    searchPatientVisit(scanner);
                    break;
                case 13:
                    displayPatientVisitHistory(scanner);
                    break;
                case 14:
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 14);

        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("========================================");
        System.out.println("MINI HOSPITAL EMERGENCY SYSTEM");
        System.out.println("========================================");
        System.out.println("1. Register New Patient");
        System.out.println("2. Search Patient");
        System.out.println("3. Delete Patient");
        System.out.println("4. Display All Patients");
        System.out.println("5. Add Patient to Emergency Queue");
        System.out.println("6. View Emergency Queue");
        System.out.println("7. Call Next Patient for Treatment");
        System.out.println("8. Complete Treatment");
        System.out.println("9. View Treatment History");
        System.out.println("10. Add Patient Visit");
        System.out.println("11. Remove Patient Visit");
        System.out.println("12. Search Patient Visit");
        System.out.println("13. Display Patient Visit History");
        System.out.println("14. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Please enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void registerNewPatient(Scanner scanner) {
        // Implementation for registering a new patient
    }

    private static void searchPatient(Scanner scanner) {
        // Implementation for searching a patient
    }

    private static void deletePatient(Scanner scanner) {
        // Implementation for deleting a patient
    }

    private static void displayAllPatients() {
        // Implementation for displaying all patients
    }

    private static void addPatientToEmergencyQueue(Scanner scanner) {
        // Implementation for adding a patient to the emergency queue
    }

    private static void viewEmergencyQueue() {
        // Implementation for viewing the emergency queue
    }

    private static void callNextPatientForTreatment() {
        // Implementation for calling the next patient for treatment
    }

    private static void completeTreatment(Scanner scanner) {
        // Implementation for completing treatment
    }

    private static void viewTreatmentHistory() {
        // Implementation for viewing treatment history
    }

    private static void addPatientVisit(Scanner scanner) {
        // Implementation for adding a patient visit
    }

    private static void removePatientVisit(Scanner scanner) {
        // Implementation for removing a patient visit
    }

    private static void searchPatientVisit(Scanner scanner) {
        // Implementation for searching a patient visit
    }

    private static void displayPatientVisitHistory(Scanner scanner) {
        // Implementation for displaying patient visit history
    }
}