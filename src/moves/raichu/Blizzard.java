package moves.raichu;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Blizzard extends SpecialMove {

    static int cn = 0;
    public Blizzard(double pow, double acc) {
        super(Type.ICE, pow, acc);
    }

    public static int sum(){
        return cn;
    }



    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        cn++;
//        String s = Integer.toString(cn);
//        return "использует " + pieces[pieces.length - 1]+ " " + s +" й " + "раз";
        return "использует " + pieces[pieces.length - 1];
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            super.applyOppEffects(p);
            Effect.freeze(p);
        }


    }
}