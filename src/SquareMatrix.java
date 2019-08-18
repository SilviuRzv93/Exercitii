public class SquareMatrix<T> extends Matrix<T> {




    public SquareMatrix(int size){

    super(size , size);


}

public T[] getPrimaryDiagonal(int size){

        for(int i =0; i<arr.length;i++){

            result[i]= arr[i][i];
        }


}





}
