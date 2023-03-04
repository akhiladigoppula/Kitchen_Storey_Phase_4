package com.kitchenstorey.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kitchenstorey.api.Admin;
import com.kitchenstorey.api.Burger;
import com.kitchenstorey.api.Desserts;
import com.kitchenstorey.api.Pizza;

@Repository
public class KitchenStoreyDAO {
	@Autowired
	private JdbcTemplate jdbc;

	public Admin getAdmin() {
		String sql = "select * from admin where name='Akhil'";
		Admin admin = jdbc.queryForObject(sql, new BeanPropertyRowMapper<Admin>(Admin.class));
		return admin;
	}
	public void changePassword(String newPassword) {
		String sql="update admin set password=? where name='Akhil'";
		jdbc.update(sql,newPassword);
	}
	public List<Burger> getBurgerList(){
		List<Burger> list=new ArrayList<Burger>();
		String sql="select * from burger";
		return jdbc.query(sql, new BeanPropertyRowMapper<Burger>(Burger.class));
	}
	public void deleteBurger(int id) {
		String sql="delete from burger where id=?";
		jdbc.update(sql,id);
	}
	public void addBurger(Burger burger) {
		String sql="insert into burger(`name`,`desc`,`price`,`image`) values(?,?,?,?)";
		jdbc.update(sql, burger.getName(),burger.getDesc(),burger.getPrice(),burger.getImage());
	}
	public List<Pizza> getPizzaList(){
		List<Pizza> list=new ArrayList<Pizza>();
		String sql="select * from pizza";
		return jdbc.query(sql, new BeanPropertyRowMapper<Pizza>(Pizza.class));
	}
	public void deletePizza(int id) {
		String sql="delete from pizza where id=?";
		jdbc.update(sql,id);
	}
	public void addPizza(Pizza pizza) {
		String sql="insert into pizza(`name`,`desc`,`price`,`image`) values(?,?,?,?)";
		jdbc.update(sql, pizza.getName(),pizza.getDesc(),pizza.getPrice(),pizza.getImage());
	}
	public List<Desserts> getDessertsList(){
		List<Desserts> list=new ArrayList<Desserts>();
		String sql="select * from desserts";
		return jdbc.query(sql, new BeanPropertyRowMapper<Desserts>(Desserts.class));
	}
	public void deleteDesserts(int id) {
		String sql="delete from desserts where id=?";
		jdbc.update(sql,id);
	}
	public void addDesserts(Desserts desserts) {
		String sql="insert into desserts(`name`,`desc`,`price`,`image`) values(?,?,?,?)";
		jdbc.update(sql, desserts.getName(),desserts.getDesc(),desserts.getPrice(),desserts.getImage());
	}
	public Burger getBurgerById(int id) {
		String sql="select * from burger where id=?";
		return jdbc.queryForObject(sql,new BeanPropertyRowMapper<Burger>(Burger.class),id);
	}
	public Pizza getPizzaById(int id) {
		String sql="select * from pizza where id=?";
		return jdbc.queryForObject(sql,new BeanPropertyRowMapper<Pizza>(Pizza.class),id);
	}
	public Desserts getDessertsById(int id) {
		String sql="select * from desserts where id=?";
		return jdbc.queryForObject(sql,new BeanPropertyRowMapper<Desserts>(Desserts.class),id);
	}
}
