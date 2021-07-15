package Class1;

public class Homework3 {
    public static void main(String[] args) {
String sentence_1 = "Hello dear, how are you";
        System.out.println(sentence_1.length());

int result_1 = (23 >= 10) ? 100 : 15;
        System.out.println("result_1 = " + result_1);


        String sentence_2 ="We all ARe GOod ProgrAMmer";

        sentence_2 = sentence_2.replace('R', 'F');
        sentence_2 = sentence_2.replace('r', 'F');
        System.out.println(sentence_2);

        String sentence_3 = "ABC Networks";
        System.out.println(sentence_3.length());

        String result_3 = "";

        boolean isStartswith_aIgnoreCase = sentence_3.equalsIgnoreCase("a");
        System.out.println("is '" + sentence_3 + "'starts with (Ignore cases) 'a'? " + isStartswith_aIgnoreCase);
        boolean isEndswith_aIgnoreCase = sentence_3.endsWith("K");
        System.out.println("is '" + sentence_3 + "'ends with (Ignore cases) 'K'? " + isStartswith_aIgnoreCase);

        if (sentence_3.startsWith("a"))
                result_3 = "Media";
        else
                result_3 = "Entertainment";
            System.out.println(result_3);
































    }
}
