class Aufgabe3point3Exception extends Exception {

    private static final String errMsg = " Matrix ist nicht quadratisch ";

    public Aufgabe3point3Exception()
    {
        super(errMsg+"!");
    }


}
