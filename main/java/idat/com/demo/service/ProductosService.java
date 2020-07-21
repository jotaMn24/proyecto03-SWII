package idat.com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.com.demo.interfaceService.IProductosService;
import idat.com.demo.interfaces.IProductos;
import idat.com.demo.modelo.Productos;

@Service
public class ProductosService implements IProductosService {
	@Autowired
	IProductos data;

	@Override
	public List<Productos> listar() {
		// TODO Auto-generated method stub
		return (List<Productos>) data.findAll();
	}

	@Override
	public Optional<Productos> listarId(int id) {
		// TODO Auto-generated method stub
		return data.findById(id);
	}

	@Override
	public int save(Productos p) {
		// TODO Auto-generated method stub
		int res = 0;
		Productos producto = data.save(p);
		if (!producto.equals(null)) {
			res = 1;
		}
		return res;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		data.deleteById(id);
	}

}
