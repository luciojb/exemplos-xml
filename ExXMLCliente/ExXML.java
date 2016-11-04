import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.classes.Clientes;
//import com.classes.ListClientes;
import com.persistencia.ManipXML;

public class ExXML {
	
	public static void main(String[] args) {

		List<Clientes> lista = new ArrayList<Clientes>();
		
		Clientes cli = new Clientes();
		cli.setCodigo(1234);
		cli.setNome("Rodrigo");
		cli.setEmail("rodrigo@curvello.com");
		cli.setFone("1234-4321");
		
		lista.add(cli);
		
		cli = new Clientes();
		cli.setCodigo(321);
		cli.setNome("foi");
		cli.setEmail("12@curvello.com");
		cli.setFone("9999-4321");
		
		lista.add(cli);
		
		ManipXML.gravarXML(lista);	
	
		List<Clientes> list = ManipXML.lerXMLCOM();
		
		for (Iterator<Clientes> iter = list.iterator(); iter.hasNext();) {
			Clientes element = (Clientes) iter.next();
			System.out.println(element.toString() + "\n---");	
		}
		
	}
}