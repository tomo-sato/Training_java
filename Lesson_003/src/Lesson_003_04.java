
/**
 * Lesson 003.
 * <dl>
 * <dt>課題4（Lesson 003-04）</dt>
 * <dd>配列内の一番大きい値を返す。</dd>
 * </dl>
 *
 * @author tomo-sato
 */
public class Lesson_003_04 {

	public static void main(String[] args) {
		int[] iarr = {32,1,2,1,32,654,113,21,32,212};

		int ans = max(iarr);
		System.out.println(ans);
	}

	/**
	 * ２つの数値を比較し大きいほうを返す。
	 *
	 * @param i	数値1
	 * @param j	数値2
	 * @return	比較結果
	 */
	public static int max(final int i, final int j) {
		if (i < j) {
			return j;
		}
		return i;
	}

	/**
	 * 配列内の一番大きい値を返す。
	 *
	 * @param iarr	数値配列
	 * @return	比較結果
	 */
	public static int max(int[] iarr){
		int ans = iarr[0];
		int j;

		for(int i = 1; i < iarr.length; i++){
			System.out.printf("loop count=%d\n", i);

			j = iarr[i];
			ans = max(ans, j);
		}
		return ans;
	}
}
