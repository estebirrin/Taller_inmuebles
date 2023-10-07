public class Casa_Independiente extends Casa_Urbana{
    
    public int valorArea;

    public Casa_Independiente(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor del area por (m²): $"+valorArea);
    }
}