package src.TUT6_ex2;

public class Monster {
    private String name;
    public Monster (String name){
        this.name=name;
    }
    public String attack(){
        System.err.println("Monster unknown! I cannot attack!");
        return "I dont know how to attack";
    }
    public String toString(){
        return "Monster[name= "+ name +"]";
    }

}
