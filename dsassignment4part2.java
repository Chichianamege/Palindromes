// Name: Chidera Anamege


import java.util.Scanner;
import java.util.Stack;

public class dsassignment4part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase(); // converted to lowercase

        if (isPalindrome(input)) { // this will check if the input string is a palindrome
            System.out.println("Yes, the string is a palindrome."); // print a message letting the user know it's a palindrome
        } else {
            System.out.println("No, the string is not a palindrome."); // print a message letting the user know it's not a palindrome
        }
    }

    public static boolean isPalindrome(String input) {
        Stack<Character> stack1 = new Stack<>(); // create first stack to hold characters of the input string
        Stack<Character> stack2 = new Stack<>(); // create second stack to hold characters of the input string
        Stack<Character> stack3 = new Stack<>(); // create a third stack to hold characters of the input string

        // push original string onto stack_1 and stack_2
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // get each character of the input string
            stack1.push(ch); // push the character onto stack1
            stack2.push(ch); // push the character onto stack2
        }

        // this will pop stack1 and push onto stack3 until stack1 is empty
        while (!stack1.isEmpty()) {
            stack3.push(stack1.pop()); // pop a character from stack1 and push onto stack3
        }

        // just to compare stack2 and stack3
        while (!stack2.isEmpty() && !stack3.isEmpty()) {
            if (!stack2.pop().equals(stack3.pop())) {
                return false; // this lets the system know if any characters don't match, it's not a palindrome
            }
        }
        return stack2.isEmpty() && stack3.isEmpty();
    }

}
