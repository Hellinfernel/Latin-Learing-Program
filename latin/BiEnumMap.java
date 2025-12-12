package latin;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class BiEnumMap<A extends Enum<A>,B extends Enum<B>,X> {
    private Map<A, Map<B,X>> mapA;
    
    public BiEnumMap(EnumSet<A> enumA, EnumSet<B> enumB){
        mapA = new HashMap<A, Map<B, X>>();
        enumA.stream().forEach(a -> mapA.put(a, new HashMap<B, X>())); //For each value in enumA, generate a entry in mapA
        mapA.entrySet()
                .forEach(map -> enumB.stream()
                        .forEach(b -> 
                                map.getValue().put(b, null)));
        
        //Then, for every entry in mapA, for every entry in enumB, generate a entry

    }
    public BiEnumMap(Enum<A> enumA, Enum<B> enumB){
        mapA = new HashMap<A, Map<B, X>>();
        enumA.valueOf().stream().forEach(a -> mapA.put(a, new HashMap<B, X>())); //For each value in enumA, generate a entry in mapA
        mapA.entrySet()
                .forEach(map -> enumB.valueOf().stream()
                        .forEach(b ->
                                map.getValue().put(b, null)));

        //Then, for every entry in mapA, for every entry in enumB, generate a entry

    }
    
}
