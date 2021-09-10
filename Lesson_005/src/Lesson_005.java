import java.util.HashMap;
import java.util.Map;

import utils.Calculation;

/**
 * Lesson 005.
 * <dl>
 * <dt>下記コマンドラインアプリを作成する。</dt>
 * <dd>
 * 	<pre>
 * 		* 計算処理を別クラスに切り出し、Lesson 004と同じ動きにする。
 * 	</pre>
 * </dd>
 * </dl>
 *
 * @author tomo-sato
 */
public class Lesson_005 {

	/** 足し算 */
	public static final int ADD = 1;
	/** 引き算 */
	public static final int SUB = 2;
	/** 掛け算 */
	public static final int MLT = 3;
	/** 割り算 */
	public static final int DIV = 4;

	public static final Map<Integer, String> CONTROL_MAP = new HashMap<Integer, String>() {
		{
			put(ADD, " + ");
			put(SUB, " - ");
			put(MLT, " * ");
			put(DIV, " / ");
		}
	};


	public static void main(String[] args) {
		int i = 0;
		int j = 0;

		try {
			if (args.length <= 1) {
				System.err.println("起動引数が足りません。");

			} else {
				String strControl = args[0];
				int control = -1;
				try {
					control = Integer.parseInt(strControl);
				} catch (NumberFormatException e) {
					System.err.println("既定外の値が入力されました。:" + strControl);
					return;
				}

				i = Integer.parseInt(args[1]);
				j = Integer.parseInt(args[2]);

				int sum = 0;
				switch (control) {

					// 足し算
					case ADD:
						sum = Calculation.add(i, j);
						break;

					// 引き算
					case SUB:
						sum = Calculation.sub(i, j);
						break;

					// 掛け算
					case MLT:
						sum = Calculation.mlt(i, j);
						break;

					// 割り算
					case DIV:
						sum = Calculation.div(i, j);
						break;

					// 規定外の値
					default:
						System.err.println("既定外の値が入力されました。:" + control);
						return;
				}
				System.out.println(i + CONTROL_MAP.get(control) + j + " = " + sum);
			}

		} catch (NumberFormatException e) {
			System.err.println("数値以外が入力されました。");

		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}
}
