package om.forjava.microservices.productservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.forjava.microservices.productservice.entity.Product;
import com.forjava.microservices.productservice.exception.ProductNotFoundException;
import com.forjava.microservices.productservice.respository.ProductRepository;
import com.forjava.microservices.productservice.service.ProductService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService
{
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product)
	{
		Product savedProduct = productRepository.save(product);
		return savedProduct; 
	}

	@Override
	public List<Product> getAllProducts()
	{
		List<Product> listOfAllProducts = productRepository.findAll();
		return listOfAllProducts;
	}

	@Override
	public Product getProductById(long productId)
	{
		Product productWithId = productRepository.findById(productId).orElseThrow
		(() -> new ProductNotFoundException(productId));
		return productWithId;
	}

	@Override
	public Product updateProductById(Product product, long productId)
	{
		Product existingProduct = productRepository.findById(productId).orElseThrow
		(() -> new ProductNotFoundException("Product", "id", productId));
		
		existingProduct.setProductName(product.getProductName());
		existingProduct.setProductDescription(product.getProductDescription());
		Product updatedProduct = productRepository.save(existingProduct);
		return updatedProduct;
	}

	@Override
	public void deleteProductById(long productId)
	{
		productRepository.findById(productId).orElseThrow
		(() -> new ProductNotFoundException(productId));
		
		productRepository.deleteById(productId);
	}
}
