package test;

import datos.Cliente;
import negocio.ClienteABM;

public class TestTraerClienteYContacto {
	public static void main(String[] args) {
		ClienteABM abmCliente = new ClienteABM();
		//long idCliente=1;
		Cliente c=abmCliente.traerClienteYContacto(1);
		System.out.println("\ntraer Cliente y contacto\n"+ c+"\n"+c.getContacto());
	}

}
