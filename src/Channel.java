import java.util.ArrayList;

public class Channel implements Subject {

	public ArrayList<Observer> subscribers = new ArrayList<>();
	public String channelName = "";
	public String status = "";
	
	public Channel(String channelName, String status) {
		this.channelName = channelName;
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
		notifySubscribers();
	}
	
	public String getChannelName() {
		return channelName;
	}
	
	public void setChannelName(String channelName) {
		this.channelName = channelName;
		
	}
	
	@Override
	public void registerSubscriber(Observer observer) {
		subscribers.add(observer);
		
	}

	@Override
	public void removeSubscriber(Observer observer) {
		subscribers.remove(observer);
		
	}

	@Override
	public void notifySubscribers() {
		for (Observer o : subscribers) {
			o.update(status);
		}
		
	}
	
}
