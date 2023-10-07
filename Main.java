
public class Main {

    public static void main(String[] args) {

System.out.println("");       
System.out.println("Casa Rural:");
System.out.println("");

        Casa_Rural casaRural = new Casa_Rural(2, 300, "Cl.23 #22-35");
        casaRural.numero_pisos = 1;
        casaRural.valorArea = 1500000;
        casaRural.distanciaCabecera = 10;
        casaRural.altitud = 1000;
        casaRural.numero_baños = 3;
        casaRural.numero_habitaciones = 4;        
        casaRural.calcularPrecioVenta(1500000);
        casaRural.imprimir();

System.out.println("");
System.out.println("Casas Urbanas");
System.out.println("Casa Independiente:");
System.out.println("");

        Casa_Independiente casaIndependiente = new Casa_Independiente(3, 150, "Cl.22 #2-35");
        casaIndependiente.numero_pisos = 3;
        casaIndependiente.valorArea = 3000000;
        casaIndependiente.numero_baños = 3;
        casaIndependiente.numero_habitaciones = 4;
        casaIndependiente.calcularPrecioVenta(3000000);
        casaIndependiente.imprimir();

System.out.println("");
System.out.println("Casa Conjunto Cerrado:");
System.out.println("");

        Casa_Conjunto_Cerrado casaConjuntoCerrado = new Casa_Conjunto_Cerrado(4, 180, "Cl.22 #22-5");
        casaConjuntoCerrado.numero_pisos = 2;
        casaConjuntoCerrado.valorArea = 2500000;
        casaConjuntoCerrado.numero_baños = 3;
        casaConjuntoCerrado.numero_habitaciones = 4;
        casaConjuntoCerrado.valorAdministracion = 100000.0;
        casaConjuntoCerrado.tienePiscina = true;
        casaConjuntoCerrado.tieneCamposDeportivos = true;
        casaConjuntoCerrado.calcularPrecioVenta(2500000);
        casaConjuntoCerrado.imprimir();

System.out.println("");
System.out.println("Apartamentos ");
System.out.println("Apartamento Familiar:");
System.out.println("");

        Apartamento_Familiar apartamentoFamiliar = new Apartamento_Familiar(5, 80, "Cl.32 #22-35");
        apartamentoFamiliar.numero_habitaciones = 2;
        apartamentoFamiliar.numero_baños = 1;
        apartamentoFamiliar.valorArea = 2000000;
        apartamentoFamiliar.valorAdministracion = 50;
        apartamentoFamiliar.calcularPrecioVenta(2000000);
        apartamentoFamiliar.imprimir();

System.out.println("");
System.out.println("Aparta Estudio:");
System.out.println("");

        ApartaEstudio apartaEstudio = new ApartaEstudio(6, 50, "Cl.44 #22-35");
        apartaEstudio.numero_habitaciones = 1;
        apartaEstudio.numero_baños = 1;
        apartaEstudio.valorArea = 1500000;
        apartaEstudio.calcularPrecioVenta(1500000);
        apartaEstudio.imprimir();

System.out.println("");
System.out.println("Locales");
System.out.println("Local Comercial:");
System.out.println("");

        Local_Comercial localComercial = new Local_Comercial(7, 120, "Cl.34 #22-35");
        localComercial.valorArea = 3000000;
        localComercial.centroComercial = "Downtown Mall";
        localComercial.calcularPrecioVenta(3000000);
        localComercial.imprimir();

System.out.println("");
System.out.println("Oficina: ");
System.out.println("");    

        Oficina oficina = new Oficina(8, 80, "Cl.5 #22-35");
        oficina.valorArea = 3500000;
        oficina.esGobierno = false;
        oficina.calcularPrecioVenta(3500000);
        oficina.imprimir();
    }
}