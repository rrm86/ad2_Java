import java.io.*;
import java.util.*;

//Ainda falta separar em classes.
public class ad2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader in = null;
		List<String> linhas = new ArrayList();
		List<String> elementos = new ArrayList();
		List<String> contador = new ArrayList();
		Map<String,Integer> hash = new HashMap<String , Integer>();
		Map<String,Integer> hash_ordenado = new HashMap<String , Integer>();

		
		try{//Abre o arquivo
			in = new BufferedReader(new FileReader("/home/ronnald/workspace/ad2_1/src/texto.txt"));
			String str, chave;
			while((str = in.readLine()) != null){
				System.out.println(str);
				linhas.add(str);
				String[] parse = str.split("/");
				for(String sigla : parse){
					elementos.add(sigla);//Adiciona todos os valores da liha a lista elementos
				}
				elementos.add("FIM");//Adiciona FIM os termino da linha importante para calculos posteriores
			}
			in.close();
			//Tira a palavra fim e cria um mapa e outra lista com todos os valores repetidos
			for(int i=0; i<elementos.size()-1; i++){
				if(elementos.get(i) != "FIM"){
					if(elementos.get(i+1) !="FIM" ){
						chave = (elementos.get(i)+"/"+elementos.get(i+1));
						hash.put(chave,0);
						contador.add(chave);
					}
				
				}
			}
			//Efetua a calculo das rotas disponiveis
			for(String out: contador){
				System.out.println(out);
				hash.put(out, hash.get(out)+1);
			}
			//Implementar!: Ordenar por valor
			// Vou tentar um buble sort, comparar valores e depois armazenar
			
			//
			
			//Imprime o map
			for(String trecho : hash.keySet()){
				Integer valor = hash.get(trecho);
				System.out.println(trecho + " = " + valor);
			}
		}catch (IOException e){
			System.out.println(e);
			
		}

	}

}
