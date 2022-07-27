import java.util.Arrays;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols");
        int cols = sc.nextInt();
        System.out.println("Do you want to see the steps: y for yes N for no");
        String show = sc.next();

        int [][] system = new int[rows][cols];
        for (int i = 0; i < system.length; i++){
            System.out.println("Enter row "+i);
            for (int j = 0; j < cols; j++){
                system[i][j] = sc.nextInt();
            }
        }

        //Test case-----------------------------------------
        //int [][] system = {{1,0,1},{2,1,1},{-1,1,-2}};
        //int [][] system = {{1,2,3},{0,0,0},{0,1,1},{0,2,2}};
        //int [][] system = {{1,1,1},{-1,0,1},{1,2,3},{1,-1,-3}};
        //int [][] system = {{1,2,2},{0,3,0},{2,-1,-5},{-1,-1,3}};
        //int [][] system = {{2,1,-1,-2,11},{3,-1,1,-1,8},{-1,1,-1,0,-1},{1,1,1,1,-2}};
        //int [][] system = {{1,2,-3,1},{3,-1,2,7},{5,3,-4,2}};
        //int [][] system = {{1,-2,2,0},{2,1,-2,0},{3,4,-6,0},{3,4,-6,0},{3,-11,12,0}};

        for(int i = 0; i < system.length - 1; i++){
            if(show.equalsIgnoreCase("y"))
                System.out.println("pivotal row: row "+i);

            for(int j = i + 1; j < system.length; j++){
                if(show.equalsIgnoreCase("y"))
                    System.out.println("row"+j +" = " +system[i][i]+"*row" + j +" - "+system[j][i]+"*row "+ i);
                system[j] =
                        //Subtracts scaled pivotal row system[i] from corresponding scaled system[j] row below it
                        linearCombination(
                        //rows below pivotal is system[j] scaled by pivotal row coefficient
                        scale(system[i][i],system[j]),
                        //scaling pivotal row system[i] by system[j][0]
                        scale(system[j][i],system[i])
                );
            }
            if(show.equalsIgnoreCase("y"))
                System.out.println();
        }

        System.out.println(Arrays.deepToString(system));
    }

    static int[] scale(int scaleFactor,int[] row){
        int [] rtnRow = new int[row.length];

        for(int i = 0; i < row.length; i++){
            rtnRow[i] = scaleFactor * row[i];
        }

        return rtnRow;
    }

    //Subtracts rowB from rowA
    static int[] linearCombination(int [] rowA, int [] rowB){
        int [] rowR = new int[rowA.length];

        for(int i = 0; i < rowA.length; i++){
            rowR[i] = rowA[i] - rowB[i];
        }

        return rowR;
    }
}
