package charset;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * 文字的编码与解码
 */
public class Test {
    public static void main(String[] args) {
        String s = "123我爱你中国";
        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        String s1 = new String(bytes);
        System.out.println(s1);
    }
}
