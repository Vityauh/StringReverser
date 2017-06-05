import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        String word;
        Scanner read = new Scanner(System.in);
        System.out.print("Write a word for Martians: ");
        word = read.nextLine();
        main.reverser(word);

        System.out.println("Translate: " + main.reverser(word));
    }


    public String reverser(String word) {
        char [] charArray = word.toCharArray();
        int i = 0;
        int j = charArray.length-1;

        while (i<j) {
            char a = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = a;
            i++;
            j--;
        }

        return String.valueOf(charArray);
    }
}
