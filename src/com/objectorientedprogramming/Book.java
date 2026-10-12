package com.objectorientedprogramming;

public class Book {
    int bookID;
    String bookName;
    String bookAuthor;
    int bookPrice;
    public static void Book(int bookID, String bookName, String bookAuthor, int bookPrice){
        Book book = new Book();
        book.bookID = bookID;
        book.bookName = bookName;
        book.bookAuthor = bookAuthor;
        book.bookPrice = bookPrice;
        System.out.println("-------------------------------------------------" +
                "---------------------------------------------------");
        System.out.println("Book ID: " + book.bookID);
        System.out.println("Book Name: " + book.bookName);
        System.out.println("Book Author: " + book.bookAuthor);
        System.out.println("Book Price: " + book.bookPrice);
        System.out.println("-------------------------------------------------" +
                "---------------------------------------------------");
    }
    public static void main(String args[]){
        System.out.println("Book Details : ");
        Book(452,"Rumours","Rishi",5263);
        Book(689,"Angry","Isha",6396);
        Book(9687,"Happy","Krish",9658);
    }
}
