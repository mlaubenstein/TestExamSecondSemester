public class Aufgabe2point1 {

    public static void  machmal(){

    int i;
    int j = 0;
    int [] array = {1,2,3,4};


    i = 2;
    j = j/i;
        System.out.println ( i+" "+j );

    i = 2;
    j = ++i*2;
        System.out.println ( i+" "+j );

    i = 0;
    j = --i*5;
        System.out.println ( i+" "+j );

    i = -2;
    j = (i+=2)-1;
        System.out.println ( i+" "+j );

    i = 0;
    j = i++ *array[2]++;

        System.out.println ( i+" "+j+" "+array[2] );

    }

}
