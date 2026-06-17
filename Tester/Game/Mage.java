package Tester.Game;

public abstract class Mage extends GameCharacter {
    protected int mana;
    public Mage(String name, int hp, int level,int mana) {
        super(name, hp, level);
        this.mana = mana;
    }
    public abstract void useMagic();
}
