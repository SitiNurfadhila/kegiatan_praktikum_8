/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import Model.Book;
/**
 *
 * @author Lenovo
 */
public interface BookService {
     public void addBook(Book book);

    public List<Book> findBookList();

    public Book findBookById(int id);

    public void updateBook(int id, Book book);

    public void removeBook(int id);

    public void updateBook(Book bookUpdate);
}
