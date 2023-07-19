package Unit_3.Practice.Fruts;

public class Main {
    public static void main(String[] args) {
        Fruts fructs = Fruts.valueOf("BANAN");
        System.out.println("fructs = " + fructs);
        switch (fructs){
            case APLE, BANAN, ORANGE -> System.out.println("Это фрукт " + fructs.name);
            default -> System.out.println("Неопознаный фрут");
        }
        for (Fruts v : Fruts.values()) {
            System.out.println(v);
        }
    }
}
