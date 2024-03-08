package array;

public class reversestring {
    public static void main(String[] args) {
        String str = "Hola Mundo";
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }

    // Method to reverse a string
    public static String reverseString(String str) {
        // Convert the string to a character array
        char[] charArray = str.toCharArray();
        // Initialize pointers for the start and end of the array
        int start = 0;
        int end = charArray.length - 1;
        // Iterate until the pointers meet
        while (start < end) {
            // Swap characters at start and end indices
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            // Move the pointers towards each other
            start++;
            end--;
        }
        // Convert the character array back to a string
        return new String(charArray);
    }
}