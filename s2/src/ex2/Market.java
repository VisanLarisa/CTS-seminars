package ex2;
//modificarea pe nume variabilr
public class Market {
	public float computePriceWithDiscount(int productType, float initialPrice, int timeSpent)
	  {
	    float finalPrice = 0;
	    float discountByTime = (timeSpent > 10) ? (float)30/100 : (float)timeSpent/100; 
	    if (productType == 1)
	    {
	    	finalPrice = initialPrice;
	    }
	    else if (productType == 2)
	    {
	    	finalPrice = (initialPrice - (0.1f * initialPrice)) - discountByTime * (initialPrice - (0.1f * initialPrice));
	    }
	    else if (productType == 3)
	    {
	    	finalPrice = (initialPrice - (0.25f * initialPrice)) - discountByTime * (initialPrice - (0.25f * initialPrice));
	    }
	    else if (productType == 4)
	    {
	    	finalPrice = (initialPrice - (0.35f * initialPrice)) - discountByTime * (initialPrice - (0.35f * initialPrice));
	    }
	    return finalPrice;
	  }
}
