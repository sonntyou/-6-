import org.apache.commons.math3.stat.regression.SimpleRegression;
import java.util.ArrayList;

public class Senkei {
	public static double intercept;
	public static double  slope;

	public static void calc(ArrayList <Testdatacontents> list){
	SimpleRegression regression=new SimpleRegression();
	list.getCofee();
	regression.addData(1.0,2.0);
	 intercept =regression.getIntercept();
	 slope=regression.getSlope();

	}
}
}
