public class Oddposition {
    public static void main(String[] args) {
        String inp = "type here to search";
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) != ' ' && i % 2 != 0) {
                System.out.print(inp.charAt(i));
                }
            }
        }   
}
