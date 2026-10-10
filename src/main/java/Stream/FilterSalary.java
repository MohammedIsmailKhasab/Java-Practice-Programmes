package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Filter Employees Based On Salary
//Scenario:A Company wants to find all employees earning more than Rs.50,000 per month.
//Input-List<Integer> salaries - Arrays.asList(45000,35000,55000,70000,50000)
public class FilterSalary
{
    public static void main(String[] args)
    {
        List<Integer> salaries = Arrays.asList(45000,35000,55000,70000,50000);
        List<Integer> result = salaries.stream()
                                        .filter(salary -> salary >50000)
                                        .collect(Collectors.toList());
        System.out.println(result);
    }
}