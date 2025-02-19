package com.example.demo.graphql;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductResolver {

    private final ProductService productService;

    public ProductResolver(ProductService productService) {
        this.productService = productService;
    }

    // Query Resolvers
    @QueryMapping
    public Product getProductById(int id) {
        return productService.getProductById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @QueryMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    // Mutation Resolvers
    @MutationMapping
    public Product addProduct(ProductInput input) {
        Product product = new Product();
        product.setName(input.getName());
        product.setDescription(input.getDescription());
        product.setPrice(input.getPrice());
        return productService.addProduct(product);
    }

    @MutationMapping
    public Product updateProduct(int id, ProductInput input) {
        Product productDetails = new Product();
        productDetails.setName(input.getName());
        productDetails.setDescription(input.getDescription());
        productDetails.setPrice(input.getPrice());
        return productService.updateProduct(id, productDetails);
    }

    @MutationMapping
    public String deleteProduct(int id) {
        return productService.deleteProduct(id);
    }
}