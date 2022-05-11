package d14_api_StringBuild;

/**
 * 拼接,修改字符串用StringBuild
 */
public class Test {
     public static void main(String[] args) {
          int []arr1 = {11,88,150};
          System.out.println(api(arr1));

          int []arr2 = {};
          System.out.println(api(arr2));

          int []arr3 = null;
          System.out.println(api(arr3));
     }

     public static String api(int []arr ){
          if(arr != null){
               StringBuilder sb = new StringBuilder("[");
               for (int i = 0; i < arr.length; i++) {
                    sb.append(arr[i]).append(i == arr.length-1 ? "" : " ,");
               }
               sb.append("]");
               return sb.toString();
          }else
               return "字符串为空值";
     }
}
