package mypokemons;

import moves.raichu.Blizzard;
import moves.raichu.ThunderShock;

public class Raichu extends Pikachu{
    public Raichu(String name,int level){
        super(name,level);
        super.setStats(60,90,55,90,80,110);
        ThunderShock thunderShock = new ThunderShock(40,100);
        Blizzard blizzard = new Blizzard(110,70);

        Blizzard blizzard1 = new Blizzard(110,70);


        //addMove(thunderShock);
        addMove(blizzard);

    }
}
