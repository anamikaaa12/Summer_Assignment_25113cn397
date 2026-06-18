public class LowerToUppercase {
    public static void main(String[] args) {
        String input = "hello java 123";
        char[] chars = input.toCharArray();
        
        for (int i = 0; i < chars.length; i++) {
            // If the character is lowercase, subtract 32
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }
        }
        
        String result = new String(chars);
        System.out.println("Uppercase: " + result);
    }
}
