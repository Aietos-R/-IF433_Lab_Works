package oop_130565_RafaelLesmana.week02.loan

class Loan (
    val bookTitle: String,
    val borrowerName: String,
    val loanduration: Int = 1,
) {
    fun calculateFine(): Int {
        if(loanduration > 3){
            return (loanduration - 3) * 2000
        }
        return 0
    }
}
