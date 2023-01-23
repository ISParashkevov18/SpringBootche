package com.example.springbootche;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NumbersService {
    public List<Integer> getNumbersDivisibleByThree(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}
