import java.util.Random;

public abstract class Personage {
    protected static Random rnd = new Random();
    private String name;
    private int hp;
    protected Armor protect;


    public boolean isAlive(){
        return hp>0;
    }

    public Personage(String name, int hp, Armor protect) {
        this.name = name;
        this.hp = hp;
        this.protect = protect;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
 
    public void reduceHp(int damage){
        this.hp-=damage;
        if(this.hp<0){
            this.hp=0;
        }
    }
}
