package _SchoolStuff.selfStudy.Array;

// []                                -->  "no one likes this"
// ["Peter"]                         -->  "Peter likes this"
// ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
// ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
// ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
public class NameLikes {

    public static void main(String[] args) {

        String names[] = {"Alex", "Jacob", "Mark", "Max", "Jake", "John"};


        // if names == 2
            // print name1 and name2 likes this
        // else if name > 2
            // print name1, name2 and others like this
        //else
            // no one likes this

        if (names.length == 1) {
            System.out.println(names[0] + " like this");
        }
        else if (names.length == 2) {
                System.out.println(names[0] + " and " + names[1] + " like this");
            }
        else if (names.length == 3) {
                System.out.println(names[0] + ", " + names[1] + " and " + names[2] + " like this");
            }
        else if (names.length > 3){
                System.out.println(names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this");
            }
        else { System.out.println("no one likes this");}

        for (int i = 0; i > names.length; i++){

        }
    }
}