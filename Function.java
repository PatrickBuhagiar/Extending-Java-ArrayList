public interface Function<T,U> {
	//apply() receives item of type T and returns item of type U
	U apply(T t);
}
