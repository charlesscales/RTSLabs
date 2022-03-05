/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package solution;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 *
 * @author chip8
 */
public class Solution {

    public static LinkedHashMap<String, Integer> aboveBelow(ArrayList<Integer> input, int comparison)
    {
        LinkedHashMap <String, Integer> ret = new LinkedHashMap<String, Integer>();
        int aboveCount = 0;
        int belowCount = 0;
        for(int i: input)
        {
            if(i < comparison)
            {
                belowCount++;
            }
            else if(i > comparison)
            {
                aboveCount++;
            }
        }
        ret.put("above", aboveCount);
        ret.put("below", belowCount);
        return ret;
    }
    
    public static String stringRotation(String input, int rotationAmount)
    {
        StringBuilder in = new StringBuilder(input);
        int startPoint = input.length()-(rotationAmount % input.length());
        CharSequence csBegin = in.subSequence(startPoint, input.length());
        CharSequence csEnd = in.subSequence(0, startPoint);
        StringBuilder out = new StringBuilder(csBegin);
        out.append(csEnd);
        return out.toString();
    }

    public static void main(String[] args) {
        ArrayList<Integer> input1 = new ArrayList<Integer>();
        input1.add(1);
        input1.add(5);
        input1.add(2);
        input1.add(1);
        input1.add(10);
        System.out.println(aboveBelow(input1, 6));
        System.out.println(stringRotation("MyString", 2));
    }

}
