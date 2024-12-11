package mypokemons;

import moves.carvanha.AquaJet;
import moves.carvanha.Leer;
import moves.carvanha.ScaryFace;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Carvanha extends Pokemon {
    public Carvanha(String name,int level) {
        super(name, level);
        super.setType(Type.WATER,Type.DARK);
        super.setStats(45, 90, 20, 65, 20, 65);

        ScaryFace scaryFace = new ScaryFace(0,100);
        AquaJet aquaJet = new AquaJet(40,100,1,1);
        Leer leer = new Leer(0,100);
        setMove(scaryFace,aquaJet,leer);
    }
}
