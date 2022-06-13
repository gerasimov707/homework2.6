import java.util.*;

public class Main {
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        doTask3();
        doTask4();
    }

    private static List<Integer> integerList(int n) {
        List<Integer> list = new ArrayList<>(n);
        System.out.print("Generated list: ");
        for (int i = 0; i < n; i++) {
            list.add(RANDOM.nextInt());
        }
        System.out.println(list);
        return list;
    }

    private static void doTask1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer i : nums) {
            if (Objects.nonNull(i) && i % 2 == 1) {
                System.out.println(i + " ");
            }
        }
    }

    private static void doTask2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Set<Integer> set = new TreeSet<>();
        for (Integer i : nums) {
            if (Objects.nonNull(i) && i % 2 == 0) {
                set.add(i);
            }
        }
        for (Integer i : set) {

            System.out.println(i + " ");
        }
    }
    private static void doTask3(){
        List<String> strings = List.of("test", "tok", "TEST", "tok", "test", "test", "Test");
        System.out.println(new HashSet<>(strings));
    }
    private static void doTask4(){
        List<String> strings = List.of("test", "p", "TEST", "popopo", "test", "test", "popopo");
        Map<String, Integer> result = new HashMap<>();
        for (String s: strings) {
            if (result.containsKey(s)){
                result.put(s, result.get(s)+ 1);
            } else {
                result.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry: result.entrySet()){
            System.out.println(entry.getKey()+ ">" + entry.getValue());
        }
    }
}
