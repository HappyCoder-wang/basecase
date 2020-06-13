package question4;

public class Pen {
	private int ink;
	public Pen(int ink) {
		this.ink=ink;
	}
	public int write() {
		return ink;
	}
	public int write(int ink) {
		return this.ink-ink;
	}
}
