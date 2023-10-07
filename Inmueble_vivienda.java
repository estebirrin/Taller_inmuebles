public class Inmueble_vivienda extends Inmueble {

    
    protected int numero_habitaciones;
    protected int numero_baños;
   
    public Inmueble_vivienda(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }

    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de habitaciones: "+numero_habitaciones);
        System.out.println("Numero de baños: "+numero_baños);
    }   
    
}
