import moves.raichu.Blizzard;
import mypokemons.*;
import ru.ifmo.se.pokemon.*;

import java.util.SortedMap;


public class Main{
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Kangaskhan("Kangaskhan", 100);
//        Pokemon p2 = new Carvanha("Carvanha",1);
//        Pokemon p3 = new Sharpedo("Sharpedo",1);
//        Pokemon p4 = new Pichu("Pichu",1);
//        Pokemon p5 = new Pikachu("Pikachu",1);
        Pokemon p6 = new Raichu("Raichu",100);





        b.addAlly(p1);
//        b.addAlly(p2);
//        b.addAlly(p3);
//        b.addFoe(p4);
//        b.addFoe(p5);
        b.addFoe(p6);


        b.go();
        System.out.print("Blizzard использовалось ");
        System.out.println(Blizzard.sum());
    }
}



