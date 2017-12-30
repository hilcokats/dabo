package nl.kats.dabo.engine;

/**
 * /dabo/{gameid}/{gamehash}/draw/[deck|discardpile|dilemmapile|hand]/[random|top|bottom]
 * /dabo/{gameid}/{gamehash}/move/{cardid}/[table|discardpile|dilemmapile|outofgame|cardid]/[top/bottom]
 * /dabo/{gameid}/{gamehash}/shuffle/[deck|discardpile|dilemmapile|cardid]
 * /dabo/{gameid}/{gamehash}/attempt/{missionid}/{awayteamid|shipid}
 * /dabo/{gameid}/{gamehash}/endturn
 *
 * gamehash = salt + gameid + playerid + turn
 */
public class Engine {

}