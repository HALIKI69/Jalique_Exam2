/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jalique_exam2;

import java.util.Scanner;
class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

     boolean search(String target) {
        Node current = head;
        while (current != null) {
            if (current.data == target) {
                return true; 
            }
            current = current.next;
        }
        return false; 
    }
    public void insertAtPosition(String data, int position) {
        Node newNode = new Node(data);
        if (position == 1 || head == null) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 1; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Invalid position. Inserting at the end.");
                insertAtEnd(data);
            } else {
                newNode.next = current.next;
                current.next = newNode;
            }
        }
    }

   
    public void insertAtEnd(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + ", ");
            current = current.next;
        }
        System.out.println();
    }
    void numbers(String data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            
            current = current.next ;
            
        }

        current.next = newNode ;
 
    }
}
/**
 *
 * @author Student
 */

public class JALIQUE_EXAM2 {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Choose Item Number: ");
 Scanner scn = new Scanner(System.in);
 int choice = scn.nextInt();
 switch(choice){
     case 1:
         Num1();
     case 2:
         Num2();
   
 }
    }
    public static void Num1(){
                LinkedList List = new LinkedList();
    
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.print("Enter Names(Type`done` if done): ");
            String data = scanner.nextLine();
           if (data == "done") {
                break;
            }
            System.out.print("Enter position: ");
            int position = scanner.nextInt();
            scanner.nextLine();
            List.insertAtPosition(data,position);
            List.display();
        }

       scanner.close();
    }
    public static void Num2(){
        LinkedList list = new LinkedList();
       Scanner scn = new Scanner(System.in);
        System.out.println("Fita, Pride Powder, Canola Oil, Nescafe Black Coffee, Ariel Powder, Rebisco");
        while (true) {
            System.out.print("Enter Names(Type`done` if done): ");
            String data = scn.nextLine();
           if (data == "done") {
                
            }
            System.out.print("Enter position: ");
            int position = scn.nextInt();
            scn.nextLine();
            list.insertAtPosition(data,position);
            list.display();
        
        System.out.println("Search Element:");
      String target = scn.nextLine();

        if (list.search(target)) {
            System.out.println(target + " is found in the shelf.");
        } else {
            System.out.println(target + " is not found in the shelf.");
        }
        }
    }
}
    
    

