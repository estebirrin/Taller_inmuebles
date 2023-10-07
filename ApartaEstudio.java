public class ApartaEstudio extends Apartamento{
    
    protected int valorArea;

    public ApartaEstudio(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Valor del area por (m²): $"+valorArea);
    }



}