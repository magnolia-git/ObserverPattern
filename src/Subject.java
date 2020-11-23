
public interface Subject {
	public void registerSubscriber(Observer observer);
	public void removeSubscriber(Observer observer);
	public void notifySubscribers();
}
