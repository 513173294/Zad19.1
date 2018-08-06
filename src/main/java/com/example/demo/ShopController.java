package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ShopController {

    private ProductRepository productRepository;
    private ShoppingCart shoppingCart;

    public ShopController(ProductRepository productRepository, ShoppingCart shoppingCart) {
        this.productRepository = productRepository;
        this.shoppingCart = shoppingCart;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Product> products = productRepository.getProductList();
        model.addAttribute("productList", products);

        return "home";
    }

    @PostMapping("/addbasket")
    public String basket(@RequestParam String name, @RequestParam int ilosc) {
        shoppingCart.addProduct(name, ilosc);
        return "add";
    }

    @ResponseBody
    @GetMapping("/basket")
    public String showBasket() {
        return shoppingCart.toString();
    }


    @ResponseBody
    @GetMapping("/sum")
    public String showSum() {
        return "Do zapłaty " + shoppingCart.sumProduct() + " zł"
                + "<br/><br/><a href=\"/\">Kontynuuj zakupy</a><br/>";
    }
}
