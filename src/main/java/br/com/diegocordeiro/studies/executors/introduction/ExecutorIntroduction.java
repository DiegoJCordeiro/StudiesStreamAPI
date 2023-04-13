package br.com.diegocordeiro.studies.executors.introduction;

import br.com.diegocordeiro.studies.executors.Executor;

import java.util.Arrays;
import java.util.List;

public class ExecutorIntroduction extends Executor {
    @Override
    public boolean execute() {

        System.out.print("\nIntroduction - Executing example of Stream API \n\n");

        List<String> names = Arrays.asList("Diego", "Mayra", "Davi Lucca");

        names.stream().forEach(System.out::println);

        return nextExecutor.execute();
    }
}
