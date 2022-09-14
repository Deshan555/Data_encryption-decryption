package AES;

public class Key_Validation
{
    public static int validate_key(String key)
    {
        if (key.length() >= 16)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
