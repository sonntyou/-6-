import java.util.ArrayList;

public class Forecast {
	ArrayList<Testdatacontents> forecastvalue = new ArrayList<Testdatacontents>();

	public void forecastcalc(ArrayList<Testdatacontents> list,
			double coffeeslope, double coffeeintercept, double lunchslope,
			double lunchintercept) {
		for (int i = 0; list.size() > i; i++) {
			// 予測値を生成
			int coffeeforecast = (coffeeslope * (list(i).getcoffee) + coffeeintercept);
			int lunchforecast = (lunchslope * (list(i).getlunch) + lunchintercept);
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
