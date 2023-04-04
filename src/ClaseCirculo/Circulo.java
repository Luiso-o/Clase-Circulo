package ClaseCirculo;

public class Circulo  {
	
	private int radio;
	private Punto centro;
	
	
	public Circulo(Punto centro,int radio)	{
		
		this.centro=centro;
		this.radio=radio;
		
	}
	
	//--------------------------------------
	
	public int getRadio() {
		return radio;
	}
	
	public Punto getCentro() {
		return centro;
	}
	
	//---------------------------------------
	
	public void setRadio(int radio) {
		this.radio=radio;
	}
	
	public void setCentro(Punto centro) {
		this.centro=centro;
	}
	
	//---------------------------------------------

	public float distanciaCentro(Circulo circulo2) {

		double distancia = Math.sqrt(Math.pow((centro.getPosicionX()-circulo2.centro.getPosicionX()), 2) + Math.pow((centro.getPosicionY()-circulo2.centro.getPosicionY()), 2));
		double distanciaEntreCircunferencias = distancia - (radio + circulo2.radio)*(-1);
				
		return (float) distanciaEntreCircunferencias;

	}
		
	public boolean compararCirculo(Circulo circulo2) {
		
		return(centro.equals(circulo2.centro) && radio==circulo2.radio);
		
	}
	
	public boolean sonConcentricos(Circulo circulo2) {
		
		return centro.equals(circulo2.centro);
		
	}
	
	public boolean tienenIgualRadio(Circulo circulo2) {
		
		return radio==circulo2.radio;	
	}
	
	public boolean sonTangentes(Circulo circulo2) {
		
		return radio!=circulo2.radio;

	}
		
	public boolean sonSecantes(Circulo circulo2) {
	
		double distancia=(Math.sqrt((centro.getPosicionX()-circulo2.centro.getPosicionX())*2)+((centro.getPosicionY()-circulo2.centro.getPosicionY())*2))-1;
		
		return distancia > (radio-circulo2.radio); 
			
	}
	
	public boolean noSeTocan(Circulo circulo2) {
	
		double distancia=(Math.sqrt((centro.getPosicionX()-circulo2.centro.getPosicionX())*2)+((centro.getPosicionY()-circulo2.centro.getPosicionY())*2))-1;
		
		return distancia == (radio+circulo2.radio);
	
	}
	
}
