package br.com.diegocordeiro.studies.executors.filter;

import br.com.diegocordeiro.studies.executors.Executor;
import br.com.diegocordeiro.studies.models.CollectionType;
import br.com.diegocordeiro.studies.models.User;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ExecutorStreamFilter extends Executor {

    private static final Integer MAX_AGE = 18;
    @Override
    public boolean execute() {

        System.out.printf("\nExecuting example of Stream API with Filter Function in %s \n\n", CollectionType.LIST.getName());

        Consumer<User> printFullName = System.out::println;
        Predicate<User> isNewer  = user -> user.getAge() <= MAX_AGE;

        List<User> fullNameList = User.mountMockList().stream()
                .filter(isNewer)
                .collect(Collectors.toList());

        fullNameList.forEach(printFullName);

        return nextExecutor.execute();
    }
}
