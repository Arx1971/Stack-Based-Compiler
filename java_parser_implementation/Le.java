package java_parser_implementation;

public class Le extends CompBoolPrimary {
	Le(E e_1, E e_2) {
		super(e_1, e_2);
	}

	String getOp() {
		return " <=";
	}
}
