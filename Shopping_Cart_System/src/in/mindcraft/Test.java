package in.mindcraft;
class ShoppingCart
{
	
	double calculateTotal(int quantity, double pricePerUnit)
	{
		return quantity * pricePerUnit;
	}
	double calculateTotal(double pricePerUnit, int quantity, double discountPercentage)
	{
		double total  = quantity * pricePerUnit;
		double discount = total * discountPercentage / 100;
		return  total - discount;
	}
	double calculateTotal(double[] prices)
	{
		double total = 0;
		for(double price : prices)
		{
			total +=price;
		}
		return total;
	}
	
	double calculateTotal(int[] quantities, double[] prices)
	{
		double total = 0;
		for(int i = 0; i < quantities.length; i++)
		{
			total += quantities[i] * prices[i];
		}
		return total;
	}
	
	double calculateTotal(int[]  quantities, double[] prices, double[] discountPercentages)
	{
		double total = 0;
		for(int i = 0; i < quantities.length; i++)
		{
			double totalPriceItem = quantities[i] * prices[i];
			double discount = totalPriceItem * discountPercentages[i] / 100;
			total += totalPriceItem - discount;
		}
		return total;
	}
	
	public String calculateTotal(String couponCode, double totalAmount)
	{
		double discount = 0;

        switch (couponCode) {
            case "SAVE10":
                discount = totalAmount * 0.10;
                break;
            case "SAVE20":
                discount = totalAmount * 0.20;
                break;
            default:
                discount = 0;
                break;
        }

        double finalAmount = totalAmount - discount;
        return "Final amount after applying coupon" + couponCode + "' is ₹" + finalAmount;
    }
	}



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        ShoppingCart cart = new ShoppingCart();
		        System.out.println("Single item total: ₹" + cart.calculateTotal(3, 50.0));
		        System.out.println("Discounted item total: ₹" + cart.calculateTotal(100.0, 2, 10.0));
		        
		        double[] prices = {100.0, 200.0, 150.0};
		        System.out.println("Total of multiple items (single qty): ₹" + cart.calculateTotal(prices));

		        int[] quantities = {1, 2, 1};
		        double[] itemPrices = {100.0, 200.0, 150.0};
		        System.out.println("Total with quantities: ₹" + cart.calculateTotal(quantities, itemPrices));

		        double[] discounts = {10.0, 20.0, 5.0};
		        System.out.println("Total with quantities and discounts: ₹" + cart.calculateTotal(quantities, itemPrices, discounts));

		        System.out.println(cart.calculateTotal("SAVE10", 1000.0));
		        System.out.println(cart.calculateTotal("SAVE20", 2000.0));
		        System.out.println(cart.calculateTotal("INVALID", 1500.0));
		    }

	}
