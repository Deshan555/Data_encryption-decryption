package ASCII;

public class Ascii_2_Word
{
    public static String WORDSentence(String string)
    {
        int len = string.length();

        String ASCII_Decoded  = null;

        int num = 0;

        for (int i = 0; i < len; i++)
        {
            num = num * 10 + (string.charAt(i) - '0');

            if (num >= 32 && num <= 122) {

                char ch = (char)num;

                num = 0;

                ASCII_Decoded = ASCII_Decoded + ch;
            }
        }

        ASCII_Decoded = ASCII_Decoded.replace("null", "");

        return ASCII_Decoded;
    }
}
