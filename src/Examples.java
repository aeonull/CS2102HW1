public class Examples {

    SoccerTeam soccerTeamCheck = new SoccerTeam("WPI", "maroon", false, 4, 6);
    LegoRobotTeam robotsTeamCheck = new LegoRobotTeam("WPI","goat cheese", 7);
    SoccerResult soccerResultCheck = new SoccerResult(soccerTeamCheck,
            soccerTeamCheck, 10.5,15.2);
    LegoRobotResult robotsResultCheck = new LegoRobotResult(robotsTeamCheck,
            robotsTeamCheck, 3.1, 5, true, 3.2, 2, false);
    Match soccerMatchCheck = new Match(soccerTeamCheck, soccerTeamCheck, soccerResultCheck);
    Match robotsMatchCheck = new Match(robotsTeamCheck, robotsTeamCheck, robotsResultCheck);

}
