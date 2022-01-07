package examplefuncsplayercopy;

import battlecode.common.*;

public class LaboratoryStrategy {
    public static void runLaboratory(RobotController rc) throws GameActionException {
        if (rc.getTeamLeadAmount(rc.getTeam()) > 50 && rc.canTransmute()) {
            rc.transmute();
        }
    }
}
