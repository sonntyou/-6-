import java.util.ArrayList;

public class Difference {

	public void diffcalc(ArrayList<Testdatacontents> list,double coffeeslope,double coffeeintercept, double lunchslope,double lunchintercept){
//		予測値をtestdatacontentsに格納したオブジェクトを格納したlistを生成
		Forecast forecast= new Forecast();
		forecast.forecastcalc(list, coffeeslope, coffeeintercept, lunchslope,lunchintercept);
//		予測値と、実測値を比較
		ArrayList<Integer> errorrange=new ArrayList<Integer>();
		for(int i=0;list.size()>i;i++)
		int diff;
		diff= (forecast.getforecast()).get(i).getCoffee) -(list.get(i).getCoffee);
		diff= Math.abs(diff);

	}
}
