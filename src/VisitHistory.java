public class VisitHistory {
    private VisitNode head;

    public VisitHistory() {
        this.head = null;
    }

    public void addVisit(Visit visit) {
        VisitNode newNode = new VisitNode(visit);
        if (head == null) {
            head = newNode;
        } else {
            VisitNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void removeVisit(int visitId) {
        if (head == null) {
            System.out.println("No visits to remove.");
            return;
        }

        if (head.visit.getVisitId() == visitId) {
            head = head.next;
            return;
        }

        VisitNode current = head;
        while (current.next != null && current.next.visit.getVisitId() != visitId) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Visit not found.");
        } else {
            current.next = current.next.next;
        }
    }

    public Visit searchVisit(int visitId) {
        VisitNode current = head;
        while (current != null) {
            if (current.visit.getVisitId() == visitId) {
                return current.visit;
            }
            current = current.next;
        }
        System.out.println("Visit not found.");
        return null;
    }

    public void displayVisits() {
        if (head == null) {
            System.out.println("No visit history available.");
            return;
        }

        VisitNode current = head;
        while (current != null) {
            System.out.println(current.visit);
            current = current.next;
        }
    }
}