public class Matrix<T> {

    private T [][] arr ;
    public Matrix(int row ,int cols){

        arr = (T[][])new Object[1][2];
    }

    public T[][] getArr() {
        return arr;
    }

    public void write(T value , int row , int cols){





    }
    public T[]getRow(int row){

        T[] result = (T[])new Object[arr.length];
        return result;
    }

    public T[]getColumn(int cols){
        T[] result = (T[])new Object[arr.length];
        return result;
    }

}
