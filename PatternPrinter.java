// This program is to make a pattern while using only the variables given and not introducing others
public class PatternPrinter
{
    public static void main(String[] args)
    {
        //main method begins execution of Java application

        int x = 2;
        char star ='*';
        String Prefix = "- - ->";

        System.out.printf("%s%c" + (x - 1) + ("\n"), Prefix, star);// "%s" placeholder for a string
        System.out.printf("%s%c" + (x * 6) + ("\n"), Prefix, star);// "%c" placeholder for a char
        System.out.printf("%s%c" + (x * 62) + ("\n"), Prefix, star);
        System.out.printf("%s%c" + (x * 623 - 1) + ("\n"), Prefix, star);
        System.out.printf("%s%c" + (x * 6228) + ("\n"), Prefix, star);
    }// end method main
}// end class Greeter
