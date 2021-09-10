package utils;


/**
 * 計算処理を提供するクラス.
 *
 * @author tomo-sato
 */
public class Calculation {

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
