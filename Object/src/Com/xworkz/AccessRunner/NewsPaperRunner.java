package Com.xworkz.AccessRunner;

import Com.xworkz.Access.NewsPaper;

public class NewsPaperRunner {
	public static void main(String[] args) {
		NewsPaper newsPaper=new NewsPaper();
		System.out.println(newsPaper);
		newsPaper.setCompany("Hindu");
		newsPaper.setCompanyOwner("Somnath");
		newsPaper.setLanguage("English");
		newsPaper.setPice(30);
		System.out.println(newsPaper);
	}
}
