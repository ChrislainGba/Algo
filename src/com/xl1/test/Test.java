package com.xl1.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		System.out.println(b);
		System.out.println(a);
		
		String c = "Minpik";
		String d = c;
		String e = "minpik";
		System.out.println(System.identityHashCode(c));
		System.out.println(System.identityHashCode(d));
		System.out.println(System.identityHashCode(e));
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		
		//Stream
		//Stream<String> streamGenerated = Stream.generate(() -> "generated").limit(3);
		//streamGenerated.forEach(System.out::println);
		
		List<String> strings = Arrays.asList("one", "two","fourr", "three");
		//String maxWord = strings.stream().max((s1,s2) -> Integer.compare(s1.length(), s2.length())).orElse("Sttring dont have max word");
		//System.out.println(maxWord);
		//list des plus long mots
		Set<String> res = strings.stream().collect(Collectors.groupingBy(String::length, Collectors.toSet()))
		.entrySet()
		.stream()
		.max((e1,e2) -> Integer.compare(e1.getKey(), e2.getKey()))
		.map(m -> m.getValue()).orElse(Set.of("one","two"));
		
		res.forEach(System.out::println);
		System.out.println("**********************");
		
		List<String> sortedList = strings.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		
		System.out.println("**********************");
		
		List<String> reverseSortedList = strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		reverseSortedList.forEach(System.out::println);
		System.out.println("**********************");
		
		Queue<Integer> queue = new LinkedList<>();
        // Ajout d'éléments à la file
        
        queue.offer(3);
        queue.offer(2);
        queue.offer(1);
        queue.offer(4);
        queue.offer(2);

        // Affichage de la file
        System.out.println("Queue: " + queue);
        List<Integer> queueList = new ArrayList<>(queue);
        Set<Integer> queueSet = new HashSet<>(queue);
        Set<Integer> queueLinkedSet = new LinkedHashSet<>(queue);
        Set<Integer> queueTree = new TreeSet<>(queue);
        while (queue.size() > 0) {
        	System.out.println(queue.poll());
			
		}
        System.out.println("QueueList: " + queueList);
        System.out.println("QueueSet: " + queueSet);
        System.out.println("QueueLinkedSet: " + queueLinkedSet);
        System.out.println("QueueTree: " + queueTree);
        
        Stream.generate(() -> "generated").limit(3)
        		.forEach(System.out::println);
        

        
        

        
        
		
		
		
		
	}
}
