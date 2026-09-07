public class TreatmentStack {
    private StackNode top;

    public TreatmentStack() {
        this.top = null;
    }

    public void push(TreatmentRecord record) {
        StackNode newNode = new StackNode(record);
        newNode.setNext(top);
        top = newNode;
    }

    public TreatmentRecord pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }
        TreatmentRecord record = top.getRecord();
        top = top.getNext();
        return record;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void displayAllRecords() {
        if (isEmpty()) {
            System.out.println("No treatment records available.");
            return;
        }
        StackNode current = top;
        while (current != null) {
            System.out.println(current.getRecord());
            current = current.getNext();
        }
    }
}