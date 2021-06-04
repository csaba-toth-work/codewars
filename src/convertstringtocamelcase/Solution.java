package convertstringtocamelcase;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
    }

    static String toCamelCase(String s) {
        Matcher matcher = Pattern.compile("[_|-](\\w)").matcher(s);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(stringBuffer, matcher.group(1).toUpperCase());
        }
        return matcher.appendTail(stringBuffer).toString();
    }
}
