package ASCII;

public class Word_2_Ascii
{
    public static String ASCIISentence(String str)
    {
        int l = str.length();

        String ASCII_Encoded  = null;

        int convert;

        for (int i = 0; i < l; i++)
        {
            convert = str.charAt(i);

            ASCII_Encoded = ASCII_Encoded + convert;
        }

        ASCII_Encoded = ASCII_Encoded.replace("null", "");

        return ASCII_Encoded;
    }
}
