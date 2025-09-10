/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bingo;

/**
 *
 * @author Andhika Eka Pratama
 */
public class Bingo {
    private String name;
    private int clapCount;

    // Konstruktor
    public Bingo(String name, int clapCount) {
        this.name = name;
        this.clapCount = clapCount;
    }

    // Method untuk mencetak satu bagian lagu
    public void singVerse() {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And " + name + " was his name-o.");

        String[] letters = {"B", "I", "N", "G", "O"};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (j < clapCount) {
                    System.out.print("(clap)");
                } else {
                    System.out.print(letters[j]);
                }
                if (j < letters.length - 1) System.out.print("-");
            }
            System.out.println();
        }

        System.out.println("And " + name + " was his name-o.\n");
    }

    // Main method untuk menjalankan semua versi
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            Bingo verse = new Bingo("Bingo", i);
            verse.singVerse();
        }
    }
}
