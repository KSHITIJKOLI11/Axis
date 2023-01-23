 class MainCompany {
    var name: String = "Ford";
    fun salaryratio(salary: Float, tds: Float): Float {
        return salary * tds;
    }


    inner class Axis {
        val tax: Float = 0.1f
        override fun salaryratio(salary: Float, tds: Float) {
            return salary * (tds * tax)
        }

        fun salary(totalsalary: Float): Float {
            return this.salaryratio(totalsalary, tax)
        }
    }
}

    fun main() {
        var mainobj = MainCompany();
        mainobj.Axis().salary(50000f);
        mainobj.name;
    }

