package lession_2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {


    private ProductService productService;
    public void SetProductService(ProductService productService){
        this.productService=productService;
    }
    @RequestMapping("/products")
    public ModelAndView listProducts() {
        List<Product> products = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("/product/list", "products", products);
        return modelAndView;
    }

}
