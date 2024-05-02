package guerrero.erick.retrofit

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import guerrero.erick.retrofit.api.ZeldaItem


/**
 * A simple [Fragment] subclass.
 * Use the [ListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ListFragment : Fragment() {
    lateinit var recyclerZelda:RecyclerView
    lateinit var listaElementos:MutableList<ZeldaItem>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        listaElementos = mutableListOf()
        val vistaFragment = inflater.inflate(R.layout.fragment_list, container, false)
        recyclerZelda = vistaFragment.findViewById(R.id.rvZelda)
        val adapter = ZeldaAdapter(listaElementos)
        recyclerZelda.adapter = adapter
        recyclerZelda.layoutManager = LinearLayoutManager(container!!.context)
        return vistaFragment
    }


}