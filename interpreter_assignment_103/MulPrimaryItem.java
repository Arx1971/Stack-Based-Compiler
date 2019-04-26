package interpreter_assignment_103;

import java.util.*;

class MulPrimaryItem extends PrimaryItem

// Represents "* <primary>"

{
	// Primary primary; inherited from PrimaryItem

	MulPrimaryItem(Primary p) {
		primary = p;
	}

	void printParseTree(String indent) {
		IO.displayln(indent + indent.length() + " *");
		primary.printParseTree(indent);
	}

	boolean isMul() {
		return true;
	}

	boolean isDiv() {
		return false;
	}

	Val Eval(Hashtable<String, Val> state, Val termVal) {
		termVal = primary.Eval(state);
		if (termVal instanceof BoolVal) {
			System.out.println("Error: * operator cannot be applied to " + termVal);
		}
		return termVal;
	}
}