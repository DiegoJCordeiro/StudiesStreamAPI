package br.com.diegocordeiro.studies.executors.map;

import br.com.diegocordeiro.studies.executors.Executor;
import br.com.diegocordeiro.studies.models.CollectionType;
import br.com.diegocordeiro.studies.models.User;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExecutorStreamMap extends Executor {

    @Override
    public boolean execute() {

        System.out.printf("\nExecuting example of Stream API with Map Function in %s \n\n", CollectionType.LIST.getName());

        Consumer<String> printFullName = System.out::println;

        List<String> fullNameList = User.mountMockList().stream()
                .map(User::getFullName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        fullNameList.forEach(printFullName);

        return nextExecutor.execute();
    }
}
