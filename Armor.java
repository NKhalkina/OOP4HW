public abstract class Armor implements Shield{
    int range;

    public Armor(int range) {
        this.range = range;
    }

    public int getRange() {
        return range;
    }
    @Override
    public String toString() {
        return String.format("Защита: %d", protect());
    }
    
}
