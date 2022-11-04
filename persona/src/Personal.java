public class Personal extends Persona{
    private String anyIncoroporacio;
    private String numDespatx;
    private String seccio;

    public Personal(String nom, String cognom, String dni, String estatCivil, String anyIncoroporacio, String numDespatx, String seccio) {
        super(nom, cognom, dni, estatCivil);
        this.seccio = seccio;
        this.numDespatx = numDespatx;
        this.anyIncoroporacio = anyIncoroporacio;
    }

    public String getAnyIncorporacio() {
        return anyIncoroporacio;
    }
    public void setAnyIncoroporacio(String anyIncoroporacio) {
        this.anyIncoroporacio = anyIncoroporacio;
    }
    public String getNumDespatx() {
        return numDespatx;
    }
    public void setNumDespatx(String numDespatx) {
        this.numDespatx = numDespatx;
    }
    public String getSeccio() {
        return anyIncoroporacio;
    }
    public void setSeccio(String seccio) {
        this.seccio = seccio;
    }

    @Override
    public void ImprimirDades(){
        System.out.println("AnyIncorporacio:"+getAnyIncorporacio());
        System.out.println("NumDespatx:"+getNumDespatx());
        System.out.println("AnySeccio:"+getSeccio());
        System.out.println("Nom:"+getNom());
        System.out.println("Cognom:"+getCognom());
        System.out.println("Dni:"+getDni());
        System.out.println("EstatCivil:"+getEstatCivil());
    }

}
