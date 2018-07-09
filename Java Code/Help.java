import net.dv8tion.jda.core.entities.Message;

public class    Help {

    public static void run(Message msg) {

        msg.getChannel().sendMessage("############################################################\nCommands:  (!command) <space> (user) \n############################################################\n\nCommand: !missedBattle <user>           -> Tells the bot that <user> missed a battle\nCommand: !missedWar <user>             -> Tells the bot that <user> missed a war\nCommand: !noDonations <user>          -> Adds <user> to the list of Non Donators\n\n-----------------------------------------------------------------------------------------------------------\n\nCommand: !deleteBattles <user>           -> Deletes the record of missed battles by <user>\nCommand: !deleteWars <user>             -> Deletes the record of missed wars by <user>\nCommand: !deleteDonations <user>    -> Removes <user> from the list of Non Donators\n\n-----------------------------------------------------------------------------------------------------------\n\nCommand: !get <user>                           -> Gets the number of battles and wars missed by <user>\nCommand: !getNonDonators                -> Prints all the Non Donators\nCommand: !getUsersWar                      -> Prints all the users that haven't been doing the Wars\nCommand: !getUsersBattle                    -> Prints all the users that haven't been doing the Battles\n\n-----------------------------------------------------------------------------------------------------------\n\nCommand: !stream                                  -> Link to the Phonecats stream!\nCommand: !dev                                        -> Info on the developer and github repo!\n\n############################################################").queue();
    }
}