package com.inspur.demo.utils;

import com.fasterxml.uuid.Generators;

public class UUIDGenerator {
	public static String getUUID() {
		return Generators.timeBasedGenerator().generate().toString();
	}
}
