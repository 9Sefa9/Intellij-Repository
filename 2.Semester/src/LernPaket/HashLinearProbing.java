package LernPaket;

public class HashLinearProbing<Key, Value> {

	private int M = 30001;
	private Value[] vals = (Value[]) new Object[M];
	private Key[] keys = (Key[]) new Object[M];

	private int hash(Key key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}
	private void putSelbstversuch(Key key, Value value){
		int i;
		for(i=hash(key); keys[i]!=null; i = (i+1)%M )
			if(keys[i].equals(key))
				//abbrechen, wenn bereits vorhanden
				break;
		//ansonsten setzen! 
		keys[i] = key;
		vals[i] = value;
	}
	private Value getSelbstversuch(Key key){
		for(int i = hash(key); keys[i] != null; i = (i+1)%M)
			if(keys[i].equals(key))
				return vals[i];
		return null;
	}

	private void put(Key key, Value val) {
		int i;
		for (i = hash(key); keys[i] != null; i = (i + 1) % M)
			if (keys[i].equals(key))
				break;
		keys[i] = key;
		vals[i] = val;
	}

	public Value get(Key key) {
		for (int i = hash(key); keys[i] != null; i = (i + 1) % M)
			if (keys[i].equals(key))
				return vals[i];
		return null;
	}
}
