public class Persona {
    private String nom;
    private String cognom;
    private String dni;
    private String estatCivil;

    public Persona(String nom, String cognom, String dni, String estatCivil) {
        this.nom = nom;
        this.cognom = cognom;
        this.dni = dni;
        this.estatCivil = estatCivil;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getCognom() {
        return cognom;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getEstatCivil() {
        return estatCivil;
    }
    public void setEstatCivil(String estatCivil) {
        this.estatCivil = estatCivil;
    }

    public void ImprimirDades(){
        System.out.println("Nom:" + getNom());
        System.out.println("Cognom:" + getCognom());
        System.out.println("Dni:" + getDni());
        System.out.println("EstatCivil:" + getEstatCivil());
    }
}



