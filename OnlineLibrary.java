package com.company;
import java.util.Scanner;

class Library{
    String[] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBooks(String book){
        this.books[no_of_books]= book;
        System.out.println(book + " has been added.");
        no_of_books++;
    }

    void showAvailableBooks(){
        System.out.println("---------------------------------------------------------");
        System.out.println("Books available : ");
        for(int i=0;i<no_of_books;i++){
            if(books[i] == null){
                continue;
            }
           System.out.println("* "+ books[i]);
        }
//        for(String book : books){
//            if(book == null){
//                break;
//            }
//            System.out.println("* "+ book);
//        }
    }

    void issueBooks(String book){
        for(int i=0;i<no_of_books;i++){
            if(this.books[i].equals(book)) {
                System.out.println("The book has been issued.");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book doesn't exist.");
    }

    void returnBooks(String book){
        addBooks(book);
    }

}

public class OnlineLibrary {
    public static void main(String[] args) {

        Library centralLibrary = new Library();

        centralLibrary.addBooks("Rich Dad Poor Dad");
        centralLibrary.addBooks("Think and grow rich");
        centralLibrary.addBooks("Intelligent Investor");
        centralLibrary.addBooks("C++ by Bjarne Stroustrup");
        centralLibrary.addBooks("CLRS by M.I.T");

        centralLibrary.showAvailableBooks();

        centralLibrary.issueBooks("Rich Dad Poor Dad");

        centralLibrary.showAvailableBooks();

        centralLibrary.returnBooks("Rich Dad Poor Dad");

        centralLibrary.showAvailableBooks();


    }
}
