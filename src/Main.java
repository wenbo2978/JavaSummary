//import javafx.util.Pair;
//import sun.awt.geom.AreaOp;
//
//import java.util.*;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//public class Main {
//
//    public static void TestOfMap(){
//        Map<String, Integer> mpMap1 = new HashMap<>();
//        mpMap1.put("张无忌", 100);
//        mpMap1.put("杨过", 99);
//        mpMap1.put("郭靖", 80);
//        if(mpMap1.containsKey("张无忌")){
//            System.out.println(mpMap1.get("张无忌"));
//        }else {
//            mpMap1.put("张无忌", 100);
//        }
//        //mpMap1.remove("张无忌");
//        for(String key: mpMap1.keySet()){
//            System.out.println(key);
//        }
//
//        for(int i: mpMap1.values()){
//            System.out.println(i);
//        }
//
//        for(Map.Entry<String, Integer> en : mpMap1.entrySet()){
//            String key = en.getKey();
//            int val = en.getValue();
//            System.out.println("key:" + key + ", value:" + val);
//
//        }
//
//        //map.computerIfAbsent(u, k->new ArrayList<>()).add(v);
//        //map.getOrDefault(node, new ArrayList<>());
//        //map.putIfAbsent(node, new ArrayList<>());
//
//    }
//
//    public static void TestOfSet(){
//
//        Set<String> str = new HashSet<String>();
//        str.add("first");//添加元素
//        str.add("second");
//        str.remove("first");//删除元素
//        //遍历，通过迭代器
//        Iterator<String> it = str.iterator();
//        while(it.hasNext())
//        {
//            System.out.println(it.next());
//        }
//        //通过foreach
//        for(String s:str)
//        {
//            System.out.println(s);
//        }
//
//
//    }
//
//
//
//    public static void TestQueue(){
//        Queue<Integer> myQueue = new LinkedList<Integer>();
//        /*
//        offer, poll, peek: when queue is full, it will return false
//        add, remove, element: when queue is full, it will throw an Exception
//        */
//        for(int i = 0; i < 10; i ++){
//            myQueue.offer(i * i);
//        }
//
//        for(int q: myQueue){
//            System.out.println(q);
//        }
//        while(!myQueue.isEmpty()){
//            myQueue.poll();
//        }
//        System.out.println(myQueue.poll());
//        System.out.println(myQueue.peek());
//    }
//
//    public static void TestList(){
//        //https://www.digitalocean.com/community/tutorials/java-list
//        //ArrayList
//        List<Integer> aList = new ArrayList<>();
//        for(int i = 0; i < 10; i ++){
//            aList.add(i * 2);
//        }
//        for(int v : aList){
//            System.out.print(v + " ");
//        }
//        System.out.println("");
//
//        aList.remove(2);
//
//        for(int i = 0; i < aList.size(); i ++){
//            System.out.print(aList.get(i) + " ");
//        }
//        System.out.println("");
//
//        aList.set(0, 100);
//
//        for(int i = 0; i < aList.size(); i ++){
//            System.out.print(aList.get(i) + " ");
//        }
//        System.out.println("");
//
//        //covert ArrayList into Array
//        Object[] array = aList.toArray();
//        for(int i = 0; i < array.length; i ++){
//            System.out.print(array[i] + " ");
//        }
//        System.out.println("");
//        //toArray method does't work with primitive type
//        //so int[] array2 = aList.toArray(new int[0]) is wrong
//        Integer[] array2 = aList.toArray(new Integer[0]);
//        for(int i = 0; i < array.length; i ++){
//            System.out.print(array2[i] + " ");
//        }
//        System.out.println("");
//
//        ArrayList<int[]> List2 = new ArrayList<>();
//        for(int i = 0; i < 10; i ++){
//            int[] a = new int[4];
//            for(int j = 0; j < 4; j ++){
//                a[j] = i + j;
//            }
//            List2.add(a);
//        }
//
//        int[][] array3 = List2.toArray(new int[List2.size()][]);
//
//    }
//
//    public static void TestString(){
//        String a = "123";
//        String b = "123";
//        String c = new String("123");
//        String d = new String("123");
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a.equals(c));
//        System.out.println(c == d);
//        System.out.println(c.equals(d));
//        //convert String into int
//        int num = Integer.parseInt("123");
//        int num2 = Integer.valueOf("123");
//
//        StringBuilder builder = new StringBuilder("123");
//        String reversedString = builder.reverse().toString();
//
//        //concat
//        String aa = a.concat("234");
//        char digit = '9';
//        String aaa = aa + digit;
//        System.out.println(aaa);
//        //charAt
//        System.out.println(aa.charAt(2));
//        //substring
//        //stringBuilder
//        System.out.println(aa);
//        //convert String between char[]
//        char[] charArray = aa.toCharArray();
//        String newString = new String(charArray);
//
//        //define array
//        String[] ans = new String[]{"12", "34"};
//
//        String binaryStr = "1111";
//        int decimal = Integer.parseInt(binaryStr, 2);
//        String bStr = Integer.toBinaryString(decimal);
//
//    }
//
//    public static void TestStack(){
//        Stack<Integer> stack = new Stack<Integer>();
//        for(int i = 0; i < 10; i ++){
//            stack.push(i * i);
//        }
//        for(int s : stack){
//            System.out.println(s);
//        }
//
//        System.out.println(stack.peek());
//
//        System.out.println(stack.pop());
//
//        System.out.println(stack.search(25));
//
//    }
//
//    public static void TestSort(){
//        int[] ans = new int[]{2, 5, 3, 7, 9, 2, 12};
//        Arrays.sort(ans);
//
//        for(int n : ans){
//            System.out.print(n + " ");
//        }
//        System.out.println();
//
//
//        int[][] ans2D = new int[][]{{2,5,5,8,1,6,3}, {2,8,5,8,1,3,3}};
//        Arrays.sort(ans2D, (x, y) -> (y[0] - x[0]));
//
//        // it is not correct because Arrays.sort accept Object[],
//        // and int[][] is an array of int[], int[] is an object
//        //int[] ans1D = new int[]{2, 5, 3, 7, 9, 2, 12};
//        //Arrays.sort(ans1D,(x, y) -> (y - x));
//        /*
//        if Student is an Object, that code is correct
//        Student[] stus = new Student[];
//        Arrays.sort(stus, (x, y) -> (y.age- x.age));
//         */
//
//    }
//
//    public static void TestPair(){
//        Pair<String, Integer> pair = new Pair<>("Snow", 20);
//        System.out.println(pair.getKey());
//        System.out.println(pair.getValue());
//    }
//
//    public static void TestStream(){
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
//
//        System.out.println("Even Numbers: " + evenNumbers);
//        List<Integer> squares = numbers.stream()
//                .map(n -> n * n)
//                .collect(Collectors.toList());
//        System.out.println("Squares of Numbers: " + squares);
//        int sum = numbers.stream()
//                .reduce(0, (a, b) -> a + b);
//        System.out.println("Sum of Numbers: " + sum);
//        Optional<Integer> product = numbers.stream()
//                .reduce((a, b) -> a * b);
//        product.ifPresent(p -> System.out.println("Product of Numbers: " + p));
//
//
//    }
//
//    public static void main(String[] args) {
//
//        //TestOfMap();
//        //TestQueue();
//        //TestStack();h
//        //TestString();
//        //TestList();
//        //TestPair();
//        //System.out.println(TrafficLight.values()[0].getColor());
//        //TestStream();
//        TestSort();
//
//    }
//}
