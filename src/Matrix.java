public class Matrix<T> {

    private int [][] arr ;

    public Matrix(int row ,int cols){

        arr=new int[row][cols];
    }

    public int[][] getArr() {
        return arr.clone();
    }

    private T [][] a ;

}
