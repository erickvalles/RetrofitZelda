package guerrero.erick.retrofit

import android.content.Context
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ZeldaHolder(item: View, context:Context):RecyclerView.ViewHolder(item) {
    var context:Context

    var tvTitulo = item.findViewById<TextView>(R.id.tvTitulo)
    val ivFondo = item.findViewById<ImageView>(R.id.ivFondo)
    val tvTipo = item.findViewById<TextView>(R.id.tvTipo)



    init {
        this.context = context

    }

}