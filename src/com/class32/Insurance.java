package com.class32;

public abstract class Insurance {

	 String insuranceName;

	    public abstract void getQuote();

	    public abstract void cancelInsurance();

	    public Insurance(String insuranceName) {
	        this.insuranceName = insuranceName;
	    }

	}

	class Car extends Insurance {
		
	    String carModel;

	    public Car(String insuranceName, String carModel) {
	        super(insuranceName);
	        this.carModel = carModel;
	    }

	    @Override
	    public void getQuote() 
	    {
	    	System.out.println("This is quote for " + insuranceName + " and " + carModel);	
	    }

	    @Override
	    public void cancelInsurance() 
	    {
	    	System.out.println("We canceled "+ insuranceName + " and " + carModel);
	    }

	}

	class Pet extends Insurance {
	    String petType;

	    public Pet(String insuranceName, String petType) {
	        super(insuranceName);
	        this.petType = petType;
	    }

	    @Override
	    public void getQuote() 
	    {
	    	System.out.println("This is quote for " + insuranceName + " and " + petType);
	    }

	    @Override
	    public void cancelInsurance() 
	    {
	    	System.out.println("We canceled "+ insuranceName + " and " + petType);
	    }
	}

	class Health extends Insurance {

	    public Health(String insuranceName) {
	        super(insuranceName);
	    }

	    @Override
	    public void getQuote() 
	    {
	    	System.out.println("This is quote for " + insuranceName);	
	    }

	    @Override
	    public void cancelInsurance() 
	    {
	    	System.out.println("We canceled "+ insuranceName );
	    }
	
}