package com.brainacad.oop.testcollection3;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> arrayList = new ArrayList<>();
    LinkedList<String> linkedList = new LinkedList<>();
    for (int i = 0; i < 10; i++) {
      arrayList.add("num_"+i);
      linkedList.add("num_"+i);
    }
    System.out.println("---------------ArrayList----------------");
    printElements(arrayList);
    Iterator<String> iterator;
    System.out.println("---------------LinkedList----------------");
    printElements(linkedList);

    System.out.println("---------------List Insertion----------------");
    iterator = arrayList.listIterator();
    while (iterator.hasNext()){
      linkedList.add(iterator.next());
    }
    printElements(linkedList);
    System.out.println("---------------perform the insertion elements of the first list in reverse order----------------");
    for (Iterator<String> stringIterator = arrayList.iterator(); stringIterator.hasNext(); ) {
      String next = stringIterator.next();
      linkedList.addFirst(next);
    }
    printElements(linkedList);
  }

  private static void printElements(List<String> arrayList) {
    Iterator<String> iterator = arrayList.iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }
  }
}
