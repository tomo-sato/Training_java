
/**
 * Lesson 003.
 * <dl>
 * <dt>課題1（Lesson 003-01）</dt>
 * <dd>コマンド引数を2個受け取り、足し算を行う関数を作成し、結果を出力する。</dd>
 * </dl>
 *
 * @author tomo-sato
 */
public class Lesson_003_01 {

	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);

		int ans = add(i, j);
		System.out.printf("%d + %d = %d", i, j, ans);
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
}
