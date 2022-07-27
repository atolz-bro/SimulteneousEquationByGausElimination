import java.util.Arrays;

public class TestClass {
    public static void main(String[] args) {
        int [] row = {1,2,3};
        int scaleFactor = 3;

        //scaling by 3; we expect scale to return {3,6,9}
        int [] result = scaleTest(scaleFactor,row);
        System.out.println(Arrays.toString(result));

        //linearCombination Alias subtract second arr from first arr
        //if first arr is 3,6,9 and second arr 1,2,3
        //the result should be 2,4,6

        int [] result2 = linearCombinationTest(new int[]{3,6,9},new int[]{1,2,3});
        System.out.println(Arrays.toString(result2));
    }

    static int[] scaleTest(int scaleFactor,int[] row){
        return Calculate.scale(scaleFactor,row);
    }

    //Subtracts rowB from rowA
    static int[] linearCombinationTest(int [] rowA, int [] rowB){
        int [] rowR = new int[rowA.length];

        for(int i = 0; i < rowA.length; i++){
            rowR[i] = rowA[i] - rowB[i];
        }
        return rowR;
    }
}
