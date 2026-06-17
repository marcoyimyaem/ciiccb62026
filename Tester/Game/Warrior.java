package Tester.Game;

public abstract class Warrior extends GameCharacter {
    protected int armor;
    public Warrior(String name, int hp, int level,int armor) {
        super(name, hp, level);
        this.armor = armor;
    }
    public abstract void useSpecialMove();

}
