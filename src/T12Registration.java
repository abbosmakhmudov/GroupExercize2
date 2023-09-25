public class T12Registration {
    /*
    Create Registration Class in which you would have variables as
email, userName and password that have an access scope only
within its own class. After creating an object of the class user should
be able to call methods and in each method separately pass values
to set users email, username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid password cannot contain
userName
     */
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email){
        if(isValidEmail(email)) {
            this.email = email;
            System.out.println("Your email is Valid: "+email);
        }else{
            System.out.println("Invalid email");
        }
    }
    public void setUserName(String userName){
        if(isValidUserName(userName)){
            this.userName=userName;
            System.out.println("Your username is Valid: "+userName);
        }else{
            System.out.println("Invalid Username");
        }
    }
    public void setPassword(String password){
        if(isValidPassword(password)){
            this.password=password;
            System.out.println("Your password is Valid: "+password);
        }else{
            System.out.println("invalid password");
        }
    }
    private boolean isValidEmail(String email){
        return email.contains("yahoo");
    }
    private boolean isValidUserName(String userName){
        return !userName.isEmpty() && userName.length() > 6;
    }
    private boolean isValidPassword(String password){
        return !password.isEmpty()&&password.length()>6&&!password.contains(userName);
    }

    public static void main(String[] args) {
     T12Registration t1=new T12Registration();
     t1.setEmail("abbosmakhmudov@yahoo.com");
     t1.setUserName("abbosmakhmudov");
     t1.setPassword("abcd1234");
    }
}
