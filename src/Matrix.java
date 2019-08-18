public class Matrix {

    private int [][] arr ;

    public Matrix(int row ,int cols){

        arr=new int[row][cols];
    }

    public int[][] getArr() {
        return arr;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }
}
