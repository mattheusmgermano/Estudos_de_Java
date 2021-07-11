
public class Main {

	public static void main(String[] args) {
//		Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas).
//		Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui a
//		maior área.
		
		double[] tx = new double[3];
		tx[0] = 3.00;
		tx[1] = 4.00;
		tx[2] = 5.00;
		var px = (tx[0] + tx[1] + tx[2]) / 2.0;
		
		double[] ty = new double[3];
		ty[0] = 7.50;
		ty[1] = 4.50;
		ty[2] = 4.05;
		var py = (ty[0] + ty[1] + ty[2]) / 2.0;
		
		var areatx = Math.sqrt(px* (px - tx[0]) * (px - tx[1]) * (px - tx[2]));
		
		var areaty = Math.sqrt(py* (py - ty[0]) * (py - ty[	1]) * (py- ty[2]));
		
		if(areatx > areaty) {
			System.out.println("A maior área é do triângulo X, com o valor: " + areatx);
		}else {
			System.out.println("A maior área é do triângulo Y, com o valor: " + areaty);
		}
	}

}
