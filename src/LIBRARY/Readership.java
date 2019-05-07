package LIBRARY;
public class Readership {
    public static void main(String[] args){
        Reader[] readerArray = {new Reader(),
        new Reader(),
        new Reader()
        };
        Book[] bookArray = {new Book(),
        new Book(),
        new Book()
        };
         Genre[] genreArray = {new Genre(),
         new Genre(),
         new Genre()
         };
        String [] reader = new String[5];
        reader[0] = "Имя читателя: [" +readerArray[0].getR1()[0]+"]" +" Возрост: ["+readerArray[0].getR1()[1]+"]"+" Пол: ["+readerArray[0].getR1()[2]+"]"+" ID: ["+readerArray[0].getR1()[3]+"]" + " Любимая книга: [" +bookArray[0].getBooks()[2]+"]"+" Любимый Жанр: ["+genreArray[0].getGenre()[2]+"]";
        reader[1] = "Имя читателя: [" +readerArray[0].getR2()[0]+"]" +" Возрост: ["+readerArray[0].getR2()[1]+"]"+" Пол: ["+readerArray[0].getR2()[2]+"]"+" ID: ["+readerArray[0].getR2()[3]+"]"+ " Любимая книга: [" +bookArray[0].getBooks()[3]+"]"+" Любимый Жанр: ["+genreArray[0].getGenre()[3]+"]";
        reader[2] = "Имя читателя: [" +readerArray[0].getR3()[0]+"]" +" Возрост: ["+readerArray[0].getR3()[1]+"]"+" Пол: ["+readerArray[0].getR3()[2]+"]"+" ID: ["+readerArray[0].getR3()[3]+"]"+ " Любимаые книги: [" +bookArray[0].getBooks()[4]+" /// "+bookArray[0].getBooks()[3] + "]" + " Любимый Жанр: ["+genreArray[0].getGenre()[1]+"]";
        reader[3] = "Имя читателя: [" +readerArray[0].getR4()[0]+"]" +" Возрост: ["+readerArray[0].getR4()[1]+"]"+" Пол: ["+readerArray[0].getR4()[2]+"]"+" ID: ["+readerArray[0].getR4()[3]+"]"+ " Любимая книга: [" +bookArray[0].getBooks()[5]+"]"+" Любимый Жанр: ["+genreArray[0].getGenre()[5]+"]";
        reader[4] = "Имя читателя: [" +readerArray[0].getR5()[0]+"]" +" Возрост: ["+readerArray[0].getR5()[1]+"]"+" Пол: ["+readerArray[0].getR5()[2]+"]"+" ID: ["+readerArray[0].getR5()[3]+"]"+ " Любимая книга: [" +bookArray[0].getBooks()[1]+"]"+" Любимый Жанр: ["+genreArray[0].getGenre()[4]+"]";
        for(String x: reader){
            System.out.println(x);
        }
    }
    
}