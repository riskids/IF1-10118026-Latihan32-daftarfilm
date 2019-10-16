/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarfilm;

/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deksripsi Program : Program ini berisi program untuk menampilkan daftar film
 * yang sudah di inputkan terlebih dahulu dan berbasis objek oriented
 */
public class Daftarfilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("===Dafttar Film Sedang Tayang===");
       System.out.println("");
        
       Film film = new Film();
       
       film.Name = "Venon";
       film.Genre= "Action, Horror, Scifi";
       film.Rating = 8.5;
       film.Duration = 120;
       film.nowPlaying(film.Name,film.Genre,film.Rating,film.Duration);
       
       Film film1 = new Film();
       
       film1.Name = "Small Foot";
       film1.Genre= "Animation";
       film1.Rating = 9.0;
       film1.Duration = 96;
       film1.nowPlaying(film1.Name,film1.Genre,film1.Rating,film1.Duration);
       
       Film film2 = new Film();
       
       film2.Name = "Crazy Rich Asian";
       film2.Genre= "Comedy";
       film2.Rating = 7.8;
       film2.Duration = 119;
       film2.nowPlaying(film2.Name,film2.Genre,film2.Rating,film2.Duration);
       
       Film film3 = new Film();
       
       film3.Name = "Asih";
       film3.Genre= "Horror";
       film3.Rating = 6.0;
       film3.Duration = 100;
       film3.nowPlaying(film3.Name,film3.Genre,film3.Rating,film3.Duration);
    }
    
}
