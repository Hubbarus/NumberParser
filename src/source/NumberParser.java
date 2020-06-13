package source;

import java.util.*;

public class NumberParser{
    public static HashMap<String, Integer> map = new HashMap<>();

    static {
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("zero", 0);
        map.put("ten", 10);
        map.put("eleven", 11);
        map.put("twelve", 12);
        map.put("thirteen", 13);
        map.put("fourteen", 14);
        map.put("fifteen", 15);
        map.put("sixteen", 16);
        map.put("seventeen", 17);
        map.put("eighteen", 18);
        map.put("nineteen", 19);
        map.put("twenty", 20);
        map.put("thirty", 30);
        map.put("forty", 40);
        map.put("fifty", 50);
        map.put("sixty", 60);
        map.put("seventy", 70);
        map.put("eighty", 80);
        map.put("ninety", 90);
        map.put("hundred", 100);
        map.put("thousand", 1000);
        map.put("million", 1000000);

    }

    public static int parseInt(String numStr) {
        if (numStr.equals("zero") || numStr.equals("")) return 0;
        if (numStr.equals("one million")) return map.get("million");

        numStr = numStr.replaceAll(" and", "").trim();
        String[] arr = numStr.split(" ");

        if (arr.length > 1) {
            String word = Arrays.asList(arr).contains("thousand") ? "thousand" : "hundred";
            int mult = Arrays.asList(arr).contains("thousand") ? 1000 : 100;

            int ind = Arrays.asList(arr).indexOf(word);
            String[] tou = Arrays.copyOfRange(arr, 0, ind);
            String[] other = Arrays.copyOfRange(arr, ind + 1, arr.length);

            String t = "";
            String o = "";

            for (String s : tou) { t += s + " "; }
            for (String s : other) { o += s + " "; }

            return parseInt(t) * mult + parseInt(o);
        } else {
            if (numStr.contains("-")) {
                String[] dash = numStr.split("-");
                return parseInt(dash[0]) + parseInt(dash[1]);
            }
            return map.get(numStr);
        }
    }

}