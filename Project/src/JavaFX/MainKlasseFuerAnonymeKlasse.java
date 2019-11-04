package JavaFX;

public class MainKlasseFuerAnonymeKlasse {
    public static void main(String[] args){
    rechne(() -> {
        System.out.println("interface : ");
    });
    }
    public static void rechne(InterfaceFuerAnonymeKlasse e){
            e = new InterfaceFuerAnonymeKlasse() {
                @Override
                public void rechne() {
                    System.out.println("test 2");
                }
            };
            e.rechne();
    }
}
