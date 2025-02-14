import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public void setTitle(String title) {
        if (title.length() <= 100) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Title length exceeds 100 characters.");
        }
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        if (author.length() <= 100) {
            this.author = author;
        } else {
            throw new IllegalArgumentException("Author length exceeds 100 characters.");
        }
    }

    public String getAuthor() {
        return author;
    }

    public String getInfo() {
        return "Title: " + title + ", Author: " + author;
    }
}

class EBook extends Book {
    private String fileSize;

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileSize() {
        return fileSize;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", File Size: " + fileSize;
    }
}

class PrintedBook extends Book {
    private int pages;

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else {
            throw new IllegalArgumentException("Pages must be a positive integer.");
        }
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Pages: " + pages;
    }
}

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read the type of book
            String bookType = scanner.nextLine();

            // Read the attributes
            String[] attributes = scanner.nextLine().split(",");

            Book book;

            // Create and initialize the appropriate book object
            if (bookType.equals("EBook")) {
                EBook ebook = new EBook();
                ebook.setTitle(attributes[0].trim());
                ebook.setAuthor(attributes[1].trim());
                ebook.setFileSize(attributes[2].trim());
                book = ebook;
            } else if (bookType.equals("PrintedBook")) {
                PrintedBook printedBook = new PrintedBook();
                printedBook.setTitle(attributes[0].trim());
                printedBook.setAuthor(attributes[1].trim());
                printedBook.setPages(Integer.parseInt(attributes[2].trim()));
                book = printedBook;
            } else {
                System.out.println("Invalid book type.");
                return;
            }

            // Output the book information
            System.out.println("Book Info: " + book.getInfo());

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
