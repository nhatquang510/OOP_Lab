public class Cart {
    
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;


    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
    	
    	if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full.");
        }
    	else {
    		
    		if (qtyOrdered == MAX_NUMBERS_ORDERED - 1) {
                System.out.println("The cart is almost full.");
    		}

            itemsOrdered[qtyOrdered] = disc;
            System.out.println(disc.getTitle() + " has been added.");
            qtyOrdered ++;
    		
    	}
    }
   
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
    	
    	if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full.");
        }
    	else {
    		
    		if (qtyOrdered == MAX_NUMBERS_ORDERED - 2) {
                System.out.println("The cart is almost full.");
    		}

            itemsOrdered[qtyOrdered] = dvd1;
            itemsOrdered[qtyOrdered + 1] = dvd2;
            System.out.println(dvd1.getTitle() + " and " + dvd2.getTitle() + " has been added.");
            qtyOrdered += 2;
    		
    	}
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
    	
    	if (qtyOrdered == MAX_NUMBERS_ORDERED) {
            System.out.println("The cart is full.");
        }
    	else if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED) {
    		System.out.println("Can't add the DVDs due to over maximum number of DVDs");
    	}
    	else {
    		
    		for (int i = 0; i < dvdList.length; i++) {
    			itemsOrdered[qtyOrdered + i] = dvdList[i];
    		}
    		
            System.out.println(dvdList.length + " DVDs has been added.");
            qtyOrdered += dvdList.length;
    		
    	}
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {

        DigitalVideoDisc newItemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
        int index = 0;

        for (int i = 0; i < itemsOrdered.length; i++) {
            if (itemsOrdered[i] != disc) {
                newItemsOrdered[index] = itemsOrdered[i];
                index ++;
            }
        }

        itemsOrdered = newItemsOrdered;
        System.out.println(disc.getTitle() + " has been removed.");
        qtyOrdered--;
    }


    public float totalCost(){
        float cost = 0;
        for (int i = 0; i < qtyOrdered; i ++) {
            DigitalVideoDisc disc = itemsOrdered[i];
            cost += disc.getCost();
        }
        return cost;
    }
    
    public void printOrderedItems() {
    	System.out.println("***********************CART***********************");
    	System.out.println("Ordered Items:");
    	for (int i = 0; i < qtyOrdered; i++) {
    		System.out.println(itemsOrdered[i].toString());
    	}
    	System.out.println("Total cost: " + this.totalCost());
    	System.out.println("***************************************************");
    }
    
    public void searchById(int id) {
    	int index = -1; // represents the index of search result in itemsOrdered, =-1 if not found
		for(int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == id) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("No match is found");
		}
		else {
			System.out.println("The DVD with ID " + id + " is:");
			System.out.println(itemsOrdered[index].toString());
		}
	}
    
    public void searchByTitle(int id) {
    	int index = -1; // represents the index of search result in itemsOrdered, =-1 if not found
		for(int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId() == id) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			System.out.println("No match is found");
		}
		else {
			System.out.println("The DVD with ID " + id + " is:");
			System.out.println(itemsOrdered[index].toString());
		}
	}

}