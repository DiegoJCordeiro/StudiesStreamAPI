package br.com.diegocordeiro.studies.executors.match;

import br.com.diegocordeiro.studies.executors.Executor;
import br.com.diegocordeiro.studies.models.CollectionType;
import br.com.diegocordeiro.studies.models.User;

import java.util.function.Predicate;

public class ExecutorStreamMatch extends Executor {
    @Override
    public boolean execute() {

        System.out.printf("\nExecuting example of Stream API with Match Function in %s \n\n", CollectionType.LIST.getName());

        Predicate<User> isAllChild = User::isNewer;
        Predicate<User> hasOlder = User::isAdult;
        Predicate<User> hasElder = User::isElder;

        boolean allChild = User.mountMockList().stream().allMatch(isAllChild);
        boolean hasAdult = User.mountMockList().stream().anyMatch(hasOlder);
        boolean hasElderly = User.mountMockList().stream().noneMatch(hasElder);

        System.out.println("Is it all child ? " + allChild);
        System.out.println("Does have someone adult ? " + hasAdult);
        System.out.println("Doesn't have elder people ? " + hasElderly);

        return nextExecutor.execute();
    }
}
