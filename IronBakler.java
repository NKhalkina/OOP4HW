public class IronBakler extends Armor{
    private String name;

    public IronBakler(int range) {
        super(range);
        this.name = "Железный баклер";
    }
    @Override
    public int protect() {
        return 6;
    }
    
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(name)
                .append(String.format("\n\t%s", super.toString()));
        return res.toString();
    }
}
