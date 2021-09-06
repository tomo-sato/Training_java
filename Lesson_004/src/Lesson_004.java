import java.util.HashMap;
import java.util.Map;

/**
 * Lesson 004.
 * <dl>
 * <dt>下記コマンドラインアプリを作成する。</dt>
 * <dd>
 * 	<pre>
 * 		* 第一引数により処理の制御を行う。
 * 			* "1"：足し算
 * 			* "2"：引き算
 * 			* "3"：掛け算
 * 			* "4"：割り算
 * 		* 上記の制御に沿って第二引数と第三引数を計算する。
 * 		* それぞれの制御に応じた関数を作成する。
 * 		* エラー処理を加える。
 * 			* 引数が3つ未満の場合エラー。
 * 				* "起動引数が足りません。"
 * 			* 第一引数に"1～4"以外の値が指定された場合エラー。
 * 				* "既定外の値が入力されました。"
 * 			* 第二引数、第三引数に数値以外が入力された場合はエラー
 * 				* "数値以外が入力されました。"
 * 	</pre>
 * </dd>
 * </dl>
 *
 * @author tomo-sato
 */
public class Lesson_004 {

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
						sum = add(i, j);
						break;

					// 引き算
					case SUB:
						sum = sub(i, j);
						break;

					// 掛け算
					case MLT:
						sum = mlt(i, j);
						break;

					// 割り算
					case DIV:
						sum = div(i, j);
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


	/**
	 * 第1引数と第2引数を足し算し答えを返す。
	 *
	 * @param i	数値1
	 * @param j	数値2
	 * @return	計算結果(足し算)
	 */
	public static int add(final int i, final int j) {
		int ret = i + j;
		return ret;
	}

	/**
	 * 第1引数と第2引数を引き算し答えを返す。
	 *
	 * @param i	数値1
	 * @param j	数値2
	 * @return	計算結果(引き算)
	 */
	public static int sub(final int i, final int j) {
		if (i < j) {
			return 0;
		}
		int ret  = i - j;
		return ret;
	}

	/**
	 * 第1引数と第2引数を掛け算し答えを返す。
	 *
	 * @param i	数値1
	 * @param j	数値2
	 * @return	計算結果(掛け算)
	 */
	public static int mlt(final int i, final int j) {
		int ret  = i * j;
		return ret;
	}

	/**
	 * 第1引数と第2引数を割り算し答えを返す。
	 *
	 * @param i	数値1
	 * @param j	数値2
	 * @return	計算結果(割り算)
	 */
	public static int div(final int i, final int j) {
		if (j == 0) {
			throw new IllegalArgumentException("0 で割ることはできません！！");
		}
		int ret  = i / j;
		return ret;
	}
}
