public class Aufgabe6point1 {

    public boolean isDiagonal( double[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j<matrix[i].length;j++){
                if (i==j){
                    if (matrix[i][j] != 0){
                        return false;
                    }

                }
            }
        }
        return true;
    }
}
