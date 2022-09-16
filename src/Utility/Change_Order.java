package Utility;

import java.util.ArrayList;

public class Change_Order
{
    public static StringBuilder change_order(String ascii)
    {
        StringBuilder ascii_input = new StringBuilder();

        ascii_input.append(ascii);

        ascii_input.reverse();

        System.out.println(ascii_input);

        return ascii_input;
    }
}
