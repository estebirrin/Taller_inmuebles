public class Apartamento_Familiar extends Apartamento{
    
    protected int valorArea;
    public int valorAdministracion;
   
    public Apartamento_Familiar(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    } 

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor del area por (m²): $"+valorArea);
        System.out.println("Valor de la administracion: $"+valorAdministracion);
    }

}