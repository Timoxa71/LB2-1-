package mypokemons;

import moves.sharpedo.Slash;

public class Sharpedo extends Carvanha {
    public Sharpedo(String name, int level) {
        super(name, level);
        Slash slash = new Slash(70,100);
        addMove(slash);
    }
}
