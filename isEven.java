
public class isEven implements Function<Integer, Boolean> {
	//receives Integer t and returns true if even
	@Override
	public Boolean apply(Integer t) {
		return ((t&1)==0)?true:false;
	}

}
