package br.com.diegocordeiro.studies.executors;

public abstract class Executor {
    protected Executor nextExecutor;
    public abstract boolean execute();
    public boolean next(Executor nextExecutor) {

        this.nextExecutor = nextExecutor;

        return Boolean.TRUE;
    }
}
