/*
 * Description: 
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class g extends i{
    String strG;
    int intRange;
    
    g(String a, String b, String c, String g, int r) {
        super(a, b, c);
        
        this.strG = g;
        this.intRange = r;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nHello World! " + this.strG + this.intRange;
    }
}