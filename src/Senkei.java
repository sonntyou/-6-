import java.util.ArrayList;

import org.apache.commons.math3.stat.regression.SimpleRegression;

public class Senkei {
	public static double coffeeintercept;
	public static double cofffeeslope;
	public static double lunchintercept;
	public static double lunchslope;

	public void calc(ArrayList<Testdatacontents> list) {
		SimpleRegression	coffeeregression = new SimpleRegression();
		SimpleRegression lunchregression = new SimpleRegression();
//		コーヒー、コードのデータをリグレッションに入れる
		for(int i=0;list.size()>i;i++){
		coffeeregression.addData(list.get(i).getCoffee, list.get(i).getCode;);
		}
//		ランチ、コードのデータをリグレッションに入れる
		for(int i=0;list.size()>i;i++){
			coffeeregression.addData(list.get(i).getLunch, list.get(i).getCode;);
		}
//		コーヒーとコードのslope,interceptをセット
		double coffeeintercept = coffeeregression.getIntercept();
		double coffeeslope = coffeeregression.getSlope();
//		ランチとコードのslope,interceptをセット
		double lunchintercept = lunchregression.getIntercept();
		double lunchslope = lunchregression.getSlope();
	}

	public static double getCoffeeintercept() {
		return coffeeintercept;
	}

	public static double getCofffeeslope() {
		return cofffeeslope;
	}

	public static double getLunchintercept() {
		return lunchintercept;
	}

	public static double getLunchslope() {
		return lunchslope;
	}

}
