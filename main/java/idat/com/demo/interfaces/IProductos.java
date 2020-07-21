package idat.com.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import idat.com.demo.modelo.Productos;



public interface IProductos extends CrudRepository<Productos, Integer> {

}
