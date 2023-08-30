package com.step;

import com.base.Base_class;
import com.pom.Lime_Tshirt;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Step_defination extends Base_class{

	Lime_Tshirt l = new Lime_Tshirt();

	@Given("launch the Url {string}")
	public void launch_the_url(String string) {
	    
		getUrl("https://www.limeroad.com/");
	    
	}
	
	@When("Click the shop men")
	public void click_the_shop_men() {
		
	    clickOnWebelem(l.getSelect_men());
	    
	}
	@And("Click on Tshirt")
	public void click_on_tshirt() {
		javascriptexe(l.getT_shirt(), "click");
		
	}
	@And("Click on Tshirts")
	public void click_on_tshirts() {
		clickOnWebelem(l.getTshirts());
	}
	@And("Click on Roundneck")
	public void click_on_roundneck() {
		clickOnWebelem(l.getTshirts_select());
	    
	}
	@And("Click on size")
	public void click_on_size() {
		clickOnWebelem(l.getSize());
	  
	}
	@And("Click on Cart")
	public void click_on_cart() {
		clickOnWebelem(l.getCart());
	   
	}
	
}
