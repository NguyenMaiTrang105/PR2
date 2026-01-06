package src.TUT6_ex2;

public class StoneMonster extends Monster {
    public StoneMonster (String name){
        super(name);
    }
    public String attack(){
        return super.toString()+"I can attack with stone";
    }
}
