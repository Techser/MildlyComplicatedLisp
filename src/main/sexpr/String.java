package sexpr;

import java.io.PrintStream;

public class String extends Sexpr {
	private java.lang.String val;

	public String(java.lang.String s) {
		this.val = s;
	}

	public void write(PrintStream ps) {
		ps.print(this.toString());
	}

	public java.lang.String toString() {
		return java.lang.String.format("\"%s\"", this.val);
	}

	public Sexpr eval(Environment env) {
		return this;
	}

	public Type type() {
		return Type.String;
	}

	public boolean equals(Sexpr expr) {
		if (expr.type() == Type.String) {
			return ((String)expr).val.equals(this.val);
		} else {
			return false;
		}
	}
}
