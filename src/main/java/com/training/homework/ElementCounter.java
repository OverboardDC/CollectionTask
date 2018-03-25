package com.training.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class for counting the same elements
 * in the list
 *
 * @author Eugene Kushpii
 * @version 1.0
 */
public class ElementCounter {

    private List<Integer> list;


    ElementCounter(List list){
        this.list = list;
    }

    public Map calculateRepetition(){
        HashMap<Object, Integer> map = new HashMap<>();
        for (Object o : list) {
            if (map.containsKey(o)) {
                map.put(o, map.get(o) + 1);
            } else {
                map.put(o, 1);
            }
        }
        return map;
    }

}
