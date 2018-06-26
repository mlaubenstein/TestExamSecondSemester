public class main {

    public static void main (String[]args) throws Aufgabe3point3Exception {

        System.out.println ( "Aufgabe 2.1" );
        Aufgabe2point1.machmal ();



        System.out.println ( "Aufgabe 5.1" );

        Aufgabe5point1 aufgabe5point1 = new Aufgabe5point1 (5,6,7);
        Aufgabe5point1 aufgabe5point11 = new Aufgabe5point1 ( 100,9 );

        System.out.println (aufgabe5point1.getElevation ());
        System.out.println (aufgabe5point1.getLatitude ());
        System.out.println (aufgabe5point1.getLongitude ());
        System.out.println (aufgabe5point11.getLatitude ());
        System.out.println (aufgabe5point11.getLongitude ());
        System.out.println (aufgabe5point1.getVerticalDistance () );
        System.out.println (aufgabe5point11.getVerticalDistance () );



        System.out.println ( "Aufgabe 6.1" );

        double[][] matrix = {{0,2,3,5},{1,0,0,0},{0,0,1,0}};
        Aufgabe6point1 aufgabe6point1 = new Aufgabe6point1 ();
        if (aufgabe6point1.isDiagonal ( matrix )== false){
            System.out.println ( "false" );
        }
        else if (aufgabe6point1.isDiagonal ( matrix ) == true){
            System.out.println ( "true" );
        }

        System.out.println ( "Aufgabe 6.2" );

        double[][] matrix2 = {{0,2,3},{1,0,0},{0,0,1}};
        Aufgabe6point2 aufgabe6point2 = new Aufgabe6point2 ();
        if (aufgabe6point2.isDiagonal ( matrix2 )== false){
            System.out.println ( "false" );
        }
        else if (aufgabe6point2.isDiagonal ( matrix2 ) == true){
            System.out.println ( "true" );
        }

        System.out.println ( "Aufgabe 6.3" );

        double[][] matrix3 = {{0,2,3},{1,0,0},{0,0,1}};
        Aufgabe6point3 aufgabe6point3 = new Aufgabe6point3 ();
        if (aufgabe6point3.isDiagonal ( matrix3 )== false){
            System.out.println ( "false" );
        }
        else if (aufgabe6point3.isDiagonal ( matrix3 ) == true){
            System.out.println ( "true" );
        }

        System.out.println ( " Aufgabe 7 " );
        Aufgabe7 aufgabe7 = new Aufgabe7 ();

    }
}
