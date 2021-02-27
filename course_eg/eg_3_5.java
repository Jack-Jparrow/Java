class eg_3_5 {

	byte appAge;
	public boolean checkAge()
	{
		if(appAge > 40)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String[]args){
		eg_3_5 appObj1 = new eg_3_5();
		appObj1.appAge = 60;
		if(appObj1.checkAge() == false)//·µ»Ø¾Ü¾øÐÅÏ¢
		{
			System.out.println("No!!!!!!");
		}
		else
		{
			System.out.println("yes");
		}
	}

}
