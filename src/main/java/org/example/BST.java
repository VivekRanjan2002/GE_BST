package org.example;

public class BST {
    public Node head;
    public BST(){
        head=null;
    }
    public BST(int data){
        Node newNode= new Node(data);
        head=newNode;
    }

    /*
    @desc: adding the node in BST where left node will be less than head and right node
        is greater than head
     */
    public void add(int data){
        Node newNode= new Node(data);
        if(head==null) {
            head=newNode;
        }
        Node prev=head;
        Node curr=head;
        while(curr!=null){
            prev=curr;
            if(curr.data>=data)   curr=curr.LeftNode;
            else  curr=curr.RightNode;
        }
        curr=newNode;
        if(prev.data>=curr.data) prev.LeftNode=curr;
        else prev.RightNode=curr;

    }

/*
@desc: print BST using recursion where root node first print then call left child and then on
        right child recursively
 */

    public void printfull(){
        print(head);
    }
    public void print(Node head){
        if(head==null) return;

        System.out.println(head.data);
        print(head.LeftNode);
        print(head.RightNode);

    }


}


