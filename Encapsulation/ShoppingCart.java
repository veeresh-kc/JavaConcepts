package encapsulation;

public class ShoppingCart {
	    private Item[] cart;
	    private int count;

	    public ShoppingCart(int size) {
	        cart = new Item[size];
	        count = 0;
	    }

	    public void addItem(Item item) {
	        if (count < cart.length) {
	            cart[count] = item;
	            count++;
	            System.out.println(item.getName() + " added to cart.");
	        } else {
	            System.out.println("Cart is full. Cannot add item.");
	        }
	    }

	    public void removeItem(int index) {
	        if (index >= 0 && index < count) {
	            System.out.println(cart[index].getName() + " removed from cart.");
	            for (int i = index; i < count - 1; i++) {
	                cart[i] = cart[i + 1];
	            }
	            cart[count - 1] = null;
	            count--;
	        } else {
	            System.out.println("Invalid index. Cannot remove item.");
	        }
	    }

	    public void replaceItem(int index, Item newItem) {
	        if (index >= 0 && index < count) {
	            System.out.println("Replacing " + cart[index].getName() + " with " + newItem.getName());
	            cart[index] = newItem;
	        } else {
	            System.out.println("Invalid index. Cannot replace item.");
	        }
	    }

	    public void showCart() {
	        System.out.println("Cart Items:");
	        for (int i = 0; i < count; i++) {
	            System.out.println((i + 1) + ". " + cart[i]);
	        }
	        if (count == 0) {
	            System.out.println("Cart is empty.");
	        }
	    }
}
