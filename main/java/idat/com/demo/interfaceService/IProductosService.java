package idat.com.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import idat.com.demo.modelo.Productos;


public interface IProductosService {
	public List<Productos>listar();
	public Optional<Productos>listarId(int id);
	public int save(Productos p);
	public void delete(int id);
}
