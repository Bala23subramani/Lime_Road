package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base_class;

public class Lime_Tshirt extends Base_class{

	
	public Lime_Tshirt() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[text()= 'SHOP MEN']")
	WebElement select_men;
	@FindBy (xpath ="//img[@alt='T-shirt']")
	WebElement T_shirt;
	@FindBy (id ="64c761aefd1d3c6f349bed3f")
	WebElement Tshirts;
	@FindBy (id ="19976249")
	WebElement Tshirts_select;	
	@FindBy (xpath =" //span[@id ='size_33709684']")
	WebElement Size;
	@FindBy (xpath = "//div[text() = 'ADD TO CART']")
	WebElement Cart;


	public WebElement getSelect_men() {
		return select_men;
	}
	public WebElement getT_shirt() {
		return T_shirt;
	}
	public WebElement getTshirts() {
		return Tshirts;
	}
	public WebElement getTshirts_select() {
		return Tshirts_select;
	}
	public WebElement getSize() {
		return Size;
	}
	public WebElement getCart() {
		return Cart;
	}
	}




