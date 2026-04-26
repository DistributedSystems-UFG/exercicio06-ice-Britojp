import com.zeroc.Ice.Current;

public class PrinterI extends Demo._PrinterDisp {
    @Override
    public String printString(String s, Current current) {
        return "Recebido: " + s;
    }

    @Override
    public int sum(int a, int b, Current current) {
        return a + b;
    }

    @Override
    public String toUpper(String s, Current current) {
        return s.toUpperCase();
    }

    @Override
    public boolean isPalindrome(String s, Current current) {
        String normalizedValue = s.replaceAll("\\s+", "").toLowerCase();
        String reversedValue = new StringBuilder(normalizedValue).reverse().toString();
        return normalizedValue.equals(reversedValue);
    }
}
