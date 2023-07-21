import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "how are you?";
        char [] array = new char[4];
        array[0] = string1.charAt(0);
        array[1] = string1.charAt(1);
        array[2] = string2.charAt(string2.length()-2);
        array[3] = string2.charAt(string2.length()-1);
        System.out.println(Arrays.toString(array));
      }
    }
