public class Oficina extends Local{
    
    protected int valorArea;
    protected boolean esGobierno;
    
    public Oficina(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor del area por (m²): $"+valorArea);
        if (esGobierno) {
            System.out.println("Es del Gobierno: Si");
        } else {
            System.out.println("Es del Gobierno: No");
        }
    }

}
