import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SystemTest {
    private PatientBST patientBST;
    private EmergencyQueue emergencyQueue;
    private TreatmentStack treatmentStack;

    @BeforeEach
    public void setUp() {
        patientBST = new PatientBST();
        emergencyQueue = new EmergencyQueue();
        treatmentStack = new TreatmentStack();
    }

    @Test
    public void testPatientInsertionAndSearch() {
        Patient patient1 = new Patient(1, "John Doe", 30, "1234567890", "Flu");
        Patient patient2 = new Patient(2, "Jane Smith", 25, "0987654321", "Cold");

        patientBST.insert(patient1);
        patientBST.insert(patient2);

        assertNotNull(patientBST.search(1));
        assertNotNull(patientBST.search(2));
        assertNull(patientBST.search(3)); // Non-existing patient
    }

    @Test
    public void testPatientDeletion() {
        Patient patient = new Patient(1, "John Doe", 30, "1234567890", "Flu");
        patientBST.insert(patient);
        assertNotNull(patientBST.search(1));

        patientBST.delete(1);
        assertNull(patientBST.search(1)); // Patient should be deleted
    }

    @Test
    public void testEmergencyQueue() {
        Patient patient1 = new Patient(1, "John Doe", 30, "1234567890", "Flu");
        Patient patient2 = new Patient(2, "Jane Smith", 25, "0987654321", "Cold");

        emergencyQueue.enqueue(patient1);
        emergencyQueue.enqueue(patient2);

        assertFalse(emergencyQueue.isEmpty());
        assertEquals(patient1, emergencyQueue.dequeue()); // FIFO check
        assertEquals(patient2, emergencyQueue.dequeue());
        assertTrue(emergencyQueue.isEmpty()); // Queue should be empty now
    }

    @Test
    public void testTreatmentStack() {
        TreatmentRecord record1 = new TreatmentRecord(1, 1, "John Doe", "Dr. Smith", "Flu Treatment", "2023-10-01");
        TreatmentRecord record2 = new TreatmentRecord(2, 2, "Jane Smith", "Dr. Jones", "Cold Treatment", "2023-10-02");

        treatmentStack.push(record1);
        treatmentStack.push(record2);

        assertFalse(treatmentStack.isEmpty());
        assertEquals(record2, treatmentStack.pop()); // LIFO check
        assertEquals(record1, treatmentStack.pop());
        assertTrue(treatmentStack.isEmpty()); // Stack should be empty now
    }

    @Test
    public void testVisitHistory() {
        Patient patient = new Patient(1, "John Doe", 30, "1234567890", "Flu");
        VisitHistory visitHistory = new VisitHistory();
        patient.setVisitHistory(visitHistory);

        Visit visit1 = new Visit(1, "2023-10-01", "Dr. Smith", "Flu", "Rest and hydration");
        Visit visit2 = new Visit(2, "2023-10-05", "Dr. Brown", "Flu", "Follow-up");

        visitHistory.addVisit(visit1);
        visitHistory.addVisit(visit2);

        assertEquals(2, visitHistory.getVisitCount());
        assertNotNull(visitHistory.searchVisit(1)); // Search for existing visit
        visitHistory.removeVisit(1);
        assertNull(visitHistory.searchVisit(1)); // Visit should be removed
    }
}