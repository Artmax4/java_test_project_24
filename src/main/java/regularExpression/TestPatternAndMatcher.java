package regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPatternAndMatcher {
    public static void main(String[] args) {
        String text;
        text = "My name is Bob. Each day I drive my kids to school. My email@gmail.ru daughter goes to a school that’s far from our\n" +
                "takes 30 minutes to get there. Then I drive my son to his school. It’s close to my job. My daughter is in the\n" +
                " sixth grade and my son is in the second. They are both good students. My daughter usually sings her favorite\\n\" +" +
                " songs while I drive. My email mail@gmail.com usually sleeps.";

        Pattern email = Pattern.compile("(\\w+@)(gmail|yandex)\\.(com|ru)");
        Matcher matcher = email.matcher(text);

        while (matcher.find())
            System.out.println(matcher.group(3));


    }
}
