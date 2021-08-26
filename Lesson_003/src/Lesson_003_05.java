
/**
 * Lesson 003.
 * <dl>
 * <dt>課題5（Lesson 003-05）</dt>
 * <dd>配列内の一番大きい値を返す。（※ループ回数を減らす。先頭からと後方からとで比較していく。）</dd>
 * </dl>
 *
 * @author tomo-sato
 */
public class Lesson_003_05 {

	public static void main(String[] args) {
		int[] iarr = {32,1,2,1,332,11,113,21,32,212};
		int ans = max(iarr);
		System.out.println(ans);

		int[] iarr2 = {32,113,21,32,212,1,2,1,332,11};
		ans = max(iarr2);
		System.out.println(ans);

		int[] iarr3 = {32,113,1,332,11,21,32,212,1,2};
		ans = max(iarr3);
		System.out.println(ans);

		int[] iarr4 = {32,113};
		ans = max(iarr4);
		System.out.println(ans);

		int[] iarr5 = {32};
		ans = max(iarr5);
		System.out.println(ans);

		int[] iarr6 = {32,113,21,212,1,2,1,332,11};
		ans = max(iarr6);
		System.out.println(ans);

		int[] iarr7 = {32,113,1,332,11,1,2};
		ans = max(iarr7);
		System.out.println(ans);

		int[] iarr8 = {113,32,332,1};
		ans = max(iarr8);
		System.out.println(ans);

		int[] iarr9 = {32,113,21,212,332,1,2,1,11};
		ans = max(iarr9);
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
		int lastindex = iarr.length - 1;

		int ans1 = iarr[0];
		int ans2 = iarr[lastindex];

		for (int i = 1; ; i++) {
			System.out.printf("loop count=%d\n", i);

			int j = lastindex - i;
			if (i > j) {
				ans1 = max(ans1, ans2);
				break;
			}

			ans1 = max(ans1, iarr[i]);
			ans2 = max(ans2, iarr[j]);
		}

		return ans1;
	}
}
