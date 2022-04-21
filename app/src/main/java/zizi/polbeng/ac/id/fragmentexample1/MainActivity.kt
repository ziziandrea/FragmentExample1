package zizi.polbeng.ac.id.fragmentexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var fragmentBookDescription: BookDescription
    lateinit var fragmentBookTitle: BookTitle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentBookTitle = BookTitle()
        fragmentBookDescription = BookDescription()
        val fragTransactiion = supportFragmentManager.beginTransaction()
        fragTransactiion.add(R.id.fragtop, fragmentBookTitle)
        fragTransactiion.add(R.id.fragbottom, fragmentBookDescription)
        fragTransactiion.commit()
    }

    fun onBookChanged(index:Int) {
        fragmentBookDescription.changeDescription(index)
    }
}