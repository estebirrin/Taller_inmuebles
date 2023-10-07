public class Casa_Conjunto_Cerrado extends Casa_Urbana{
    
    protected int valorArea;
    protected double valorAdministracion;
    public boolean tienePiscina;
    public boolean tieneCamposDeportivos;
    
    public Casa_Conjunto_Cerrado(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor del area por (m²): $"+valorArea);
        System.out.println("Valor de la administracion: $"+valorAdministracion);
        if (tienePiscina) {
            System.out.println("Tiene piscina: Si");
        } else {
            System.out.println("Tiene piscina: No");
        }
        if (tieneCamposDeportivos) {
            System.out.println("Tiene campos deportivos: Si");
        } else {
            System.out.println("Tiene campos deportivos: No");
        }
    }
}