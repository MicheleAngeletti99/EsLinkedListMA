import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Fruit> lista = new LinkedList<>();
        lista.add(new Fruit("Mela"));
        lista.add(new Fruit("Pera"));
        lista.add(new Fruit("Banana"));
        System.out.println("Lista iniziale");
        for (Fruit fruit : lista) {
            System.out.println(fruit);
        }

        lista.addFirst(new Fruit("Ananas"));
        lista.addLast(new Fruit("Mango"));
        System.out.println("Lista aggiornata");
        for (Fruit fruit : lista) {
            System.out.println(fruit);
        }
    }
}