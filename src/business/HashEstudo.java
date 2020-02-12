package business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bean.Basico;

public class HashEstudo {
	
	private static boolean NUMEROS_PARES = true;
	private static boolean NUMEROS_IMPARES = false;
	
	public static void main(String[] args) {
		
		var lista = new ArrayList<Basico>();

		for (int i = 1; i <= 10; i++) {
			var bas = new Basico();			
			bas.setCodigo(i);
			lista.add(bas);
		}
		
		var map = processarLista(lista);
		
		imprimir(map);
	}

	private static HashMap<Boolean, List<Basico>> processarLista(ArrayList<Basico> lista) {
		HashMap<Boolean, List<Basico>> map = new HashMap<Boolean, List<Basico>>();
		
		map.put(NUMEROS_PARES, new ArrayList<Basico>());
		map.put(NUMEROS_IMPARES, new ArrayList<Basico>());
		
		for (Basico basico : lista) {
			if(basico.getCodigo() % 2 == 0) {
				map.get(NUMEROS_PARES).add(basico);
			}else{
				map.get(NUMEROS_IMPARES).add(basico);
			}
		}
		return map;
	}
	
	private static void imprimir(HashMap<Boolean, List<Basico>> map) {
		
		System.out.println("**PARES**");
		map.get(NUMEROS_PARES).forEach(p -> System.out.println(p.getCodigo()));
		System.out.println("**IMPARES**");
		map.get(NUMEROS_IMPARES).forEach(p -> System.out.println(p.getCodigo()));
	
	}
}
