public class Archer extends Warrior<Throwing, Armor>{

    public Archer(String name, int hp, Throwing weapon, Armor protect) {
        super(name, hp, weapon, protect);
    }

        public int range(){
            return rnd.nextInt(((Throwing)this.weapon).range+1);
        }



    @Override
    public String toString() {
        return super.toString();
    }
}
