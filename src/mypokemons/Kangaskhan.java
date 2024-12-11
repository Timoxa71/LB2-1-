package mypokemons;
import moves.kangaskhan.Bite;
import moves.kangaskhan.Confide;
import moves.kangaskhan.DoubleTeam;
import moves.kangaskhan.RockTomb;
import moves.raichu.Blizzard;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Kangaskhan extends Pokemon {
    public Kangaskhan(String name,int level){
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(105, 95, 80,40, 80, 90);
        RockTomb rockTomb = new RockTomb(60,95);
        DoubleTeam doubleTeam = new DoubleTeam();
        Confide confide = new Confide();
        Bite bite = new Bite(60,100);
        Blizzard blizzard = new Blizzard(110,70);
        Blizzard blizzard2 = new Blizzard(110,70);

        super.setMove(blizzard);


    }
}
