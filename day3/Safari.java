package week2.day3;

public class Safari {
	public void readerMode() {
		System.out.println("Safari in reader Mode");
	}
	public void fullScreenMode() {
		System.out.println("Safari in Full Screen Mode");
	}
	
	public static void main(String[] args) {

		Safari saf=new Safari();
		saf.openUrl();
		saf.readerMode();
		saf.fullScreenMode();
		saf.closeBrowser();

		
	}
	private void closeBrowser() {
		// TODO Auto-generated method stub
		
	}
	private void openUrl() {
		// TODO Auto-generated method stub
		
	}

}
