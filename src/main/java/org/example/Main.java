package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // UC1 create bst with first add 56 and then 30 and 70
         BST tree= new BST(56);
        tree.add(30);
         tree.add(70);

         tree.printfull(); // 56 30 70
        }

    }
