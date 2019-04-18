/*
 * Created by gh on 2019/4/18.
 * desc:
 */
package com.gh.user.service;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ***********************************************************
 *
 * @CopyrightBy: 四川复兴教育科技有限公司
 * ***********************************************************
 * @Version: v0.0.1
 * @Function: ***********************************************************
 * @CreatedBy: gh on 2019/4/18 11:07
 * ***********************************************************
 * @ModifiedBy: [name] on [time]
 * @Description: ***********************************************************
 */
public class test {

    public static void xx(){
        List<String> strings = Arrays.asList("a","","b");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());

        List<Integer> numbers1 = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

        IntSummaryStatistics stats = numbers1.stream().mapToInt((x) -> x).summaryStatistics();

        System.out.println(stats);
    }

}
