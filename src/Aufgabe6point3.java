 public class Aufgabe6point3{

     public boolean isDiagonal( double[][] matrix)throws Aufgabe3point3Exception {


         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j<matrix[i].length;j++){
                 if ( matrix[i].length != matrix.length ){
                     throw new Aufgabe3point3Exception ();
                 }
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
