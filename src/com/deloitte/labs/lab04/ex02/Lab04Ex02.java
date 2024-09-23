package com.deloitte.labs.lab04.ex02;

abstract class Item {
    private int id;
    private String title;
    private int numberOfCopies;

    public Item(int id, String title, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
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

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public void checkIn() {
        numberOfCopies++;
    }

    public void checkOut() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
        } else {
            System.out.println("No copies available to check out.");
        }
    }

    public void addItem(int count) {
        numberOfCopies += count;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            Item other = (Item) obj;
            return id == other.id;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Copies: " + numberOfCopies;
    }

    public abstract void print();
}

abstract class WrittenItem extends Item {
    private String author;

    public WrittenItem(int id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", Author: " + author;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}

class Book extends WrittenItem {
    public Book(int id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies, author);
    }

    @Override
    public void print() {
        System.out.println("Book: " + super.toString());
    }
}

class JournalPaper extends WrittenItem {
    private int yearPublished;

    public JournalPaper(int id, String title, int numberOfCopies, String author, int yearPublished) {
        super(id, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year Published: " + yearPublished;
    }

    @Override
    public void print() {
        System.out.println("Journal Paper: " + this.toString());
    }
}

abstract class MediaItem extends Item {
    private int runtime;

    public MediaItem(int id, String title, int numberOfCopies, int runtime) {
        super(id, title, numberOfCopies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Runtime: " + runtime + " minutes";
    }

    @Override
    public void print() {
        System.out.println(this.toString());
    }
}

class Video extends MediaItem {
    private String director;
    private String genre;
    private int yearReleased;

    public Video(int id, String title, int numberOfCopies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, numberOfCopies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public void setYearReleased(int yearReleased) {
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return super.toString() + ", Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased;
    }

    @Override
    public void print() {
        System.out.println("Video: " + this.toString());
    }
}

class CD extends MediaItem {
    private String artist;
    private String genre;

    public CD(int id, String title, int numberOfCopies, int runtime, String artist, String genre) {
        super(id, title, numberOfCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist + ", Genre: " + genre;
    }

    @Override
    public void print() {
        System.out.println("CD: " + this.toString());
    }
}

public class Lab04Ex02 {
    public static void main(String[] args) {
        Book book = new Book(101, "The Great Gatsby", 3, "F. Scott Fitzgerald");
        book.print();
        book.checkOut();
        book.print();

        JournalPaper journalPaper = new JournalPaper(102, "Quantum Physics", 5, "Einstein", 1915);
        journalPaper.print();

        Video video = new Video(201, "Inception", 2, 148, "Christopher Nolan", "Sci-Fi", 2010);
        video.print();
        video.checkIn();
        video.print();

        CD cd = new CD(301, "Thriller", 4, 42, "Michael Jackson", "Pop");
        cd.print();
        cd.addItem(1);
        cd.print();
    }
}
