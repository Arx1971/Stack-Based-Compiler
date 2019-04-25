package interpreter_assignment_103;

import java.util.*;

class Block extends Statement {
	SList sList;

	Block(SList s) {
		sList = s;
	}

	void printParseTree(String indent) {
		String indent1 = indent + " ";

		super.printParseTree(indent);
		IO.displayln(indent1 + indent1.length() + " <block>");
		sList.printParseTree(indent1 + " ");
	}

	void M(Hashtable<String, Val> state) {
		sList.M(state);
	}
}