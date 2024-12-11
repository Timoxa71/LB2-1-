package moves.sharpedo;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Slash extends PhysicalMove {
    public Slash(double pow,double acc){
        super(Type.NORMAL,pow,acc);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }


}
