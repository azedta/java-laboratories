import java.util.function.Function;

public class Iterative {
	
	public static BitList complement(BitList in) {
		String inStr = in.toString();
		BitList out = new BitList();
		Iterator outIterator = out.iterator();
		for (int i = 0; i < inStr.length(); i++) {
			outIterator.add(inStr.charAt(i) == '1' ? 0 : 1);
		}
		return out;
	}
	
	public static BitList or(BitList a, BitList b) {
		return merge(a, b, (aBit, bBit) -> aBit || bBit);
	}
	
	public static BitList and(BitList a, BitList b) {
		return merge(a, b, (aBit, bBit) -> aBit && bBit);
	}
	
	public static BitList xor(BitList a, BitList b) {
		return merge(a, b, (aBit, bBit) -> aBit ^ bBit);
	}
	
	private static BitList merge(BitList a, BitList b, Operator operator) {
		String aStr = a.toString();
		String bStr = b.toString();
		if (!a.iterator().hasNext() || !b.iterator().hasNext() || aStr.length() != bStr.length()) {
			throw new IllegalArgumentException();
		}
		BitList out = new BitList();
		Iterator outIterator = out.iterator();
		for (int i = 0; i < aStr.length(); i++) {
			boolean aBit = aStr.charAt(i) == '1';
			boolean bBit = bStr.charAt(i) == '1';
			outIterator.add(operator.eval(aBit, bBit) ? 1 : 0);
		}
		return out;
	}
	
	private interface Operator {
		abstract boolean eval(boolean a, boolean b);
	}
	
}
