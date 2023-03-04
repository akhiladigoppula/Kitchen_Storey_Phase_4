package com.kitchenstorey.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.kitchenstorey.api.Admin;
import com.kitchenstorey.api.Burger;
import com.kitchenstorey.api.ChangePassword;
import com.kitchenstorey.api.Customer;
import com.kitchenstorey.api.Desserts;
import com.kitchenstorey.api.FoodItem;
import com.kitchenstorey.api.Payment;
import com.kitchenstorey.api.Pizza;
import com.kitchenstorey.dao.KitchenStoreyDAO;

@Controller
public class KitchenStoreyController {
	@Autowired
	KitchenStoreyDAO dao;
	static Integer x=0;
	static int total = 0;
	HashMap<Integer,FoodItem> orderlist = new HashMap<>();

	@GetMapping("/")
	private String homePage() {
		return "home-page";
	}

	@GetMapping("/adminlogin")
	private String adminLoginPage(@ModelAttribute("admin") Admin admin) {
		return "admin-login";
	}

	@PostMapping("/adminHomePage")
	private String adminHomePage(@Valid @ModelAttribute("admin") Admin admin, BindingResult result) {
		Admin admin1 = dao.getAdmin();
		if (admin.getName().equals(admin1.getName()) && admin.getPassword().equals(admin1.getPassword())) {
			admin.setCheck(true);
			return "admin-Home-Page";
		} else
			return "admin-login";
	}

	@GetMapping("changePassword")
	private String changePassword(@ModelAttribute("cp") ChangePassword cpd) {
		return "change-password";
	}

	@PostMapping("changePasswordCheck")
	private String changePasswordCheck(@Valid @ModelAttribute("cp") ChangePassword cpd, BindingResult result) {
		if (result.hasErrors()) {
			return "change-password";
		} else {
			dao.changePassword(cpd.getNewPassword());
			return "cpsuccess";
		}
	}

	@GetMapping("homeAdmin")
	private String homeAdmin() {
		return "admin-Home-Page";
	}

	@GetMapping("burgermanager")
	private String burgerManager(Model model) {
		model.addAttribute("burger", dao.getBurgerList());
		return "burger-Manager";
	}

	@GetMapping("deleteBurger")
	private String deleteBurger(@RequestParam("id") int id, Model model) {
		dao.deleteBurger(id);
		model.addAttribute("burger", dao.getBurgerList());
		return "burger-Manager";
	}

	@GetMapping("addBurger")
	private String addBurger(@ModelAttribute("burger") Burger burger) {
		return "add-burger";
	}

	@PostMapping("addedBurger")
	private String burgerAdded(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-burger";
		} else {
			dao.addBurger(burger);
			model.addAttribute("burger", dao.getBurgerList());
			return "burger-Manager";
		}
	}

	@GetMapping("pizzamanager")
	private String pizzaManager(Model model) {
		model.addAttribute("pizza", dao.getPizzaList());
		return "pizza-Manager";
	}

	@GetMapping("deletePizza")
	private String deletePizza(@RequestParam("id") int id, Model model) {
		dao.deletePizza(id);
		model.addAttribute("pizza", dao.getPizzaList());
		return "pizza-Manager";
	}

	@GetMapping("addPizza")
	private String addPizza(@ModelAttribute("pizza") Pizza pizza) {
		return "add-pizza";
	}

	@PostMapping("addedPizza")
	private String pizzaAdded(@Valid @ModelAttribute("pizza") Pizza pizza, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "add-pizza";
		} else {
			dao.addPizza(pizza);
			model.addAttribute("pizza", dao.getPizzaList());
			return "pizza-Manager";
		}
	}

	@GetMapping("dessertsmanager")
	private String dessertsManager(Model model) {
		model.addAttribute("desserts", dao.getDessertsList());
		return "desserts-Manager";
	}

	@GetMapping("deleteDesserts")
	private String deleteDesserts(@RequestParam("id") int id, Model model) {
		dao.deleteDesserts(id);
		model.addAttribute("desserts", dao.getDessertsList());
		return "desserts-Manager";
	}

	@GetMapping("addDesserts")
	private String addDesserts(@ModelAttribute("desserts") Desserts desserts) {
		return "add-desserts";
	}

	@PostMapping("addedDesserts")
	private String dessertsAdded(@Valid @ModelAttribute("desserts") Desserts desserts, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return "add-desserts";
		} else {
			dao.addDesserts(desserts);
			model.addAttribute("desserts", dao.getDessertsList());
			return "desserts-Manager";
		}
	}

	@GetMapping("order")
	private String order() {
		return "order";
	}

	@GetMapping("orderburger")
	private String orderBurger(Model model) {
		model.addAttribute("orderburger", dao.getBurgerList());
		return "order-burger";
	}

	@GetMapping("addBurgerCart")
	private String addBurgerCart(@RequestParam("id") int id, Model model) {
		orderlist.put(x, dao.getBurgerById(id));
		x++;
	
		model.addAttribute("orderburger", dao.getBurgerList());
		return "order-burger";
	}

	@GetMapping("orderpizza")
	private String orderPizza(Model model) {
		model.addAttribute("orderpizza", dao.getPizzaList());
		return "order-pizza";
	}

	@GetMapping("addPizzaCart")
	private String addPizzaCart(@RequestParam("id") int id, Model model) {
		orderlist.put(x, dao.getPizzaById(id));
		x++;
		
		model.addAttribute("orderpizza", dao.getPizzaList());
		return "order-pizza";
	}

	@GetMapping("orderdesserts")
	private String orderDesserts(Model model) {
		model.addAttribute("orderdesserts", dao.getDessertsList());
		return "order-desserts";
	}

	@GetMapping("addDessertsCart")
	private String addDessertsCart(@RequestParam("id") int id, Model model) {
		orderlist.put(x, dao.getDessertsById(id));
		x++;
		model.addAttribute("orderdesserts", dao.getDessertsList());
		return "order-desserts";
	}

	@GetMapping("viewCart")
	private String cart(Model model) {
		
		 for (HashMap.Entry<Integer,FoodItem> entry : orderlist.entrySet()) {
			 total=total+entry.getValue().getPrice();
		 }
		model.addAttribute("total", total);
		model.addAttribute("cartitems", orderlist);
		return "cart";
	}

	@GetMapping("proceed")
	private String proceed(@ModelAttribute("customer") Customer customer, Model model) {
		if (orderlist.size() != 0) {
			return "proceed";
		} else {
			return "order";
		}
	}

	@PostMapping("pay")
	private String pay(@Valid @ModelAttribute("customer") Customer customer, BindingResult result,
			@ModelAttribute("payment") Payment payment, HttpSession session) {
		if (result.hasErrors()) {
			return "proceed";
		} else {
			session.setAttribute("customer", customer);
			return "pay";
		}
	}
	@PostMapping("ordersummary")
	private String orderSummary(@Valid @ModelAttribute("payment")Payment payment,BindingResult result, Model model,HttpSession session) {
		if(result.hasErrors()) {
			return "pay";
		}
		else {
			model.addAttribute("customer",session.getAttribute("customer"));
			model.addAttribute("payment",payment);
			model.addAttribute("total",total);
			model.addAttribute("items", orderlist);
			return "order-summary";
		}
	}
	@GetMapping("cancelitem")
	private String cancelItem(@RequestParam("index")int id,Model model) {
		orderlist.remove(id);
		for (HashMap.Entry<Integer,FoodItem> entry : orderlist.entrySet()) {
			 total=total+entry.getValue().getPrice();
		 }
		model.addAttribute("total", total);
		model.addAttribute("cartitems",orderlist);
		return "cart";
	}
	@GetMapping("reset")
	private String reset() {
		orderlist.clear();
		total=0;
		return "order";
	}
}
