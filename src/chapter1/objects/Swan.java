package chapter1.objects;

public class Swan {
    int numberEggs;

    public static void main(String[] args) {
        Swan mother = new Swan();
        mother.numberEggs = 1; // write instance variable
        System.out.println(mother.numberEggs); // read instance variable
    }
}
