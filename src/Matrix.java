public class Matrix<T> {

    private T [][] arr ;
    public Matrix(int row ,int cols){

        arr = (T[][])new Object[1][2];
    }

    public T[][] getArr() {
        return arr;
    }
}
