
class Predicate {

    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
        boolean test(int a, int b, int c);
    }

    public static final TernaryIntPredicate allValuesAreDifferentPredicate =
            (a, b, c) -> a != b && a != c && b != c;
}
/*
class Main {
    public static void main(String[] args) {
        int[] ar = new Scanner(System.in).tokens().limit(3).mapToInt(Integer::parseInt).toArray();
        System.out.println(Predicate.allValuesAreDifferentPredicate.test(ar[0], ar[1], ar[2]) ? "True" : "False");
    }
}
*/