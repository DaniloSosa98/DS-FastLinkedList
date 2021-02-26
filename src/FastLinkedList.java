
public class FastLinkedList {

    public static int count = 0;
    private Node first;

    public FastLinkedList() {
        Customer c = new Customer();
        first = new Node(c);
        first.next = new Node[5];
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(Customer id) {
        Node newLink = new Node(id);
        /*newLink.next = first;       // newLink --> old first
        first = newLink;            // first --> newLink*/

        newLink.next[0] = first.next[0];
        first.next[0] = newLink;
        //first.next[0].displayLink();
    }

    public void displayList() {
        System.out.print("\nList (first-->last): ");

        Node current = first.next[0];       // start at beginning of list

        /*//first.next[0].displayLink();
        //first.next[0].next[0].displayLink();
        current.next[0].displayLink();
        current = current.next[0];
        current.next[0].displayLink();*/
        while (current != null) { // until end of list,

            current.displayLink();   // print data
            current = current.next[0];  // move to next link
        }
        System.out.println("");
    }

    public void references() {

        Node current = first;
        Node temp;

        for (int i = 1; i < first.next.length; i++) {
            while (current != null) { // until end of list,
                temp = current.next[0];
                if (current.next.length-1 >= i && temp.next.length >= current.next.length) {
                    current.next[i] = temp;
                    current = current.next[0];
                    //temp = temp.next[0];

                } else {
                    current = current.next[0];
                    //temp = temp.next[0];
                }
            }
            current = first;
        }
    }

    public void printLevels() {
        System.out.print("\nPRINT LEVEL");

        Node current = first.next[0];       // start at beginning of list
        
        for (int i = 0; i < current.next.length; i++) {
            current.next[i].displayLink();
        }
        
        System.out.println("");
    }
}
