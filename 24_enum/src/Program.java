import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) {
		
//		� um tipo especial que serve para especificar de forma
//		literal um conjunto de constantes relacionadas.
//		
//		Palavra chave em java: enum;
//		
//		Vantagem: melhor sem�ntica, c�digo mais leg�vel e aux-
//		iliado pelo compilador.
//		
		var order1 = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order1);
		
		var orderStatus = OrderStatus.DELIVERED;
		var orderStatus2 = OrderStatus.valueOf("SHIPPED");
		System.out.println(orderStatus + " " + orderStatus2);
		
		//Nota��o UML para um tipo Enumerado
		//Acrescentar ": int = 0;"
		
	}
}
