public class P17 {
    public static void main(String[] args) {
        int inp = 1234, out = 0;
       System.out.println("I/P: " + inp);
            while(inp != 0) {
            int digit = inp % 10;
            out = out * 10 + digit;
            inp /= 10;
        }
              System.out.println("O/P: " + out);
    }
}