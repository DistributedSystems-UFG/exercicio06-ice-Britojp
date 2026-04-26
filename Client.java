import com.zeroc.Ice.*;

public class Client {
    public static void main(String[] args) {
        try (Communicator communicator = Util.initialize(args)) {
            ObjectPrx base = communicator.stringToProxy("SimplePrinter:default -h 98.90.53.6 -p 5678");
            Demo.PrinterPrx printer = Demo.PrinterPrx.checkedCast(base);

            if (printer == null) {
                throw new Error("Invalid proxy");
            }

            String printResponse = printer.printString("Hello from Goiania!");
            int sumResponse = printer.sum(10, 25);
            String upperResponse = printer.toUpper("ice distribuido");
            boolean palindromeResponse = printer.isPalindrome("arara");

            System.out.println("printString: " + printResponse);
            System.out.println("sum: " + sumResponse);
            System.out.println("toUpper: " + upperResponse);
            System.out.println("isPalindrome: " + palindromeResponse);

        } catch (LocalException e) {
            e.printStackTrace();
        }
    }
}
