public class Program {
    public static void main(String[] args) {

        DeveloperFactory developerFactory = createDeveloperBuSpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBuSpeciality(String speciality){
        if(speciality.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        }else if(speciality.equalsIgnoreCase("cpp")){
            return new CppDeveloperFactory();
        }else{
            throw new RuntimeException(speciality + "is unknown");
        }
    }
}
