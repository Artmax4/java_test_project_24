package regularExpression;

public class Test {
    public static void main(String[] args) {
        /*
        \\d - одна цифра
        \\w - одна буква =    [a-zA-Z]
         +  - 1 или более
         *  - 0 или более
         ? - символ может быть или не быть 0 или 1 до
         (x |y | z) -  или   одно из множества строк
         (a|s|d|f|g|h|A|S|D|F|G|H) - одна строка из множества строк
         [a-zA-Z] - все английские буквы
         [asd] = (a|s|d)
         [0-9] - \\d
         [^asde] - отрицает эти символы
         . - любой символ

         {2}   = 2 символа до
         {2,}    = 2 или более символа
         {2, 4}  - от двух до 4
        */

        String a = "-14626";
        String b = "45235";
        String c = "+2154";
        System.out.println(c.matches("(-|\\+)?\\d*"));
        System.out.println(b.matches("(-|\\+)?\\d*"));
        System.out.println(a.matches("(-|\\+)?\\d*"));

        String d = "k3145";
        System.out.println(d.matches("[a-zA-Z31]+\\d+"));

        String e = "hello";
        System.out.println(e.matches("[^abc]*"));

        String url = "http://www.google.com";
        String url2 = "http://yandex.ru";
        String url3 = "hello there!";
        System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)"));
        System.out.println(url3.matches("http://www\\..+\\.(com|ru)"));

        String f = "12";
        System.out.println(f.matches("\\d{2}"));
    }
}
