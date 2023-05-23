
package com.example.fibonacci

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fibonacci_assignment.R

class MainActivity : AppCompatActivity() {
    lateinit var rvNames:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

//    override fun OnResume(){
//        super.onResume()
//        rvNames=findViewById(R.id.rvNames)
//
//        var numbers= listOf(1)
//
//        val namesAdapter=NamesRvAdapter(names)
//        rvNames.layoutManager=linearLayoutManager(this)
//        tvNames.adapter=namesAdapter
//    }
//}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).
        inflate(R.layout.item_fibonacci_number, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val number = numbers[position]
        holder.numberTextView.text = number.toString()
    }

    override fun getItemCount(): Int {
        return numbers.size
    }
}