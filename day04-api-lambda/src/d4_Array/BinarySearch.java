package d4_Array;

/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {11,55,23,69,84,45};
        System.out.println(binarySearch(arr, 69));
    }
    public static int binarySearch(int[]arr,int key){
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
             int middle = (left + right)/2;
             if(key>arr[middle]){
                 left = middle+1;
             }
             else if(key<arr[middle]){
                 right = middle-1;
             }else{
                 return middle;
             }
        }
        return -1;
    }
}
