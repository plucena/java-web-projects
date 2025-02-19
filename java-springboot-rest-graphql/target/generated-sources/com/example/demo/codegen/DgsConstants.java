package com.example.demo.codegen;

import java.lang.String;

@jakarta.annotation.Generated(
    value = "com.netflix.graphql.dgs.codegen.CodeGen",
    date = "2025-01-26T13:30:19.978170Z"
)
@Generated
public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static final String MUTATION_TYPE = "Mutation";

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2025-01-26T13:30:19.978170Z"
  )
  @Generated
  public static class PRODUCT {
    public static final String TYPE_NAME = "Product";

    public static final String Id = "id";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String Price = "price";
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2025-01-26T13:30:19.978170Z"
  )
  @Generated
  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String GetProductById = "getProductById";

    public static final String GetAllProducts = "getAllProducts";

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2025-01-26T13:30:19.978170Z"
    )
    @Generated
    public static class GETPRODUCTBYID_INPUT_ARGUMENT {
      public static final String Id = "id";
    }
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2025-01-26T13:30:19.978170Z"
  )
  @Generated
  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String AddProduct = "addProduct";

    public static final String UpdateProduct = "updateProduct";

    public static final String DeleteProduct = "deleteProduct";

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2025-01-26T13:30:19.978170Z"
    )
    @Generated
    public static class ADDPRODUCT_INPUT_ARGUMENT {
      public static final String Input = "input";
    }

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2025-01-26T13:30:19.978170Z"
    )
    @Generated
    public static class UPDATEPRODUCT_INPUT_ARGUMENT {
      public static final String Id = "id";

      public static final String Input = "input";
    }

    @jakarta.annotation.Generated(
        value = "com.netflix.graphql.dgs.codegen.CodeGen",
        date = "2025-01-26T13:30:19.978170Z"
    )
    @Generated
    public static class DELETEPRODUCT_INPUT_ARGUMENT {
      public static final String Id = "id";
    }
  }

  @jakarta.annotation.Generated(
      value = "com.netflix.graphql.dgs.codegen.CodeGen",
      date = "2025-01-26T13:30:19.978170Z"
  )
  @Generated
  public static class PRODUCTINPUT {
    public static final String TYPE_NAME = "ProductInput";

    public static final String Name = "name";

    public static final String Description = "description";

    public static final String Price = "price";
  }
}
