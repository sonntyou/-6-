public class Coffeelunchljudge {

	public static void main(String[] args) {

		int coffeewin = 0;
		int lunchwin = 0;

		// CSVファイルからデータを読み込み、行ごとにデータをTestdatacontentsのフィールドにセット。
		// データの入ったTestdatacontentsをListにセットしたものが帰ってくる
		Listset listset = new Listset();
		listset.makecsvlist();
		System.out.println(listset.getcsvlist().get(0).getLunch());
		//
		// // listを読み込んで、コーヒーとコード、ランチとコードの傾きと切片を算出する。。
		// Senkei senkei = new Senkei();
		// senkei.calc(listset.getcsvlist());
		//
		// // listと各傾きと切片を読み込み、予測値と実測値との差を出す
		// for (int i = 0; (Difference.diffcalc(listset.getcsvlist(),
		// senkei.getCofffeeslope(), senkei.getCoffeeintercept(),
		// senkei.getLunchslope(), senkei.getLunchintercept())).size() > i; i++)
		//
		// (Difference.diffcalc(listset.getcsvlist(),
		// senkei.getCofffeeslope(), senkei.getCoffeeintercept(),
		// senkei.getLunchslope(), senkei.getLunchintercept())).get(i)
		// .getCoffee();
		//
		// if (coffeewin > lunchwin) {
		// System.out.println("コードはコーヒー摂取量に相関が有ります。");
		// } else {
		// System.out.println("コードはランチのコストに相関が有ります。");
		// }
	}
}
