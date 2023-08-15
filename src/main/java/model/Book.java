package model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "book_id")
    private int id;

    private String title;
    private String publisher;

    private int year;

    private String ISBN;
    /*
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

     */


    public Book(int id, String title, String publisher, int year, String ISBN /*User user*/) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.ISBN = ISBN;
        //this.user = user;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }



    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", ISBN='" + ISBN + '\'' +

                '}';
    }
}
