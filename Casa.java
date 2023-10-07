public class Casa extends Inmueble_vivienda {
    
    protected int numero_pisos;

    public Casa(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }
    
    public void imprimir(){
        super.imprimir();
        System.out.println("Numero de pisos: "+numero_pisos);
    }       
}
