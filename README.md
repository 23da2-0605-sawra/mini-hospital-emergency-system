# Mini Hospital Emergency Management System

## Project Description
The Mini Hospital Emergency Management System is a console-based application designed to manage patient records, emergency patient management, treatment history, and patient visit history. The system utilizes various data structures to efficiently handle operations related to patient management in a hospital setting.

## Objectives
- To implement a hospital management system that demonstrates the use of fundamental data structures.
- To provide a user-friendly interface for managing patient information and treatment history.
- To ensure data integrity and efficient retrieval of patient records.

## Technologies Used
- Java (JDK 11 or higher)
- Console-based application

## Data Structures Used
1. **Binary Search Tree (BST)**: For managing patient records based on Patient ID.
2. **Queue**: For managing emergency patients in a First-In-First-Out (FIFO) manner.
3. **Stack**: For maintaining treatment history in a Last-In-First-Out (LIFO) manner.
4. **Singly Linked List**: For tracking patient visit history.

## System Features
- Register new patients and manage their records.
- Handle emergency patient arrivals and manage treatment queue.
- Record and display treatment history for completed treatments.
- Maintain a history of patient visits with the ability to add, remove, and search visits.

## Class Structure
- **Main.java**: Entry point of the application with the main menu.
- **Patient.java**: Defines the Patient class with properties and methods.
- **PatientNode.java**: Represents a node in the BST for patient records.
- **PatientBST.java**: Implements the BST for patient management.
- **QueueNode.java**: Represents a node in the emergency patient queue.
- **EmergencyQueue.java**: Implements the emergency patient queue.
- **TreatmentRecord.java**: Defines the treatment record structure.
- **StackNode.java**: Represents a node in the treatment history stack.
- **TreatmentStack.java**: Implements the treatment history stack.
- **Visit.java**: Defines the visit record structure.
- **VisitNode.java**: Represents a node in the patient visit history.
- **VisitHistory.java**: Implements the singly linked list for patient visits.
- **SystemTest.java**: Contains test cases for validating system functionality.

## How to Compile and Run
1. Ensure you have Java Development Kit (JDK) installed on your machine.
2. Navigate to the project directory in the terminal.
3. Compile the Java files using the command:
   ```
   javac src/*.java
   ```
4. Run the application using the command:
   ```
   java src/Main
   ```

## Sample Operations
- Register a new patient by entering their details.
- Add patients to the emergency queue.
- Call the next patient for treatment and complete their treatment.
- View treatment history and patient visit history.

## Testing
The system has been tested with various scenarios to ensure all functionalities work as expected. Test cases are included in the `SystemTest.java` file.

## Author
[Your Name]  
[Your Contact Information]  
[Date]  

Feel free to modify the author section with your personal information.