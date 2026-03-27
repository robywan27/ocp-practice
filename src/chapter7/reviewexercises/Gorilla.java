package chapter7.reviewexercises;

record Gorilla(int x, Double y) {
    Gorilla {}
    Gorilla() { this(1,2.0);
    }
}
record Family(Gorilla parent1, Gorilla parent2) {
    public static void main(String[] args) {
        var family = new Family(
                new Gorilla(1, null), new Gorilla(0, 1.2));
    }
}
