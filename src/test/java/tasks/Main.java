package tasks;

public class Main {
    public static void main(String[] args) {

        /*
        \\d - одна цифра
        + - один или более
        * - 0 или более
        ? - символ, который идет до "?" может быть, а может и не быть
        (x|y|z) - одно из множеств
        [a-z] - все буквы английского алфавита в нижнем регистре
        [a-zA-Z] - все буквы английского алфавита в любом регистре
        [0-9] - все возможные цифры
        [^abc] - букв abc не должно быть в строке (указывать в нужном регистре)
        {2} - два символа
        {2,} - от двух до бесконечности
        {2,4} - от двух до четырех
        \\w - одна буква ( \\w = [a-zA-Z] )
        ^abc - что символы abc должны быть в начале строки (в этой же последованости)
        abc$ - что символы abc должны быть в конче строки (в этой же последованости)
        . - любой символ



        String url = "https://www.google.com"; //домен должен быть либо com либо de
        System.out.println(url.matches("https://www\\..+\\.(com|de)"));

        String url2 = "https://www.google.com"; // домен может быть из букв английского алфавита в нижнем регистре, любое количество букв
        System.out.println(url2.matches("https://www\\..+\\.[a-z]+"));

        String url3 = "https://www.google.com/login"; //после домена должен быть слэш, после слэша любое количество любых символов
        System.out.println(url3.matches("https://www\\..+\\.[a-z]+/.+"));

        String c = "+999";
        System.out.println(c.matches("\\+\\d+")); // экранирование символа +
         */

        String a = "hello";
        System.out.println(a.matches("\\w"));

    }
}
