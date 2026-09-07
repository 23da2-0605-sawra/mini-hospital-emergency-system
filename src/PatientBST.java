// PatientBST.java
import java.util.ArrayList;
import java.util.List;

public class PatientBST {
    private PatientNode root;

    public PatientBST() {
        this.root = null;
    }

    public void insert(Patient patient) {
        root = insertRec(root, patient);
    }

    private PatientNode insertRec(PatientNode root, Patient patient) {
        if (root == null) {
            return new PatientNode(patient);
        }
        if (patient.getPatientID() < root.getPatient().getPatientID()) {
            root.setLeft(insertRec(root.getLeft(), patient));
        } else if (patient.getPatientID() > root.getPatient().getPatientID()) {
            root.setRight(insertRec(root.getRight(), patient));
        } else {
            System.out.println("Duplicate Patient ID: " + patient.getPatientID());
        }
        return root;
    }

    public Patient search(int patientID) {
        return searchRec(root, patientID);
    }

    private Patient searchRec(PatientNode root, int patientID) {
        if (root == null || root.getPatient().getPatientID() == patientID) {
            return root != null ? root.getPatient() : null;
        }
        return patientID < root.getPatient().getPatientID()
                ? searchRec(root.getLeft(), patientID)
                : searchRec(root.getRight(), patientID);
    }

    public void delete(int patientID) {
        root = deleteRec(root, patientID);
    }

    private PatientNode deleteRec(PatientNode root, int patientID) {
        if (root == null) {
            return root;
        }
        if (patientID < root.getPatient().getPatientID()) {
            root.setLeft(deleteRec(root.getLeft(), patientID));
        } else if (patientID > root.getPatient().getPatientID()) {
            root.setRight(deleteRec(root.getRight(), patientID));
        } else {
            if (root.getLeft() == null) {
                return root.getRight();
            } else if (root.getRight() == null) {
                return root.getLeft();
            }
            root.setPatient(minValue(root.getRight()));
            root.setRight(deleteRec(root.getRight(), root.getPatient().getPatientID()));
        }
        return root;
    }

    private Patient minValue(PatientNode root) {
        Patient minv = root.getPatient();
        while (root.getLeft() != null) {
            minv = root.getLeft().getPatient();
            root = root.getLeft();
        }
        return minv;
    }

    public void inOrder() {
        List<Patient> patients = new ArrayList<>();
        inOrderRec(root, patients);
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    private void inOrderRec(PatientNode root, List<Patient> patients) {
        if (root != null) {
            inOrderRec(root.getLeft(), patients);
            patients.add(root.getPatient());
            inOrderRec(root.getRight(), patients);
        }
    }
}