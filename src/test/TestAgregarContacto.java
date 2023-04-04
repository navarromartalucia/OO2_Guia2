package test;

import datos.Cliente;
import negocio.ClienteABM;
import negocio.ContactoABM;

public class TestAgregarContacto {

	public static void main(String[] args) {
		ClienteABM abmCliente =new ClienteABM();
		ContactoABM abmContacto = new ContactoABM();
		//abmContacto.agregar("ajaramillo@unla.edu.ar","11-1111-1111","011-1111-1111", abmCliente.traer(1));
		abmContacto.agregar("email1","11-1111-1111","011-1111-1111", abmCliente.traerPorID(5));

	}

}
