package day37_Inheritance.ScrumTask;

public class AmazonInc {

    public static void main(String[] args) {
        String company = "Amazon ınc";
        ProductOwner po = new ProductOwner("Suhayb", 29, 'M', 1, 160000, company);

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 2, 150000, company);

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 145000, company);

        Tester tester1 = new Tester("Chiara", 32, 'F', "QA", 145, 125000, company);
        Tester tester2 = new Tester("hasan", 32, 'F', "QA", 146, 125000, company);
        Tester tester3 = new Tester("takil", 42, 'M', "QA", 147, 125000, company);
        Tester tester4 = new Tester("akıl", 29, 'F', "QA", 148, 125000, company);

        Tester[] testers = {tester1,tester2,tester3,tester4};

        Developer developer = new Developer("Daniela",  27, 'F', "Java Developer", 8, 135000, company);

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);
        scrumTeam.addDeveloper(developer);
        scrumTeam.addTesters(testers);
        System.out.println(scrumTeam);

        System.out.println("---------------------------");

        for (Tester tester : scrumTeam.testers) {
            System.out.println();
        }
    }
}
