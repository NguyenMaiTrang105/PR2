package src.TUT6_ex2;

public class FireMonster extends Monster{
    public FireMonster (String name){
        super(name);
    }
    public String attack(){
        return super.toString() +"I can attack with fire";
    }
}
