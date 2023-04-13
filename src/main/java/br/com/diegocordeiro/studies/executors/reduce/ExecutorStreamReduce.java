package br.com.diegocordeiro.studies.executors.reduce;

import br.com.diegocordeiro.studies.executors.Executor;
import br.com.diegocordeiro.studies.models.CollectionType;
import br.com.diegocordeiro.studies.models.User;

public class ExecutorStreamReduce extends Executor {

    private static final Integer ZERO_AGE = 0;

    @Override
    public boolean execute() {

        System.out.printf("\nExecuting example of Stream API with Reduce Function in  %s \n\n", CollectionType.LIST.getName());

        Integer totalAge = User.mountMockList().stream()
                .map(User::getAge)
                .reduce(Integer::sum)
                .orElse(ZERO_AGE);

        System.out.printf("Total Age is: %d \n", totalAge);

        return nextExecutor.execute();
    }
}
