package com.example.demo.codegen.datafetchers;

import com.example.demo.codegen.types.Product;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;
import jakarta.annotation.Generated;
import java.util.List;

@Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2025-01-26T13:30:19.978170Z"
)
@com.example.demo.codegen.Generated
@DgsComponent
public class GetAllProductsDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "getAllProducts"
  )
  public List<Product> getGetAllProducts(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
