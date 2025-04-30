public class Book{
    String title;
    String author;
    int yearPublished;
    boolean isAvailable;

    public Book (String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished=yearPublished;
        isAvailable=true;
    }
    public void borrowBook(){
        if (isAvailable = true){
            isAvailable=false; 
            
        }else if(isAvailable = false){
            
        }
    }
    public void returnBook(){
        isAvailable=true;
        System.out.println("Book returned");

    }
    public String toString(){
        return "Title: " + title + ", Author " + author + ", Yearpublished: " + yearPublished + ", Available: " + isAvailable;
    }
}