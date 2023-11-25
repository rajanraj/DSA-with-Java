package numberPrograms;
import java.util.Arrays;
/**
 * This Class will do all the sorting related performance for numbers.
 */
public class SortingNumbers {    public static void main(String[] args) {
        int[] arr={3,7,5,9,1,0};
        sortIntArray(arr);
    }
    public static int[] sortIntArray( int[] intArr) {
        int temp =0;
        for(int i =0; i<intArr.length; i++) {
            for(int j=i+1;j<intArr.length; j++){
                if(intArr[i]>intArr[j]){
                    temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }

        }
        Arrays.stream(intArr).forEach(e-> System.out.println(e));
        return intArr;
    }
}
