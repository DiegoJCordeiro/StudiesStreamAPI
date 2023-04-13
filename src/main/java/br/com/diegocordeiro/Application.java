package br.com.diegocordeiro;

import br.com.diegocordeiro.studies.executors.Executor;
import br.com.diegocordeiro.studies.executors.compare.ExecutorStreamCompare;
import br.com.diegocordeiro.studies.executors.filter.ExecutorStreamFilter;
import br.com.diegocordeiro.studies.executors.introduction.ExecutorIntroduction;
import br.com.diegocordeiro.studies.executors.map.ExecutorStreamMap;
import br.com.diegocordeiro.studies.executors.match.ExecutorStreamMatch;
import br.com.diegocordeiro.studies.executors.reduce.ExecutorStreamReduce;

public class Application
{
    public static void main( String[] args )
    {
        Executor introduction = new ExecutorIntroduction();
        Executor streamMap = new ExecutorStreamMap();
        Executor streamReduce = new ExecutorStreamReduce();
        Executor streamFilter = new ExecutorStreamFilter();
        Executor streamMatch = new ExecutorStreamMatch();
        Executor streamCompare = new ExecutorStreamCompare();

        introduction.next(streamMap);
        streamMap.next(streamReduce);
        streamReduce.next(streamFilter);
        streamFilter.next(streamMatch);
        streamMatch.next(streamCompare);

        introduction.execute();
    }
}
