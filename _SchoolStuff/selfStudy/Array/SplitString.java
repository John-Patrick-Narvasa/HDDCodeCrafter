package _SchoolStuff.selfStudy.Array;

public class SplitString {
    public static void main(String[] args) {
        System.out.println(checkSameSwitch("Hello", "olleH"));
    }

    public static boolean checkSameSwitch(String w1, String w2) {
        String word = "";
        String word2 = "";

        String[] letters = word.split("");
        String[] letters2 = word2.split("");
        //redeclaration
        String startLetter = letters[0];
        String endLetter = letters[letters.length - 1];

        String startLetter2 = letters2[0];
        String endLetter2 = letters2[letters.length - 1];

        if (startLetter.equals(endLetter2) && endLetter.equals(startLetter2)) {
            // make a loop 
            // check if the letters are the same as reversed
            return true;
        }
        else {
            return false;
        }
    }
}
