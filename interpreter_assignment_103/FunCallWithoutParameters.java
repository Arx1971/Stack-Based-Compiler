package interpreter_assignment_103;

import java.util.*;

class FunCallWithoutParameters extends FunCall {
	// FunName funName; inherited from FunCall

	FunCallWithoutParameters(FunName fName) {
		funName = fName;
	}

	void printParseTree(String indent) {
		super.printParseTree(indent + " ");
	}

	Val Eval(Hashtable<String, Val> state) {
		Id id = funName.id;
		if (id == null)
			return null;

		FunDef funDef = Parser.fundeftable.get(id.id);
		if (funDef != null) {
			Body body = funDef.body;
			Hashtable<String, Val> newState = new Hashtable<String, Val>();
			body.M(newState);

			return newState.get("returnVal");
		}

		return null;

	}
}