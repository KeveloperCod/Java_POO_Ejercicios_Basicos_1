package semana_01;

public class Trabajador {
	
	/*Declarar atributos publicos :  codigo (int),nombre (String), 
	 * horas trabajadas (int) y tarifa horaria (double) */

	public int codigo, horasT;
	public String nombre ;
	public double tarifaH;
	
	
	//Un metodo que retorne el sueldo bruto (horas * tarifa)
	
	public double sBruto()
	{
		return horasT*tarifaH;

	}
	
	//Un metodo que retorne el descuento de acuerdo a la siguiente tabla
	public double descuento()
	{
		if (sBruto() < 4500)return 0.12*sBruto(); 
			else if (sBruto()<6500){return 0.14*sBruto();}
				else{return 16/100*sBruto();}
	}
	
	public double sNeto(){
		return sBruto()- descuento();
	}
}
