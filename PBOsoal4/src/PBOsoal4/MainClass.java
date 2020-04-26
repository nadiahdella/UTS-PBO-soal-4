/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOsoal4;

/**
 *
 * @author ADMIN
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Instructor myInstructor = new Instructor("Nadiah", "Della", "008 \n");
       
        TextBook myTextBook = new TextBook("Nanti Kita Cerita Tentang Hari Ini", "Marchella FP", "Gramedia \n");
       
        Course myCourse = new Course("Lika-liku Konflik Keluarga \n", myInstructor, myTextBook);
       
        System.out.println(myCourse);
    }
    
}
