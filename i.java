/*
 * Write a description of class i here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class i {
    String Alpha, Beta, Gamma;
    
    i(String a, String b, String c) {
        this.Alpha = a;
        this.Beta = b;
        this.Gamma = c;
    }
    
    public String toString() {
        return "Alphabet: " + this.Alpha + this.Beta + this.Gamma;
    }
}