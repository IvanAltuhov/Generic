public class Main {
    public static void main(String[] args) {
        MagicBox<String> stringMagicBox = new MagicBox<String >(3);
        boolean add = stringMagicBox.add("ABC");
        boolean add1 = stringMagicBox.add("123");
        boolean add2 = stringMagicBox.add("321");

        System.out.println(add + " " + add1 + " " + add2);

        String pick = stringMagicBox.pick();

        System.out.println(pick);

        stringMagicBox.pick();
    }
}
