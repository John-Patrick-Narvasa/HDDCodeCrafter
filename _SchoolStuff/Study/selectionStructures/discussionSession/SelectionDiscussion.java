package _SchoolStuff.Study.selectionStructures.discussionSession;

public class SelectionDiscussion {
    public static void main(String[] args) {
        int a = 2, b = 3, c= 8;


        /*if(!(!(statement))) => true */

        if (!(!(a >= --b))){ //T cuz not*not = true

            if (!(b >= c)){ //nested if statements (T)
                c = a++ + --b; //2 +1  next line + (2-1) = c
                System.out.println(c); //output = 3
            }
            System.out.println(++a); // 3+1 output = 4
        }
        System.out.println(b); //if state is false and no else statement
        // output = 1
    }
}

// TODO MAKE A QUIZ ABOUT THIS and ARRAYS
