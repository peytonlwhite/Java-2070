/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whitepeytonassignment13;

/**
 *
 * @author Peyton
 */
public class Book {
    
        private String title;
        private String author;
        private String publisher;
        private int year;
        
        
        
        /**
         * Postcondition: the object is created
         * @param title
         * @param author
         * @param publisher
         * @param year 
         */
        public Book(String title,String author,String publisher,int year){
            this.title = title;
            this.author = author;
            this.publisher = publisher;
            this.year = year;
        }
        
        /**
         * 
         * @return a string called full book displays description 
         */
        public String getDescription(){
            String fullBook = title + author + publisher + year;
            
            return fullBook;
        }
    
    
}
