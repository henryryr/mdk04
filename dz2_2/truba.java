package dz2_2;

public class truba implements Instrument{
    int diametr;
    truba (int diametr) {
        this.diametr = diametr;
    }
    public void play(){
        System.out.println("Играет труба диаметром "+diametr+" см.");
    }
}
