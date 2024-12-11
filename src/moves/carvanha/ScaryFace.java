package moves.carvanha;

import ru.ifmo.se.pokemon.*;

public class ScaryFace extends StatusMove {
    public  ScaryFace(double pow,double acc){
        super(Type.NORMAL,pow,acc);
    }

    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.SPEED,-2);
        p.addEffect(e);
    }

}
