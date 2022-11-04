public class Estudiant extends Persona{
    private String curs;

    public Estudiant(String nom, String cognom, String dni, String estatCivil, String curs) {
        super(nom, cognom, dni, estatCivil);
        this.curs = curs;
    }


    public String getCurs() {
        return curs;
    }
    public void setCurs(String curs) {
        this.curs = curs;
    }

    @Override
    public void ImprimirDades(){
        System.out.println("Curs:"+getCurs());
        System.out.println("Nom:"+getNom());
        System.out.println("Cognom:"+getCognom());
        System.out.println("Dni:"+getDni());
        System.out.println("EstatCivil:"+getEstatCivil());
    }
}
