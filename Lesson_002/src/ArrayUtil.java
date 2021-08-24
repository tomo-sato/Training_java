
/**
 * 配列操作のユーティリティクラス.
 *
 * @author tomo-sato
 */
public class ArrayUtil {

	/**
	 * int配列の値を標準出力する。
	 * @param iarr int配列
	 */
	public static void println(int[] iarr){

		StringBuffer bf = new StringBuffer(String.valueOf(iarr[0]));

		for(int cnt = 1; cnt < iarr.length; cnt++){
			bf.append(" ," + iarr[cnt]);
		}

		System.out.println(bf.toString());
	}
}
