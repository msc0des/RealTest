package org.example;
import java.util.*;
import java.util.stream.Collectors;

public class strhelp {
    /*Mobile m1=new Mobile();
    Mobile m2=new Mobile();
    m1.model="Apple";
    m1.price=100000;
    m2.model="Apple";
    m2.price=100000;
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m1.equals(m2));//false

        System.out.println("=================");
    String s1=new String("Hello");
    String s2=new String("Hello");
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true

    String s11="Hello";
    String s21="Hello";
        System.out.println(s11==s21);//true
        System.out.println(s11.equals(s21));//true*/
    //=================================================================================

        ArrayList<Integer> asa=new ArrayList<>();
        Stack<Integer>st =new Stack<>();
        LinkedList<Integer> l=new LinkedList<>();
        HashSet<Integer>hs=new LinkedHashSet<>();
        TreeSet<Integer>ts =new TreeSet<>();

        Map<Integer,Integer>hm=new HashMap<>();
        LinkedHashMap<Integer,Integer>hm1=new LinkedHashMap<>();
        LinkedHashSet<Integer>hm11=new LinkedHashSet<>();
        WeakHashMap<Integer,Character>wh=new WeakHashMap<>();
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        Queue<Integer> q= new LinkedList<>();
        List<Integer> lll=new LinkedList<>();

        List<Integer> ans=asa.stream().filter(x->x>6).collect(Collectors.toList());

}
