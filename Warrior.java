import java.security.ProtectionDomain;
import java.util.Random;

public abstract class Warrior<W extends Weapon, A extends Armor> extends Personage{
protected static Random rnd = new Random();
    protected Weapon weapon;
    protected Armor protect;
    public Warrior(String name, int hp, Weapon weapon, Armor protect) {
        super(name, hp, protect);
        this.weapon = weapon;
        this.protect = protect;
        
    }
    public int harm(){
        boolean isHit = rnd.nextBoolean();
        int damage = 0;
        if (isHit){
            damage = rnd.nextInt(weapon.damage()+1);
        }
        return damage;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("Воин \n")
                .append(this.getName())
                .append(String.format("\n\tHp: %d", getHp()))
                .append(String.format("\n\tВооружен: %s", this.weapon))
                .append(String.format("\n\tБроня: %s", this.protect));
        return res.toString();
    }

}
