
public class Node {

    public Node l;
    public Node r;
    public int v;

    Node(int v) {
        this.v = v;
        l = r = null;
    }
}

class Tree {
    Node root;
    public Tree() {root=null;}
    public void insert (int v, Node n){
        if (n== null) {
            n = new Node(v);
            n = new Node(v);
        }
        else if (n.v<=v){
            if (n.r == null) {
                n = new Node(v);
            } else {
                insert(v, n.r);
            }
        } else {
            if (n.l == null) {
                n = new Node(v);
            } else {
                insert(v, n.l);
            }
        }
    }

    public void insert(int v) {
        if (root == null) {
            Node n = new Node(v);
            root = n;             //Primero se crea el nodo, luego Nodo se apunta a la raíz.
        }
        insert(v, root);
    }

    public void print(Node n) {
        if (n == null) {
            return;
        }
        print(n.l);
        System.out.println(n.v);
        print (n.r);
    }

    void print() {
        print(root);
    }
}
