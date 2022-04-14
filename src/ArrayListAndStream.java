import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListAndStream {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(16);
        arrayList.add(12);
        arrayList.add(9);
        arrayList.add(7);
        arrayList.add(10);
        arrayList.add(19);
        arrayList.add(21);
        arrayList.add(27);
        arrayList.add(80);
        arrayList.add(56);
        arrayList.add(59);
        arrayList.stream()
                .sorted()
                .forEach(System.out::println);
        arrayList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        long count;
        count = arrayList.stream()
                .filter(n->n%2==0)
                .count();
        System.out.println(count);
        int min =arrayList.stream()
                .min(Integer::compareTo)
                .get();
        System.out.println(min);
        int max = arrayList.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(max);
        arrayList.stream()
                .filter(n->n>20)
                .sorted()
                .forEach(e-> System.out.println(e*10));
        int max1=arrayList.stream()
                .skip(5)
                .limit(10)
                .distinct()
                .max(Integer::compareTo)
                .get();
        System.out.println(max1);
        arrayList.stream()
                .skip(5)
                .limit(10)
                .map(n->n*10)
                .sorted(Comparator.reverseOrder())
                .forEach(n-> System.out.println(n+5));



    }
}
