package university;
class University {
    protected String uniName;
    protected int ranking;
    public University(String uniName, int ranking) {
        this.uniName = uniName;
        this.ranking = ranking;
    }
    public void showRanking() {
        System.out.println("University Ranking: " + ranking);
    }
}