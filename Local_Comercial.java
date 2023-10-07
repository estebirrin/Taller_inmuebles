public class Local_Comercial extends Local{
    
    protected int valorArea;
    protected String centroComercial;
    
    public Local_Comercial(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor del area por (m²): $"+valorArea);
        System.out.println("Centro comercial: "+centroComercial);
    }
}