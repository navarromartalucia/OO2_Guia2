package negocio;

import dao.ClienteDao;
import dao.ContactoDao;
import datos.Cliente;
import datos.Contacto;

public class ContactoABM {
	ContactoDao contactoDao = new ContactoDao();
	//ClienteDao clienteDao = new ClienteDao();
	
	public Contacto traer(long idContacto) {
		Contacto c = contactoDao.traer(idContacto);
		return c;
	}
	
	public int agregar(String email, String movil, String fijo, Cliente cliente) {
		Contacto c = new Contacto(email, movil, fijo, cliente);
	return contactoDao.agregar(c);
	}
	
	public void modificar(Contacto c) {
		contactoDao.actualizar(c);
	}
		
	public void eliminar(long idContacto) {
		Contacto c = contactoDao.traer(idContacto);
		contactoDao.eliminar(c);
	}

}
