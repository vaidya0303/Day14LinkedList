
/*
 *creating a class name as LinkedList
 *
 * in this class we perform all th operations
 */
public class LinkedList {
    Node head;

    // create node class

    /*
     * class Node that hold data and a reference/link
	 * to the next Node in the list
     */
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    /*
     * Method to add a node at the beginning of the list
     */

    public Node insert(int data) {

        /*
         * Create a new node
         */
        Node newNode = new Node(data);

        /*
         * Check if the list is empty
         */
        if (head == null) {

            /*
             * Make the new node as head
             */
            head = newNode;

        } else {
            Node temp = head;

            /*
             * traverse to the end of the list
             */
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return newNode;
    }

    /*
     * create a print method
     */
    public void print() {

        /*
         * head store in temp variable
         */
        Node temp = head;

        /*
         * While loop using
         *
         * If temp is not equal to null then print in sout data
         */
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }

    }
         /*
          * create a push method for adding new node and passing parameter
          */
        public void push ( int data){
            /*
             * Create a new node
             */
            Node newNode = new Node(data);
            /*
             * new node is head
             */
            newNode.next = head;
            head = newNode;

        }

        /*
         *  create a method for Insert 30 between 56 and 70
         */
    public void insertAfter(Node prevNode, int value) {
        /*
         * condition is checked
         */
        if (prevNode == null) {
            System.out.println("Prev Node should not be null");
            return;
        }
        //56 ->70
        //56 -> 30 -> 70

        /*
         * create new node inserting 30 btwn 56 and 70
         */
        Node newNode = new Node(value);
        newNode.next = prevNode.next;
        prevNode.next = newNode;

    }
      /*
       * creat a method name as pop
       * in pop method used for deleting element
       * here this is used for delete 1st element in linked list
       */
    public int pop() {
        //variable
        int popData = 0;

        /*
         * check the condition
         */
        if (head == null) {
            System.out.println("Stack over flow ");
        }
        popData = head.data;
        head = head.next;

        return popData;

    }

    }