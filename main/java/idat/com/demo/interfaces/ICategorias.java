package idat.com.demo.interfaces;

import org.springframework.data.repository.CrudRepository;

import idat.com.demo.modelo.Categorias;

public interface ICategorias extends CrudRepository<Categorias, Integer> {

}
