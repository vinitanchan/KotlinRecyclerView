package kotlinrecyclerview.demo.com.kotlinrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val listOfEmployees: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addEmployees()
        rvList.layoutManager = LinearLayoutManager(this)
        rvList.adapter = MyAdapter(listOfEmployees, this)
    }

    fun addEmployees() {
        listOfEmployees.add("James")
        listOfEmployees.add("John")
        listOfEmployees.add("Jonas")
        listOfEmployees.add("Jenna")
        listOfEmployees.add("Jennifer")
        listOfEmployees.add("Jordan")
        listOfEmployees.add("Jack")
        listOfEmployees.add("Jason")
        listOfEmployees.add("Alice")
        listOfEmployees.add("Ashish")
        listOfEmployees.add("Aditya")
        listOfEmployees.add("Amit")
        listOfEmployees.add("Amrit")
        listOfEmployees.add("Aakash")
        listOfEmployees.add("Amrish")
        listOfEmployees.add("Arpit")
        listOfEmployees.add("Rajesh")
        listOfEmployees.add("Kamlesh")
        listOfEmployees.add("Vimlesh")
        listOfEmployees.add("Hemant")
        listOfEmployees.add("Raju")
        listOfEmployees.add("Rajesh")
        listOfEmployees.add("Dracula")
    }
}
