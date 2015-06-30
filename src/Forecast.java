import java.util.ArrayList;

public class Forecast {
	ArrayList<Testdatacontents> forecastvalue = new ArrayList<Testdatacontents>();

	public void forecastcalc(ArrayList<Testdatacontents> list,
			double coffeeslope, double coffeeintercept, double lunchslope,
			double lunchintercept) {
		for (int i = 0; list.size() > i; i++) {
			list.get(i).getCoffee();
			// 予測値を生成
			int coffeeforecast = (int) (coffeeslope * (list.get(i).getCoffee()) + coffeeintercept);
			int lunchforecast = (int) (lunchslope * (list.get(i).getLunch()) + lunchintercept);
			// 出来た予測値をTestdatacontentsインスタンスにセット
			Testdatacontents testdatacontents = new Testdatacontents();
			testdatacontents.setCoffee(coffeeforecast);
			testdatacontents.setLunch(lunchforecast);
			// forecastvalueリストにtestdatacontentsをセット
			forecastvalue.add(testdatacontents);
		}
	}

	public ArrayList getforecast() {
		return forecastvalue;
	};
}
