import java.util.List;

public class Ticket implements Runnable{

	private List<Persona> clientes;

	public void formar(Persona cliente){
		clientes.add(cliente);
		mostrarClientes();
	}

	public void mostrarClientes(){
		String filaClientes = "";
		for(Persona cliente : clientes){
			filaClientes += "["+cliente+"]";
		}
		System.out.println(filaClientes);
	}

	public void run(){
		try{
			int noCliente = 1;
			while(true){
				formar(new Persona("Cliente "+noCliente));
				noCliente++;
				Thread.sleep(3000);
			}
		}catch(InterruptedException ioe){
			ioe.printStackTrace();
		}
	}

	public void setClientes(List<Persona> clientes){
		this.clientes = clientes;
	}
	
	public List<Persona> getClientes(){
		return clientes;
	}
}
