package com;

public class VehicleDemo {

	// static //ArrayList<Vehicle> list=new ArrayList<Vehicle>();

	public static Vehicle[] searchVehicleByName(Vehicle[] obj, String name) throws NoNameFoundException  {
		Vehicle[] obj1 = new Vehicle[5];
		int j = 0;
		if(obj!=null)
		{
		for (Vehicle temp : obj) {
			System.out.println("hello");
			if (temp.getName().equals(name)) {
				System.out.println("hii");
				obj1[j] = new Vehicle(temp.getNo(), temp.getName(), temp.getPrice());
				j++;
				return obj1;

			}
			else
			{
				throw new NoNameFoundException(name);
			}
		}
		}
		else
		{
			return null;
		}
		if(j!=0)
		{
			return obj1;
		}
		else
		{
			return null;
		}

	}



	public static void main(String args[]) {
		Vehicle vehicle1 = new Vehicle(11, "xjocohs", 907.0);
		Vehicle vehicle2 = new Vehicle(14, "gfcxsvh", 777.0);
		Vehicle vehicle3 = new Vehicle(90, "gfcxsvh", 595.0);
		Vehicle vehicle4 = new Vehicle(97, "nqkwtpi", 858.0);
		Vehicle vehicle5 = new Vehicle(19, "speflgg", 574.0);

		Vehicle[] objArray = { vehicle1, vehicle2, vehicle3, vehicle4, vehicle5 };
		Vehicle [] objResultArray1=null;
		try
		{
			System.out.println("try");

		 objResultArray1 = searchVehicleByName(objArray, "speflgg");
	if (objResultArray1 == null)
		
	{
		System.out.println("after try");
			System.out.println("Output after first search is null. ");
		
	
 {
			System.out.println("Displaying contents of result array1: ");

			for (Vehicle vehicle : objResultArray1) {

				if(vehicle!=null)
				System.out.println(vehicle.getNo() + " " + vehicle.getName() + " " + vehicle.getPrice() + " ");
			}
		}
	}
		}
	
	
 catch (NoNameFoundException e)
	{
		System.out.println(e.getmessage());
	 
	}
	}
}



		/*Vehicle[] objResultArray2 = searchVehicleByName(objArray, "speflgg");
		if (objResultArray2 == null) {
			System.out.println("Output after first search is null. ");
		} else {
			System.out.println("Displaying contents of result array2: ");

			for (Vehicle vehicle : objResultArray2) {
				System.out.println(vehicle.getNo() + " " + vehicle.getName() + " " + vehicle.getPrice() + " ");
			}
		}
	*/






