public class Main {

    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Thief> thiefTeam = new Team<>();
        archers.addPers(new Archer("Робин", 100, new Bow(20), new IronBakler(6)))
                .addPers(new Archer("Гуд", 100, new Bow(15), new LargeTortoiseSheep(11)));
        thiefTeam.addPers(new Thief("Джек", 150, new Knife(), new ShieldedShiel(8)))
                .addPers(new Thief("Потрошитель", 150, new Knife(), new IronBakler(6)));
        System.out.println(archers);
        System.out.println();
        System.out.println(thiefTeam);
        System.out.println();
 

        Archer robin = new Archer("Робин", 50, new Bow(20), new IronBakler(6));
        Archer gud = new Archer("Гуд", 50, new Bow(50), new LargeTortoiseSheep(11));
        Battle fight = new Battle(robin,gud);
        fight.run();
        
    }


}