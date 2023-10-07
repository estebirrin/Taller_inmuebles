public class Casa_Rural extends Casa {
    
    protected int valorArea;
    public int distanciaCabecera;
    protected int altitud;
    
    public Casa_Rural(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor del area por (m²): $"+valorArea);
        System.out.println("Distancia a la cabecera: "+distanciaCabecera);
        System.out.println("Altitud: "+altitud);
    }
    
}
