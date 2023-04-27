public class ShieldedShiel extends Armor {
    private String name;

    public ShieldedShiel(int range) {
        super(range);
        this.name = "Расколотый щит";
    }
    @Override
    public int protect() {
        return 8;
    }
    
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(name)
                .append(String.format("\n\t%s", super.toString()));
        return res.toString();
    }
    
}
