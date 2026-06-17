package Tester.Game;

public abstract class GameCharacter {
    protected String name;
    protected int hp;
    protected int level;

    public GameCharacter(String name,int hp,int level){
        this.name = name;
        this.hp = hp;
        this.level = level;
    }
    public abstract String getJobTitle();

}
