package interpreter_assignment_103;

import java.util.*;

class Parenthesized extends Primary {
	Expr expr;

	Parenthesized(Expr e) {
		expr = e;
	}

	void printParseTree(String indent) {
		super.printParseTree(indent);
		IO.displayln("");
		expr.printParseTree(indent + " ");
	}

	Val Eval(Hashtable<String, Val> state) {
		return expr.Eval(state);
	}
}