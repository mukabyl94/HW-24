import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(6);
        set1.add(4);
        set1.add(41);
        set1.add(44);

        Set<Integer> set2 = new HashSet<>();
        set2.add(65);
        set2.add(5);
        set2.add(4);
        set2.add(41);
        set2.add(55);
        System.out.println(symmetricDifference(set1, set2));

    }
    public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set3 = new HashSet<>(set1);
        set3.removeAll(set2);
        set2.removeAll(set1);
        set3.addAll(set2);

        return set3;
    }
}