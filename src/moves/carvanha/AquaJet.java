package moves.carvanha;

import ru.ifmo.se.pokemon.*;

public class AquaJet extends PhysicalMove {
    public AquaJet(double pow, double acc,int priority, int hits){
        super(Type.WATER,pow,acc,priority,hits);
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "использует " + pieces[pieces.length-1];
    }

}
