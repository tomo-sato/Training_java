
/**
 * Lesson 002.
 * <dl>
 * <dt>課題2（Lesson 002-02）</dt>
 * <dd>2つの配列を用意し前後入れ替える。</dd>
 * </dl>
 *
 * @author tomo-sato
 */
public class Lesson_002_02 {

	public static void main(String[] args) {

		int[] iarr1 = {0,1,2,3,4,5,6,7,8,9};
		int[] iarr2 = new int[iarr1.length];

		int cnt1 = 0;
		int cnt2 = iarr1.length - 1;

		while(cnt1 < iarr1.length){
			iarr2[cnt2--] = iarr1[cnt1++];
		}

		// 表示
		ArrayUtil.println(iarr1);
		ArrayUtil.println(iarr2);
	}
}
