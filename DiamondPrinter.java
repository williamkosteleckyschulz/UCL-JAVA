//This program is to show to output a diamond shape pattern to show I understood the 3 different Print methods
public class DiamondPrinter
{
    public static void main(String[] args)
    {
        //main method begins execution of Java application

        //Option A: print(...)
        System.out.print("     *\n"); // "\n" is used to put the cursor down to the next line
        System.out.print("    * *\n");
        System.out.print("   *   *\n");
        System.out.print("  *     *\n");
        System.out.print(" *       *\n");
        System.out.print("  *     *\n");
        System.out.print("   *   *\n");
        System.out.print("    * *\n");
        System.out.print("     *\n");

        //Option B: println(...)
        System.out.println("     *"); /* here we don't need to put "\n" thanks to the println method which
        puts the cursor automatically down to the next line */
        System.out.println("    * *");
        System.out.println("   *   *");
        System.out.println("  *     *");
        System.out.println(" *       *");
        System.out.println("  *     *");
        System.out.println("   *   *");
        System.out.println("    * *");
        System.out.println("     *");

        //Option C: printf(...)
        System.out.printf("     *\n"); // the printf method is used for a placeholder (f --> format)
        System.out.printf("    * *\n");// we have to add "\n" to put the cursor down to the next line
        System.out.printf("   *   *\n");
        System.out.printf("  *     *\n");
        System.out.printf(" *       *\n");
        System.out.printf("  *     *\n");
        System.out.printf("   *   *\n");
        System.out.printf("    * *\n");
        System.out.printf("     *\n");
    }// end method main
}// end class Greeter