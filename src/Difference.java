import java.util.ArrayList;

public class Difference {
	public static ArrayList diffcalc(ArrayList<Testdatacontents> list,
			double coffeeslope, double coffeeintercept, double lunchslope,
			double lunchintercept) {
		// 予測値をtestdatacontentsに格納したオブジェクトを格納したlistを生成
		Forecast forecast = new Forecast();
		forecast.forecastcalc(list, coffeeslope, coffeeintercept, lunchslope,
				lunchintercept);
		// 予測値と、実測値を比較
		ArrayList<Testdatacontents> errorrange = new ArrayList<Testdatacontents>();
		for (int i = 0; list.size() > i; i++) {
			int coffeediff;
			int lunchdiff;
			coffeediff = (((Testdatacontents) (forecast.getforecast()).get(i))
					.getCoffee()) - (list.get(i).getCoffee());
			coffeediff = Math.abs(coffeediff);
			lunchdiff = (((Testdatacontents) (forecast.getforecast()).get(i))
					.getLunch()) - (list.get(i).getLunch());
			lunchdiff = Math.abs(coffeediff);

			Testdatacontents testdatacontents = new Testdatacontents();
			testdatacontents.setCoffee(coffeediff);
			testdatacontents.setCoffee(lunchdiff);
			errorrange.add(testdatacontents);
		}
		;
		return errorrange;
	};

}
