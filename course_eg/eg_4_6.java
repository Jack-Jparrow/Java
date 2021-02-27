public class eg_4_6{
	public int nOrignX = 3;
	public int nOrignY = 3;
	public int nRadius = 1;
	
	public eg_4_6(){
		//nOrignX = 3;
		//nOrignY = 3;
		//nRadius = 1;
	}
	
	public eg_4_6(int nOrignX, int nOrignY, int nRadius){
		this.nOrignX = nOrignX;
		this.nOrignY = nOrignX;
		this.nRadius = nRadius;
	}
	
	public static void main(String args[]){
		eg_4_6 aCircle1 = new eg_4_6();
		eg_4_6 aCircle2 = new eg_4_6(15, 15, 7);
		System.out.println("Ô²ÐÄ1 = £¨" + aCircle1.nOrignX + "," + aCircle1.nOrignY + "£©£º°ë¾¶ = " + aCircle1.nRadius);
		System.out.println("Ô²ÐÄ2 = £¨" + aCircle2.nOrignX + "," + aCircle2.nOrignY + "£©£º°ë¾¶ = " + aCircle2.nRadius);
	}
}