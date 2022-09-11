import java.util.*;
import java.lang.*;

public class ASCII
{
    // Java implementation for converting
// a string into it's ASCII equivalent sentence

    class GeeksforGeeks {

        // Function to compute the ASCII value of each
        // character one by one
        static void ASCIISentence(String str)
        {
            int l = str.length();
            int convert;
            for (int i = 0; i < l; i++) {
                convert = str.charAt(i);
                System.out.print(convert);
            }
        }

        // Driver function
        public static void main(String args[])
        {
            Scanner scan = new Scanner(System.in);

            String str = "arrow";

            System.out.println("ASCII Sentence:");

            ASCIISentence(str);
        }
    }
}
