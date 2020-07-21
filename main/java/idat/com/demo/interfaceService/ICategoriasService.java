package idat.com.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import idat.com.demo.modelo.Categorias;

public interface ICategoriasService {
	public List<Categorias>listar();
	public Optional<Categorias>listarId(int id);
	public int save(Categorias c);
	public void delete(int id);

}
