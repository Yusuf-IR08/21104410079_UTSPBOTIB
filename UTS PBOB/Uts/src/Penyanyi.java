/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad Yusuf IBrahim Ramadhani
 * Kelas TI-B
 * 21104410079
 */
public class Penyanyi extends Pop {
      public static void main(String[] args) { 
          Pop pop = new Pop ("Black Pink", "How You Like That"); 
          Dangdut dangdut = new Dangdut();
          pop.singer("Eclat Story"); 
          pop.song("Bentuk Cinta"); 
          pop.cetakLabel();
          
          String penyanyi = "Joko Chandra"; 
          penyanyi1 = penyanyi; 
          penyanyi1 = Dangdut.Penyanyi; 
          dangdut.song("Via Vallen","Kopi Dangdut"); 
          dangdut.cetakLabel();
    }
    public static String penyanyi1;

}