package dz2_2;

public class gitara implements Instrument{
    int numberOfstring;
    gitara(int numberOfstring ) {
        this.numberOfstring = numberOfstring;
    }

    public void play() {
        System.out.println("Гитара использует "+numberOfstring+" струн");
    }
}
