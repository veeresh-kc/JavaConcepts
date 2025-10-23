package encapsulation;

public class RunnerTestCart {
	    public static void main(String[] args) {
	        ShoppingCart cart = new ShoppingCart(5);

	        Item i1 = new Item("Shirt", 799.0);
	        Item i2 = new Item("Jeans", 1499.0);
	        Item i3 = new Item("Shoes", 2999.0);
	        Item i4 = new Item("Watch", 1999.0);
	        Item i5 = new Item("Cap", 399.0);
	        Item i6 = new Item("Bag", 999.0);

	        cart.addItem(i1);
	        cart.addItem(i2);
	        cart.addItem(i3);
	        cart.addItem(i4);
	        cart.addItem(i5);
	        cart.addItem(i6); 

	        cart.showCart();

	        cart.removeItem(2);
	        cart.showCart();

	        cart.replaceItem(1, new Item("T-Shirt", 599.0));
	        cart.showCart();
	    }

}
