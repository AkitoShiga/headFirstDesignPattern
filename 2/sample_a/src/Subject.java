public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    // Subjectの状態が変更されたときに、Observerに通知する
    public void notifyObserver();
}