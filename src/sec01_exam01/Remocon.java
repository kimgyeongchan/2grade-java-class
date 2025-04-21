package sec01_exam01;
public interface Remocon {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	public default void turnOn() {}
	public default void turnOff() {}
	public abstract void setVolume(int vol);
}
