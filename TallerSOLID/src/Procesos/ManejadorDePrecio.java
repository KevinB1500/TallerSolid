package Procesos;
import Postres.Postre;


public class ManejadorDePrecio {
	
	public double calcularPrecioFinal(Postre postre){
        double precioFinal;
        precioFinal=(postre.getPrecioParcial()+(postre.getPrecioParcial()*0.12))+(postre.getAderezos().size()*0.50);
        return precioFinal;
    }
	
	public String showPrecioFinal(Postre postre){
        return "Precio Final: $ " + calcularPrecioFinal(postre);
    }
}
