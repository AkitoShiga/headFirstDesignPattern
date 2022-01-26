public class Light {
  String place;
  public Light(String place){
      this.place = place;
  }
  public void on() {
      System.out.println(place + "の照明が付きました");
  }
  public void off() {
      System.out.println(place + "の照明を消しました");
  }
}
