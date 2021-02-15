/*
Michael Russi
BCS 345
 */
package assignment01;

public class Assignment01 {

    public static void main(String[] args) {
       
        /*
        This assignment requires a loop that will print all of the even numbers in the range of 0 to 100.
        
        To begin, we initialize the loop on line 32
            the integer variable i serves as the counter for the for loop, and doubles as the number
            we will use to count up from. Letting the loop run until i is less than 101
            is the same as letting it run until it is less than or equal to 100
            because that way it will not count any higher than we need it to.
        
        The assignment needs only one line (more could be added for easier readability) but this way
            it highlights its simplicity: a println function of the System object to print the output
            on its own line every time the code runs,
        
            and an if statement to specify when that code does run: when the remainder of the division
            of i and 2 equals 0, meaning that the number is even. This is because any even number can be divided
            by 2 with no remainder. With the if statement the way it is, i will not be printed if it is
            anything but an even number.
        */
        
        for (int i = 0; i < 101; i++) {
            if(i%2==0) System.out.println(i);
        }
    }
    
}