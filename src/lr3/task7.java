package lr3;

import org.w3c.dom.Node;

public class task7 {
    public static void main(String[] args) {
        class Node_by_head{
            public int value;
            public Node_by_head pointer;

            Node_by_head(int value, Node_by_head pointer){
                this.value = value;
                this.pointer = pointer;
            }
        }

        class Node_by_tail extends Node_by_head{
            Node_by_tail(int value, Node_by_head pointer) {
                super(value, pointer);
            }
        }

        Node_by_head node = null;

        for (int i = 0; i < 5; i++) {
            node = new Node_by_head(i,node);
        }

        Node_by_tail node2 = new Node_by_tail(4,null);

        for (int i = 3; i >= 0; i--) {
            node2 = new Node_by_tail(i,node2);
        }



    }
}
