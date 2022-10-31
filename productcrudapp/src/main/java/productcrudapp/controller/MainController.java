package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.ProductDao;
import productcrudapp.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String showHome(Model m)
	{
		List<Product> products=productDao.getProducts();
		m.addAttribute("products", products);
		return "index";
	}
	
	@RequestMapping("/addproduct")
	public String addProduct(Model m)
	{
		m.addAttribute("title", "Add Product");
		return "add_product_form";
	}
	
	@RequestMapping(path="/formhandler",method=RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request)
	{
		System.out.println(product);
		productDao.createProduct(product);
		
		RedirectView rv=new RedirectView();
		rv.setUrl(request.getContextPath()+"/");
		return rv;
	}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteHandler(@PathVariable("productId") int productId, HttpServletRequest request)
	{
		this.productDao.deleteProduct(productId);
		RedirectView rv=new RedirectView();
		rv.setUrl(request.getContextPath()+"/");
		return rv;
	}
	
	@RequestMapping("/update/{productId}")
	public String updateHandler(@PathVariable("productId") int productId, Model m)
	{
		Product product=this.productDao.getSingleProduct(productId);
		m.addAttribute("product", product);
		
		
		return "update_product";
	}
			
}
