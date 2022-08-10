package airtelafricarevision;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatinCharacter {
    public static void main(String[] args) {

        String given="Aaabacde1ee";
        Character ch=nonRepeatingCharacter(given);
        System.out.println(ch);
    }

    private static Character nonRepeatingCharacter(String given) {
        Map<Character,Integer> seen=new LinkedHashMap<>();
        for (Character ch:given.toCharArray()
             ) {
            seen.put(ch,seen.getOrDefault(ch,0)+1);
        }
        for (Map.Entry<Character,Integer> frequency:seen.entrySet()
             ) {
            if(frequency.getValue()==1)
                return frequency.getKey();
        }
        return null;
    }
}
