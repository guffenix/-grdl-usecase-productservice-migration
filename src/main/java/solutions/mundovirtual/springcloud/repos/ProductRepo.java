package solutions.mundovirtual.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import solutions.mundovirtual.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
