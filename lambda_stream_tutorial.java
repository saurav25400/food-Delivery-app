import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class lambda_stream_tutorial {

    public static void main(String[] args) {


        //1st way
//        Tut_interface obj=new Tut2();
//        System.out.println(obj.walk(2));


        //2nd way

//        Tut_interface obj=new Tut_interface() {
//            @Override
//            public int walk(int steps) {
//                System.out.println("running steps "+steps);
//                return 2*steps;
//            }
//        };
//
//        System.out.println(obj.walk(9));

        // 3rd way using lambda expression

//        Tut_interface obj=(steps)->{
//            System.out.println("running steps "+steps);
//            return 2*steps;
//        };
//
//        obj.walk(20);


        // Stream API

        List<String> ls=List.of("Banana","Apple","Kiwi");

//        ls.stream()
//                .sorted()
////                .forEach(System.out::println);
//                .filter((fruit)->fruit.length()<5)
//
//                .forEach((fruit)->{
//                    System.out.println(fruit);
//                });

        // store all the elements in list or set

//      Set<Integer>set = ls.stream()
//                .map((fruits)->fruits.length())
//                .sorted()
//                .collect(Collectors.toSet());
//        System.out.println(set);

        // store all the elements in Map

        Map<String,Integer> map=ls.stream().sorted().collect(Collectors.toMap(fruit->fruit,
                fruit->fruit.length()
                ));
        System.out.println(map);





    }
}
