package dz2_2;

public class baraban implements Instrument{
    int size;
    baraban(int size) {
        this.size = size;
    }
    public void play(){
        System.out.println("Играет барабан размером "+size+" см.");
    }
}
