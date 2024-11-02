import java.nio.charset.StandardCharsets;

public class test4 {
   
    public static void main(String[] args) {
        String input = "a";
       
        byte[] b="hello".getBytes();
       // System.out.println(b);
       for( byte i : b)
       {
        System.out.println(i);
       }

        String result = convertByteArraysToBinary(input.getBytes(StandardCharsets.UTF_8));

        System.out.println(result);
    }
    public static String convertByteArraysToBinary(byte[] input) {

        StringBuilder result = new StringBuilder();
        for (byte b : input) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                result.append((val & 128) == 0 ? 0 : 1);      // 128 = 1000 0000
                val <<= 1;
            }
        }
        return result.toString();

    }
    
}
