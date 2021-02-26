
import java.util.Random;

public class Node {

    Random rand = new Random();
    public Customer iData;
    public Node[] next;

    public Node(Customer id) {

        iData = id;
        next = new Node[rand.nextInt(4) + 1];
        //System.out.println(next.length);

    }

    public void displayLink() {

        System.out.print(iData.toString());

    }
}
