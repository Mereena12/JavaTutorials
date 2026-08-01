package practice;

import java.util.Scanner;

class Book {
   
    String title;
    String author;
    double price;

 
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

  
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

 
        System.out.println("Enter details of Book 1:");
        System.out.print("Title: ");
        String title1 = sc.nextLine();
        System.out.print("Author: ");
        String author1 = sc.nextLine();
        System.out.print("Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine();

        
        System.out.println("\nEnter details of Book 2:");
        System.out.print("Title: ");
        String title2 = sc.nextLine();
        System.out.print("Author: ");
        String author2 = sc.nextLine();
        System.out.print("Price: ");
        double price2 = sc.nextDouble();

    
        Book book1 = new Book(title1, author1, price1);
        Book book2 = new Book(title2, author2, price2);

     
        System.out.println("\nBook Details:");
        book1.displayBook();
        book2.displayBook();

        sc.close();
    }
}