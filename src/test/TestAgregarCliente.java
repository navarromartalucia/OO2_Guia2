package test;

import java.time.LocalDate;

import datos.Cliente;
import datos.Contacto;
import negocio.ClienteABM;
import negocio.ContactoABM;

public class TestAgregarCliente {
	public static void main(String[] args) {
		ClienteABM abmCliente = new ClienteABM();
		ContactoABM abmContacto = new ContactoABM();
		try{
			abmCliente.agregar("Navarro", "Luis", 17444627,LocalDate.of(1965, 11, 15), new Contacto());
			abmCliente.agregar("Navarro", "Lu", 41473969,LocalDate.of(1998, 8, 14), new Contacto());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
