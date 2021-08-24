
/**
 * Lesson 002.
 * <dl>
 * <dt>課題3（Lesson 002-03）</dt>
 * <dd>1つの配列を用意し前後入れ替える。</dd>
 * </dl>
 *
 * @author tomo-sato
 */
public class Lesson_002_03 {

	public static void main(String[] args) {

		int[] iarr = {0,1,2,3,4,5,6,7,8,9};
		int tmp;

		// [ia.length / 2]奇数の場合切捨てが行われる。
		for(int count = 0; count < iarr.length / 2; count++){
			tmp = iarr[count];
			iarr[count] = iarr[iarr.length - count - 1];
			iarr[iarr.length - count - 1] = tmp;
		}

		ArrayUtil.println(iarr);
	}
}
