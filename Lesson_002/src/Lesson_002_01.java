
/**
 * Lesson 002.
 * <dl>
 * <dt>課題1（Lesson 002-01）</dt>
 * <dd>変数の値を入れ替える。</dd>
 * </dl>
 *
 * @author tomo-sato
 */
public class Lesson_002_01 {

	public static void main(String[] args) {
		String str1 = "aaa";
		String str2 = "bbb";

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);

		String tmp = str1;
		str1 = str2;
		str2 = tmp;

		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
	}
}
