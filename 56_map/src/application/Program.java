package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class Program {
	public static void main(String[] args) {
//		Map<K,V>
//		? uma cole??o de pares chave/valor:
//			N?o admite repeti??es do objeto chave;
//			Os elementos s?o indexados pelo objeto chave (n?o possuem posi??o);
//			Acesso, inser??o e remo??o dos elementos s?o r?pidos.
//			
//		Uso comum: cookies, local storage, qualquer modelo chave-valor.
//		
//		Principais implementa??es:
//			HashMap: mais r?pido (opera??es O(1) em table hash) e n?o ordenado;
//			TreeMap: mais lento (opera??es O(log(n))) em ?rvore rubro-negra;
//			LinkedHashMap: velocidade intermedi?ria e ordenado por ordem de adi??o.
//			
//		M?todos importantes:
//			put(key, value), remove(key), containsKey(key), get(key)
//				baseado em equals e hashcode;
//				se equals e hashcode n?o existirem, utiliza compara??o de ponteiros
//				
//			clear()
//			size()
//			keySet() - retorna um Set<K>
//			values() - retorna um Collection<V>
		
//		cookiesExample();
		
		Map<Product, Integer> stock = new HashMap<>();
		var p1 = new Product ("Titanium Dildo", 999.99);
		var p2 = new Product ("Ultrasonic Whip for Dubious Purposes", 2999.99);
		var p3 = new Product ("Mystical Beer from Glacial Waters Brewed by Moses Descendants Born in July", 15999.99);
		stock.put(p1, 15000);
		stock.put(p2, 32000);
		stock.put(p3, 100);
		
		var p4 = new Product("Mystical Beer from Glacial Waters Brewed by Moses Descendants Born in July", 15999.99);
		
		System.out.println("Contains 'p4' key? " + stock.containsKey(p4)); // daria falso se n?o tivesse implementado m?todo equals/hash no tipo Product
		
		readMap(stock);
	}

	public static void cookiesExample() {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("username", "maria");
		cookies.put("email", "maria@maria.mar.ia");
		cookies.put("phone", "05133229988");
		
		cookies.remove("email");
		
//		readMap(cookies);
		
		cookies.put("phone", "05132238989");
		
//		readMap(cookies);
		
		System.out.println("Contains 'phone' key? " + cookies.containsKey("phone"));
		System.out.println("Contains 'phone' key? " + cookies.containsKey("zipcode"));
		System.out.println("Size:  " + cookies.size());
	}

	public static void readMap(Map<Product, Integer> cookies) {
		System.out.println("All cookies:");
		for(var key : cookies.keySet()) {
			System.out.println(key.getName() + ": " + cookies.get(key));
		}
	}
}
