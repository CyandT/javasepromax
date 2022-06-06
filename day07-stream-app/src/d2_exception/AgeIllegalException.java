package d2_exception;

/**
 * 继承exception类
 * 重写构造器
 */
public class AgeIllegalException extends Exception{
    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
