public abstract class NameMain {
    public static void main(String [] args) {
        Name n = new Name("Noga", "Wallach");
        System.out.println(n.fullName());

        Name n2 = new Name("Nogi", "");
        System.out.println(n2.fullName());
    } 
}
