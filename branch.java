 class branch extends college {
    static String bname = "Xavier's College b";
    static float bid = 52564;
    static int btotalstaff = 2345;


    public branch (String cname, String cbranch, String cstudents, String bname, float bid, int btotalstaff) {
        super(cname,cbranch,cstudents);
        this.bname = bname;
        this.bid = bid;
        this.btotalstaff = btotalstaff;
    }

    void display(){
        System.out.println("branch details: " + bname + bid + btotalstaff );
    }

    
}
