package com.objectorientedprogramming;

public class Book {
    int bookID;
    String bookName;
    String bookAuthor;
    int bookPrice;
    public void display(int bookID, String bookName, String bookAuthor, int bookPrice){
        this.bookID = bookID;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
        System.out.println("-------------------------------------------------" +
                "---------------------------------------------------");
        System.out.println("Book ID: " + this.bookID);
        System.out.println("Book Name: " + this.bookName);
        System.out.println("Book Author: " + this.bookAuthor);
        System.out.println("Book Price: " + this.bookPrice);
        System.out.println("-------------------------------------------------" +
                "---------------------------------------------------");
    }
    public static void main(String args[]){
        Book book = new Book();
        System.out.println("Book Details : ");
        book.display(452,"Rumours","Rishi",5263);
        book.display(689,"Angry","Isha",6396);
        book.display(9687,"Happy","Krish",9658);
    }
}
