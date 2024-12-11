package mypokemons;

import moves.pikachu.Nuzzle;

public class Pikachu extends Pichu{

    public Pikachu(String name, int level) {
        super(name, level);
        super.setStats(35,55,40,50,50,90);
        Nuzzle nuzzle = new Nuzzle(20,100);
        addMove(nuzzle);
    }
}
