package com.tns.Stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Alice","Bob","Abhi","Sowmiya"); //convert to A->L
		//Stream<String> result=names.stream().filter(name -> name.startsWith("A")).map(String::toUpperCase);
		List<String> result=names.stream().filter(name -> name.startsWith("A")).map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println("Filtered Names : "+result);
	}

}
