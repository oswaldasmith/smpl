package com.comp3652.sys;

import java.util.HashMap;
import java.util.Map;

public class  SMPLEnvironment<T> {

	Map<String, T> dictionary;
	SMPLEnvironment<T> parent;

	public SMPLEnvironment() {
		parent = null;
		dictionary = new HashMap<>();
	}

	public void put(String id, T value) {
		dictionary.put(id, value);
	}

	public T get(String id) throws SMPLException {
		T result = dictionary.get(id);

		if (null == result)
			if (null == parent)
				throw new SMPLException("Unbound variable " + id);
			else
				return parent.get(id);
		else
			return result;
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();

		for (String name : dictionary.keySet()) {
			result = result.append(name);
			result = result.append(" ");
		}
		return result.toString();
	}


}