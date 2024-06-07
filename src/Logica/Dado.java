package Logica;

import java.util.Random;

/**
 * Classe che implementa la logica di un dado
 */
public enum Dado {
    SINGOLO(1,6),
    DOPPIO(2,12);
    private final int min;
    private final int max;
    Dado(int min, int max){
        this.min = min;
        this.max = max;
    }

    public int lancia(){
        return new Random().nextInt( min,max+1);
    }


}
