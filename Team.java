import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Personage> implements Iterable<T>{
    List<T> personages = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return personages.iterator();
    }

    public Team<T> addPers (T personage){
        this.personages.add(personage);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (T personage:this) {
            res.append(personage)
                    .append("\n");
        }
        res.append(String.format("Минимальная броня от щита: %d\n",minProtectionShield()));
        return res.toString();
    }

    public int minProtectionShield (){
        int minProtect = 1000;
        for (T personage:this) {
                if(personage.protect.protect()<minProtect){
                    minProtect= personage.protect.protect();
                }
            }
        return minProtect;
    }
}


