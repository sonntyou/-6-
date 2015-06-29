import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Listset {
	static ArrayList<Testdatacontents> list = new ArrayList<Testdatacontents>();

	public static void makecsvlist() {
		try {
			File csv = new File("C:\\Users\\levelfive\\Desktop\\Coffee.csv"); // CSVデータファイル

			BufferedReader br = new BufferedReader(new FileReader(csv));

			// 最終行まで読み込む
			String line = "";
			while ((line = br.readLine()) != null) {

				// 1行をデータの要素に分割
				StringTokenizer st = new StringTokenizer(line, ",");
				int i = 0;
				while (st.hasMoreTokens()) {
					// 1行の各要素をタブ区切りで表示
					Testdatacontents testdatacontents = new Testdatacontents();
					if (i == 0) {
						i++;
					}
					if (i == 1) {
						testdatacontents.setCoffee(Integer.parseInt(st
								.nextToken()));
						i++;
						continue;
					}

					if (i == 2) {
						testdatacontents.setLunch(Integer.parseInt(st
								.nextToken()));
						i++;
						continue;
					}

					if (i == 3) {
						testdatacontents.setCode(Integer.parseInt(st
								.nextToken()));
						list.add(testdatacontents);
					}
				}
			}
			br.close();

		} catch (FileNotFoundException e) {
			// Fileオブジェクト生成時の例外捕捉
			e.printStackTrace();
		} catch (IOException e) {
			// BufferedReaderオブジェクトのクローズ時の例外捕捉
			e.printStackTrace();
		}

	}

	public ArrayList getcsvlist() {
		return list;
	};

}
