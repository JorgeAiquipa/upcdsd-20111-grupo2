package pe.edu.upc.dsd.ws;

import javax.jws.WebService;

import pe.edu.upc.dsd.ws.bean.Cliente;

/**
 * @author Andres Deza V.
 * 
 */
@WebService
public interface ClienteService 
{
	public Cliente obtenerCliente(String codigo);
}
