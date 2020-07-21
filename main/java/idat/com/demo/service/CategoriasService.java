package idat.com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.demo.interfaceService.ICategoriasService;
import idat.com.demo.interfaces.ICategorias;
import idat.com.demo.modelo.Categorias;

@Service
public class CategoriasService implements ICategoriasService {
	@Autowired
	ICategorias data;
	@Override
	public List<Categorias> listar() {
		// TODO Auto-generated method stub
		return (List<Categorias>)data.findAll();
	}

	@Override
	public Optional<Categorias> listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int save(Categorias c) {
		// TODO Auto-generated method stub
		int res=0;
		Categorias categoria=data.save(c);
		if(!categoria.equals(null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int idcategoria) {
		data.deleteById(idcategoria);
	}
	
}
