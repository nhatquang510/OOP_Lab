
class DVDWrapper {
	
	DigitalVideoDisc disc;
	
	DVDWrapper (DigitalVideoDisc disc) { this.disc = disc; }
}

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		DVDWrapper dvd1 = new DVDWrapper(jungleDVD);
		DVDWrapper dvd2 = new DVDWrapper(cinderellaDVD);
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		//correctlySwap(dvd1, dvd2);		
		//System.out.println("jungle dvd title: " + dvd1.disc.getTitle());
		//System.out.println("cinderella dvd title: " + dvd2.disc.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
	
	public static void swap (Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	public static void correctlySwap (DVDWrapper o1, DVDWrapper o2) {
		DigitalVideoDisc tmp = o1.disc;
		o1.disc = o2.disc;
		o2.disc = tmp;
	}
	
	public static void changeTitle (DigitalVideoDisc dvd, String title) {
		
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}

}
