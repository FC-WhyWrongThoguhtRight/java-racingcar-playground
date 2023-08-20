package controller;

import model.Name;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RacingGameUtil {


    private static final String DELIMITER = ",";

    public static List<Name> splitNames(String names) {

        String[] nameArr = names.split(DELIMITER);
        List<Name> nameList = new ArrayList<>();

        for(String name : nameArr){
            nameList.add(new Name(name));
        }

        return nameList;
    }
}
