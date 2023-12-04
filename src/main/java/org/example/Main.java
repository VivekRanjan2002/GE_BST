package org.example;
public class Main {
    public static void main(String[] args) {
        // UC1 create bst with first add 56 and then 30 and 70
        BST tree = new BST(56);
        tree.add(30);
        tree.add(70);
        tree.printfull(); // 56 30 70
        tree.size();    // 2

        // UC2
        tree.add(22);
        tree.add(40);
        tree.add(60);
        tree.add(95);
        tree.add(11);
        tree.add(65);
        tree.add(3);
        tree.add(16);
        tree.add(63);
        tree.add(67);
        tree.printfull();  // 56 30 22 11 3 16 40 70 60 65 63 67 95
        tree.size();   // 5




    }
}