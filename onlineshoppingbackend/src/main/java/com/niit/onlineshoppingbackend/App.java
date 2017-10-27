package com.niit.onlineshoppingbackend;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.niit.DAO.CartDAOImpl;
import com.niit.DAO.CategoryDAOImpl;
import com.niit.DAO.ProductDAOImpl;
import com.niit.DAO.SupplierDAOImpl;
import com.niit.DAO.UserDAOImpl;
import com.niit.config.dbconfig;
import com.niit.model.Cart;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;
import com.niit.model.User;
import com.niit.Service.CartService;
import com.niit.Service.CartServiceImpl;
import com.niit.Service.CategoryService;
import com.niit.Service.CategoryServiceImpl;
import com.niit.Service.ProductService;
import com.niit.Service.ProductServiceImpl;
import com.niit.Service.SupplierService;
import com.niit.Service.SupplierServiceImpl;
import com.niit.Service.UserService;
import com.niit.Service.UserServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new AnnotationConfigApplicationContext(dbconfig.class,CategoryDAOImpl.class,CategoryServiceImpl.class,CartDAOImpl.class,CartServiceImpl.class,ProductDAOImpl.class,ProductServiceImpl.class
                ,UserDAOImpl.class,UserServiceImpl.class,SupplierDAOImpl.class,SupplierServiceImpl.class);
       
        
      /*  ApplicationContext context= new AnnotationConfigApplicationContext(dbconfig.class,CategoryDAOImpl.class,CategoryServiceImpl.class);*/
    CategoryService categoryService=(CategoryService) context.getBean("categoryServiceImpl");
        Category category=new Category();
        category.setCategoryName("cat");
        category.setDescription("desc");
        categoryService.saveCategory(category);
        System.out.println("Category inserted");
 
        
        CartService cartService=(CartService) context.getBean("cartServiceImpl");
        Cart cart=new Cart();
        cart.setProname("food");
        cart.setQuantity(1);
        cart.setPrice(12345);
        cartService.saveCart(cart);
        System.out.println("Done");
        
        ProductService productService=(ProductService)context.getBean("productServiceImpl");
        Product product=new Product();
        product.setProductname("food");
        product.setDescription("Yummy");
        product.setStock(5);
        product.setPrice(500);
        productService.save(product);
        System.out.println("Product Finished");
    
        UserService userService=(UserService)context.getBean("userServiceImpl");
        User user=new User();
        user.setName("Yazhini");
        user.setEmail("yazhini.duraivelumani@gmail.com");
        user.setPhnno(1234);
        user.setAddresss("abcdef");
        user.setZipcode(123);
        userService.save(user);
        System.out.println("User Finished");
        
        
        SupplierService supplierService=(SupplierService)context.getBean("supplierServiceImpl");
        Supplier supplier=new Supplier();
        supplier.setSupname("supps");
        supplier.setContactno(1234);
        supplierService.save(supplier);
        System.out.println("Supplier Done");
    }
    
}

