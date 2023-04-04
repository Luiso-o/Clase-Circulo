package ClaseCirculo;


public class App_Circunferencia {

	public static void main(String[] args) {
		
		Punto punto1=new Punto(2,5);
		Circulo circulo1=new Circulo(punto1,1);
		
		Punto punto2=new Punto(1,6);
		Circulo circulo2=new Circulo(punto2,7);
		
		System.out.println("La distancia entre circulos es de " + circulo1.distanciaCentro(circulo2));
		
		System.out.println("Son iguales?: " + circulo1.compararCirculo(circulo2));
		
		System.out.println("Son concentricos?: " + circulo1.sonConcentricos(circulo2));
		
		System.out.println("Tienen mismo radio?: " + circulo1.tienenIgualRadio(circulo2));
		
		System.out.println("Son tangentes?: " + circulo1.sonTangentes(circulo2));
		
		System.out.println("Son secantes?: " + circulo1.sonSecantes(circulo2));
		
		System.out.println("Se tocan?: " + circulo1.noSeTocan(circulo2));
		
	}

}
