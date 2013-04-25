package src;

public enum Type {
	WAHRHEITSWERT,
	ZAHL;
	
	public static Type getType(String type) {
		if (type.toLowerCase().equals("wahrheitswert")) {
			return Type.WAHRHEITSWERT;
		} else if (type.toLowerCase().equals("zahl")) {
			return Type.ZAHL;
		} else {
			return null;
		}
	}
}
