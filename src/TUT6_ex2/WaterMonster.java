package TUT6_ex2;

public class WaterMonster extends Monster{
    public WaterMonster (String name){
        super(name);
    }
    public String attack(){
        return super.toString() +"I can attack with water";
    }
}
