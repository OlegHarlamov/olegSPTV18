package LIBRARY;
public class Lib{ 
    public static void main(String[] args){
        Author[] authorArray = {new Author(), 
            new Author(), 
                 new Author()                       
    };
        Book[] bookArray = {new Book(),
        new Book(),
        new Book()
        };
         Genre[] genreArray = {new Genre(),
         new Genre(),
         new Genre()
         };
         String [] books = new String[10];
        books[0] = "Title book: " + bookArray[0].getBooks()[0] + " author: " + authorArray[0].getAuthors()[0] + " genre: " +genreArray[0].getGenre()[0];
        books[1] = "Title book: " + bookArray[0].getBooks()[1] + " author: " + authorArray[0].getAuthors()[1] + " genre: " +genreArray[0].getGenre()[1];
        books[2] = "Title book: " + bookArray[0].getBooks()[2] + " author: " + authorArray[1].getAuthors()[2]+ " genre: " +genreArray[0].getGenre()[2];
        books[3] = "Title book: " + bookArray[0].getBooks()[3] + " author: " + authorArray[1].getAuthors()[3]+ " genre: " +genreArray[0].getGenre()[3];
        books[4] = "Title book: " + bookArray[0].getBooks()[4] + " authors: " + authorArray[1].getAuthors()[4] + ", " + authorArray[1].getAuthors()[5]+ " genre: " +genreArray[0].getGenre()[4];
        books[5] = "Title book: " + bookArray[0].getBooks()[5] + " author: " + authorArray[1].getAuthors()[5]+ " genre: " +genreArray[0].getGenre()[5];
        books[6] = "Title book: " + bookArray[0].getBooks()[6] + " authors: " + authorArray[1].getAuthors()[6]+ ", "+authorArray[1].getAuthors()[3]+ " genre: " +genreArray[0].getGenre()[3];
        books[7] = "Title book: " + bookArray[0].getBooks()[7] + " authors: " + authorArray[1].getAuthors()[7]+ ", "+authorArray[1].getAuthors()[10]+ " genre: " +genreArray[0].getGenre()[1];
        books[8] = "Title book: " + bookArray[0].getBooks()[8] + " authors: " + authorArray[1].getAuthors()[8]+ ",  "+authorArray[1].getAuthors()[9]+ " genre: " +genreArray[0].getGenre()[5];
        books[9] = "Title book: " + bookArray[0].getBooks()[9] + " authors: " + authorArray[1].getAuthors()[9]+ ", "+authorArray[1].getAuthors()[11]+ " genre: " +genreArray[0].getGenre()[2];
        for(String x: books){
            System.out.println(x);
        }
        
}    
}