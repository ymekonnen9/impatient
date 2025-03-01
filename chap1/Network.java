import java.util.ArrayList;

public class Network {

  private ArrayList<Member> members = new ArrayList<>();

  public class Member{
    
    private String name = "";
    private ArrayList<String> friends;

    public Member(String name){
      this.name = name;
      friends = new ArrayList<>();
    }

    public void deactivate(Member this){
      unenroll(this);
    }

  }

  public Member enroll(String name){
    Member mem = new Member(name);
    members.add(mem);
    return mem;
  }

  public void unenroll(Member mem){
    members.remove(mem);
  }

  public static void main(String[] args) {
    Network facebook = new Network();
    Member fred = facebook.new Member("fred");
    facebook.enroll("another fred");
    fred.deactivate();
  }
}
