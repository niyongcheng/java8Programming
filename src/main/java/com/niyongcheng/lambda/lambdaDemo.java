package com.niyongcheng.lambda;

import com.niyongcheng.lambda.model.Project;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class lambdaDemo {
    static List<Project> projects = new ArrayList<>(8);


    static <T> List<T> filter(List<T> projects, Predicate<T> predicate){
        return projects.stream().filter(predicate).collect(Collectors.toList());
    }

    public static void main(String[] args){
        /**
         *
         */
        projects.add(Project.builder().name("A").star(20).build());
        projects.add(Project.builder().name("B").star(10).build());
        projects.add(Project.builder().name("C").star(20).build());
        projects.add(Project.builder().name("D").star(10).build());
        projects.add(Project.builder().name("E").star(20).build());
        projects.add(Project.builder().name("F").star(10).build());
        projects.add(Project.builder().name("G").star(20).build());

        filter(projects,item->item.getStar()>15).stream().map(item -> item.getStar()).forEach(System.out::println);
    }
}
