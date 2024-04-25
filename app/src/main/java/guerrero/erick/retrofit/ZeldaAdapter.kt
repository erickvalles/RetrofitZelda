package guerrero.erick.retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import guerrero.erick.retrofit.api.ZeldaItem

class ZeldaAdapter(val lista:List<ZeldaItem>):RecyclerView.Adapter<ZeldaHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZeldaHolder {
        val vista = LayoutInflater.from(parent.context).inflate(
            R.layout.elemento_ind,
            parent,
            false
        )
        return ZeldaHolder(vista)
    }

    override fun onBindViewHolder(holder: ZeldaHolder, position: Int) {
        holder.tvTitulo.text = lista[position].name
        holder.tvTipo.text = lista[position].category

    }

    override fun getItemCount(): Int {
        return lista.size
    }


}