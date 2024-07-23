package guerrero.erick.retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import guerrero.erick.retrofit.api.ZeldaItem

class ZeldaAdapter(val lista:MutableList<ZeldaItem>, fragment:ListFragment):RecyclerView.Adapter<ZeldaHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZeldaHolder {
        val vista = LayoutInflater.from(parent.context).inflate(
            R.layout.elemento_ind,
            parent,
            false
        )
        return ZeldaHolder(vista,parent.context)
    }

    override fun onBindViewHolder(holder: ZeldaHolder, position: Int) {
        holder.tvTitulo.text = lista[position].name
        holder.tvTipo.text = lista[position].category
        holder.ivFondo.setOnClickListener {
            
        }

        Glide.with(holder.context).load(lista[position].image).into(holder.ivFondo)

    }

    override fun getItemCount(): Int {
        return lista.size
    }


}