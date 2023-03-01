import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> namesSet = new LinkedHashSet<>();
        String[] namesArray = {"Ali", "Veli", "Semavi", "Sami", "Hayati", "Memati", "Canan"};

        for (String name : namesArray) {
            namesSet.add(name);
        }
        System.out.println(namesSet);


    }
}