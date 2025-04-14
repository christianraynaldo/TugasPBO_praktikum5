package week7;

import java.util.Scanner;

// kelas Main (program utama)

public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        TextGame game1 = new TextGame();
        System.out.print("Masukkan kata pertama:");
        String text = scanner.nextLine();
        game1.displayResult(text);
        
        System.out.println();


        TextGame game2 = new FancyTextGame();
        System.out.print("Masukkan kata kedua:");
        String text2 = scanner.nextLine();
        game2.displayResult(text2);

        scanner.close();
    }
}