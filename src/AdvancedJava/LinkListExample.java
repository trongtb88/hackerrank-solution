package AdvancedJava;

import java.util.LinkedList;

public class LinkListExample {
    private static LinkListExample linkedList = new LinkListExample();
    Node head;


    static class Node {
        int data;
        Node next;
        Node (int d) {
            data = d;
        }
    }

    public static void main(String [] args) {
        linkedList.head = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        linkedList.head.next = secondNode;
        secondNode.next = thirdNode;
        addNode(new Node(5), 2);
        printLinkedList(linkedList);

    }

    private static void addNode(Node node) {
        Node currentNode = linkedList.head;
        Node previousLastNode = currentNode;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            previousLastNode = currentNode;
            currentNode = currentNode.next;
        }
        previousLastNode.next = node;
        printLinkedList(linkedList);
    }

    private static void addNode(Node node, int position) {
        if (position < 1) {
            System.out.println("Invalid position");
            return;
        }
        if (position == 1) {
            Node head = linkedList.head;
            linkedList.head = node;
            linkedList.head.next = node;
            node.next = null;
        } else {
            int index = 1;
            Node currentNode = linkedList.head;
            while (index > position - 1) {
                index++;
                if (currentNode.next != null) {
                    currentNode = currentNode.next;
                } else {
                    break;
                }
            }
            //currentNode is last
            if (currentNode.next == null) {
                currentNode.next = node;
                node.next = null;
            } else {
                Node nextNode = currentNode.next;
                currentNode.next = node;
                node.next = nextNode;
            }
        }
        //printLinkedList(linkedList);

    }

    private static void printLinkedList(LinkListExample linkListExample) {
        Node currentNode = linkListExample.head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
