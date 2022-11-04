public class Professor extends Persona{
    private String departament;

    public Professor(String nom, String cognom, String dni, String estatCivil, String departament) {
        super(nom, cognom, dni, estatCivil);
        this.departament = departament;
    }


    public String getDepartament() {
        return departament;
    }
    public void setDepartament(String departament) {
        departament = departament;
    }

    @Override
    public void ImprimirDades(){
        System.out.println("Departament:" + getDepartament());
        System.out.println("Nom:" + getNom());
        System.out.println("Cognom:" + getCognom());
        System.out.println("Dni:" + getDni());
        System.out.println("EstatCivil:" + getEstatCivil());
    }

}
