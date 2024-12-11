package mypokemons;

import moves.pichu.Swagger;
import moves.pichu.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pichu extends Pokemon {
    public Pichu(String name,int level){
        super(name,level);
        super.setType(Type.ELECTRIC);
        super.setStats(20,40,15,35,35,60);
        Swagger swagger = new Swagger(0,85);
        Thunderbolt thunderbolt = new Thunderbolt(90,100);
        setMove(swagger,thunderbolt);
    }
}
