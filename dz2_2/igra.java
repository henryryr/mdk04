package dz2_2;

public abstract class igra implements Instrument{
    public static void main(String[] args){
        Instrument[] mustools = new Instrument[3];
        mustools[0] = new gitara(14);
        mustools[1] = new baraban(66);
        mustools[2] = new truba(30);


        for (Instrument obj : mustools){
            obj.play();
        }
    }
}
