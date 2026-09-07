// EmergencyQueue.java
public class EmergencyQueue {
    private QueueNode front;
    private QueueNode rear;

    public EmergencyQueue() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Patient patient) {
        QueueNode newNode = new QueueNode(patient);
        if (rear != null) {
            rear.setNext(newNode);
        }
        rear = newNode;
        if (front == null) {
            front = newNode;
        }
    }

    public Patient dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No patients to dequeue.");
            return null;
        }
        Patient patient = front.getPatient();
        front = front.getNext();
        if (front == null) {
            rear = null;
        }
        return patient;
    }

    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("No patients in the queue.");
            return;
        }
        QueueNode current = front;
        System.out.println("Emergency Queue:");
        while (current != null) {
            System.out.println("Patient ID: " + current.getPatient().getPatientID() + ", Name: " + current.getPatient().getPatientName());
            current = current.getNext();
        }
    }
}