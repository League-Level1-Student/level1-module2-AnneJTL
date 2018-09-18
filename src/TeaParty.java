
public class TeaParty {
	
	/*
	 * You are hosting a formal Tea Party. 
	 * Your task is to welcome your guests properly. Here are the rules for welcoming guests:

          If the guest has been knighted by the Queen and is male, use the title "Sir" before their name to greet them,
          otherwise if the guest is a male, use the title "Mr." before their name.
          If the guest has been knighted by the Queen and is female, use the title "Lady" before their name to greet them, 
          otherwise if the guest is a female, use the title "Ms." before their name.
	 * 
	 */
	
    public String welcome(String name, boolean isWoman, boolean isKnighted)
    {
    	String title = "Hello ";
    	
    	if (isKnighted){
    		if (isWoman){
    			title += "Lady ";
    		} else {
    			title += "Sir ";
    		}
    	} else {
    		if (isWoman){
    			title += "Ms. ";
    		} else {
    			title += "Mr. ";
    		}
    	}
    	return title + name;
    }

}
