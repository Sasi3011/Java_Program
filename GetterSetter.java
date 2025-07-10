public class GetterSetter {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name!=null &&  !name.trim().isEmpty()){
            this.name = name;
        } else {
            System.out.println("Invalid name");
        }
    }

    public GetterSetter(String name) {
        this.name=name;
        System.out.println("Name: " + getName());
    }

    public static void main(String[] args)
    {
        GetterSetter obj=new GetterSetter("Sasi");
        System.out.println("Retrieved name: " + obj.getName());
    }
}