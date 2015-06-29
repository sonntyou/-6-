import java.util.ArrayList;

public class finaljudge {

	public static void main(String[] args) {

		int coffeewin = 0;
		int lunchwin = 0;

		Listset listset = new Listset();
		listset.makecsvlist();
		listset.getcsvlist();

		Senkei senkei = new Senkei();
		ArrayList<Object> slopeintersept = senkei.calc(listset.getcsvlist());

		if (coffeewin > lunchwin) {
			System.out.println("コードはコーヒー摂取量に相関が有ります。");
		} else {
			System.out.println("コードはランチのコストに相関が有ります。");
		}
	}
}
