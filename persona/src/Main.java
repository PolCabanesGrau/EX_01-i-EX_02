public class Main {
    public static void main(String[] args) {

        System.out.println("Hola!");
        Persona p = new Persona("Pol","Garcia", "345672891R", "Casat");
        p.ImprimirDades();


        Personal l = new Personal("Hugo", "Perez", "983562782W", "Solter", "2002", "14", "Sala d'Estudis");
        l.setSeccio("Educacio");
        l.ImprimirDades();

        Estudiant e = new Estudiant("Sergi", "Mases", "563739289F", "Solter", "2n Eso");
        e.ImprimirDades();

        Professor f = new Professor("Christian", "Tudela", "526781902L", "Casat", "Informatica");
        f.ImprimirDades();
    }
}
