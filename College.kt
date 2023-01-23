open class College {
    var colname:String="";
    var colplace:String="";
    var branchobj=branch();
    var studentobj=student();

    fun displaycollege(){
        print ("my college name is $colname")
        print ("$colplace is my college place")
    }

    inner class branch() {
        var brname: String=""
        var brid: Int=""

        fun displaybranch() {
            print("my branch name is $brname")
            print("brainch id is $brid")
        }
    }

    inner class student() {
        var stname: String=""
        var stplace: String=""

            fun displaystudent() {
                print("student name is $stname ")
                print("student place is $stplace")
            }

    }

}

fun main(){
    var obj=college();
    obj.colname="VESIT";
    obj.colplace="Mumbai";
    obj.branchobj.brname="EXTC";
    obj.branchobj.brid="34235";
    obj.studentobj.stname="Kshitij";
    obj.studentobj.dtplace="Mumbai";
    obj.displaycollege()
    obj.displaybranch()
    obj.displaystudent()
}