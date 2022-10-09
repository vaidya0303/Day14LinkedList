import java.util.Scanner;// import scanner class

//main class
public class LinkedListMain {

    /*
     *  main method every program execute here.
     */

    public static void main(String[] args) {
        /*
          create object for linkedlist class coz no one method is static in this class
         */

        LinkedList linkedList = new LinkedList();

        /*
         * create scanner class and object
         * scanner class read java user input
         */
        Scanner sc = new Scanner(System.in);

        /*
         * in sout 1st print the welcome msg and then choose our option then if
         * 1.we press 1 then they print inserting data
         * 2.if we press 2 print adding no
         * 3.print appending order linkedlist
         * 4.inserting value btw preNote and nextNode
         * 5.press 5 then delete 1st element
         * 6.press 6 then delete the last element in the linkedlist
         * 7.press 7 Search linked list to find Node with Value
         * 8.press 8 insert element in any position
         * 9.delete node
         */

        System.out.println("Welcome to DataStructure Program\n\n"
                + "Choose your option:\n"
                + "1. Create a simple LinkedList\n"  //uc1
                + "2. Create Linked List by adding 30 and 56 to 70\n" //uc2
                + "3. Create Linked List by apending 30 and 70 to 56\n" //uc3
                + "4. Insert 30 between 56 & 70\n" //uc4
                + "5. Ability to delete the first element\n"  //uc5
                + "6. Delete the last element in the LinkedList\n"//uc6
                + "7. Find node with value 30"  //uc7
                + "8. Insert 40 after 30"  //uc8
                + "9. Delete the Node");//uc9


        int option = sc.nextInt();
        System.out.println();

        /*
         * using switch case,they check the condition if they got condition is true then the stop searching
         * and break it.
         */
        switch (option) {

            /*
            for uc 1
             */
            case 1:

                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);

                linkedList.print();
                break;
            /*
            for uc 2
             */

            case 2:
                linkedList.push(70);
                linkedList.push(30);
                linkedList.push(56);

                linkedList.print();
                break;

                /*
                for uc 3
                 */
            case 3:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);

                linkedList.print();
                break;

                /*
                for uc 4
                 */
            case 4:

                LinkedList.Node prevNode = linkedList.insert(56);
                linkedList.insert(70);

                linkedList.insertAfter(prevNode,  30);
                break;

                /*
                 for uc 5
                 */
            case 5:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);
                int pop = linkedList.pop();
                System.out.println(pop);

                linkedList.print();
                break;

                /*
                for uc 6
                 */
            case 6:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);
                linkedList.popLast();

                linkedList.print();
                break;

                /*
                 for uc 7
                 */
            case 7:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);
                int search = linkedList.search(30);
                System.out.println("Position of 30::"+search);

                break;

                /*
                for uc 8
                 */
            case 8:
                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);

                linkedList.insertelement(3, 40);

                linkedList.print();

                break;

                /*
                for uc 9
                 */
            case 9:

                linkedList.deleteANode(40);
                linkedList.print();

        }
    }
}