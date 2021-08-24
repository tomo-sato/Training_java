
/**
 * Lesson 002.
 * <dl>
 * <dt>課題4（Lesson 002-04）</dt>
 * <dd>2つの配列を用意し前後入れ替える。</dd>
 * </dl>
 *
 * @author tomo-sato
 */
public class Lesson_002_04 {

	public static void main(String[] args) {

		int[] iarr1 = {0,1,2,3,4,5,6,7,8,9};
		int[] iarr2 = new int[iarr1.length];

		int cnt2 = iarr1.length - 1;

		for(int cnt1 = 0; cnt1 < iarr1.length; ){
			iarr2[cnt2--] = iarr1[cnt1++];
		}

		ArrayUtil.println(iarr1);
		ArrayUtil.println(iarr2);
	}
}
