package week1;

/*
 * Multi Dimensional Array
 */
public class MultiDimen {

    static int [][] arr = {
        {2,4,5},
        {8,5,2},
        {2,8,6}
    };
    public static void main(String[] args) {

        for(int row = 0 ; row < arr.length ; row++ ){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(" "+arr[row][col]);
            }
            System.out.println();
        }
    }


    
}
