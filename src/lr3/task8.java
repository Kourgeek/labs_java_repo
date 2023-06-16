package lr3;
// не решено
public class task8 {
    public static void main(String[] args) {
        class Node {
            public int value;
            public Node pointer;

            Node(int value,Node pointer){
                this.pointer = pointer;
                this.value = value;
            }

            public void CreateHead(Node pointer,int n){
                Node node = pointer;
                for (int i = 0; i < n; i++) {
                    node = new Node(i,node);
                }
            }
            public void CreateTail(int n){
                Node node = new Node(n-1,null);
                if(n>=1) {
                    for (int i = n - 2; i >= 0; i--) {
                        node = new Node(i, node);
                    }
                }
            }

            public void to_String(Node node){
                Node ref = node;
                while(ref!=null){
                    System.out.println(','+ref.value);
                    ref = ref.pointer;
                }
            }

            public void addFirst(){

            }

            public void addLast(){

            }

            public void removeFirst(){

            }

            public void removeLast(){

            }

            public void remove(){

            }

            public void CreateHeadRec(){

            }

            public void CreateTailRec(){

            }

        }

        Node node = null;
        node.CreateHead(null,4);

        //node.CreateHead(4);
        //node.to_String(node);

    }
}
