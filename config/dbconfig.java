package config;
interface databaseconfig{
    String dburl="c:lasya";
    String username="lassi";
    
    default void details(){
        System.out.println(dburl+username);
    }
    private String getpassword(){
        return "umeshlasya";
    }
    default String password(){
        return getpassword();
    }
}
public class dbconfig implements databaseconfig{
    private String password;
    dbconfig(){
        this.password=password();
    }//this is mandatory

    public String getpassword(){
        return password;
    }
    public void setpassword(String password){
        this.password=password;
    }
}
