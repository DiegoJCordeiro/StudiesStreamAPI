package br.com.diegocordeiro.studies.executors.compare;

import br.com.diegocordeiro.studies.executors.Executor;
import br.com.diegocordeiro.studies.models.CollectionType;
import br.com.diegocordeiro.studies.models.User;

import java.util.Comparator;
import java.util.Optional;

public class ExecutorStreamCompare extends Executor {
    @Override
    public boolean execute() {

        System.out.printf("\nExecuting example of Stream API with Min and Max Function in %s \n\n", CollectionType.LIST.getName());

        Comparator<User> ageComparator = (userOne, userTwo) -> {
            if(userOne.getAge() > userTwo.getAge()) return 1;
            if(userOne.getAge() < userTwo.getAge()) return -1;
            return 0;
        };

        Optional<User> newerUser = User.mountMockList().stream().min(ageComparator);
        Optional<User> olderUser = User.mountMockList().stream().max(ageComparator);

        newerUser.ifPresent(System.out::println);
        olderUser.ifPresent(System.out::println);

        return Boolean.TRUE;
    }
}
