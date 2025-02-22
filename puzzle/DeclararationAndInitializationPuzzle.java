package puzle;

public class DeclararationAndInitializationPuzzle {

    public static void main(String args[]) {
        int x , y = 1;
        x = 10;
        //System.out.println(x);
        if (x != 10 && x / 0 == 0)
            System.out.println(y);
        else System.out.println(++y);
    }
}
