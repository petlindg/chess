// Class for coordinates of chess squares as object

public class Coordinate {
    private int n
    private char c
    
    //constructor
    public Coordinate coordinate(int n, char c) {
        this.n=n;
        this.c=c;
    }
    
    public int getCoordsNum() {
        return this.n;
    }
    
    public char getCoordsChar() {
        return this.c;
    }
    
    
}
