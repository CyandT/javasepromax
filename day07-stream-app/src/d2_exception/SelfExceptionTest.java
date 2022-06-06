package d2_exception;

/**
 * 自定义编译异常
 */
public class SelfExceptionTest {
    public static void main(String[] args) {
        try {
            ageCheck(-23);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
        }
    }

    public static void ageCheck(int age) throws AgeIllegalException{
        if(age>0 && age<200){
            System.out.println("您输入的年龄是正确的!");
        }else {
            throw new AgeIllegalException(age + " is illegal");
        }
    }
}

