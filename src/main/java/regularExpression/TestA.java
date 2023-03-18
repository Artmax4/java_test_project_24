package regularExpression;

import java.util.Arrays;

public class TestA {
    public static void main(String[] args) {
        String a = "Hell2456oth4657erehe2366y";
        String[] words = a.split("\\d+");
        System.out.println(Arrays.toString(words));

        String b = "Hello there hey";

        String modifiedString = b.replace(" ", ". ");
        String modifiedString2 = b.replaceFirst("\\d+ ", "-");
        System.out.println(modifiedString);
        System.out.println(modifiedString2);
    }
}

