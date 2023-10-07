public class Inmueble{

    protected int identificador;
    protected int area;
    protected String direccion;
    protected int precioVenta;
    
    public Inmueble(int identificador, int area, String direccion) {
        this.identificador = identificador;
        this.area = area;
        this.direccion = direccion;
    }

    public int getIdentificador(){
        return identificador;
    }
    public void setIdentificador(int identificador){
        this.identificador = identificador;
    }
    public int getArea(){
        return area;
    }
    public void setArea(int area){
        this.area = area;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public double getPrecio(){
        return precioVenta;
    }
    public void setPrecio(int precioVenta){
        this.precioVenta = precioVenta;
    }

    public void calcularPrecioVenta(int valorArea){
        precioVenta = valorArea * area;
    }

    public void imprimir(){
        System.out.println("Identificador: "+identificador);
        System.out.println("Area(m²): "+area);
        System.out.println("Direccion: "+direccion);
        System.out.println("Precio de venta: $"+precioVenta);
    }
    

}
