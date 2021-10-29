import java.util.function.IntConsumer;

public class Match implements IContestant, IResult{

    IContestant contestant1;
    IContestant contestant2;
    IResult results;

    public Match(IContestant contestant1, IContestant contestant2, IResult results){

        this.contestant1 = contestant1;
        this.contestant2 = contestant2;
        this.results = results;

    }

    public IContestant winner(){
        return results.getWinner();
    }
}
