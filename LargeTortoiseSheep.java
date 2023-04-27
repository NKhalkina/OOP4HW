public class LargeTortoiseSheep extends Armor{
    private String name;

    public LargeTortoiseSheep(int range) {
        super(range);
        this.name = "Панцирь большой черепахи";
    }
    @Override
    public int protect() {
        return 11;
    }
    
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(name)
                .append(String.format("\n\t%s", super.toString()));
        return res.toString();
    }
}