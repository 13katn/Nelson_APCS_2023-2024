public class SubstringPrinter
{
    public static void main(String[]args)
    {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        // dog
        System.out.println(sentence.substring(40,43));
        //fox
        System.out.println(sentence.substring(16,20));
        //zy
        System.out.println(sentence.substring(37, 40));
        //ox jum
        System.out.println(sentence.substring(17, 23));
        //g
        System.out.println(sentence.substring(42));
    }
}