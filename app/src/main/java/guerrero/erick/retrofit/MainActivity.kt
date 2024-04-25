package guerrero.erick.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import guerrero.erick.retrofit.api.ApiRepository
import guerrero.erick.retrofit.api.ZeldaApi
import guerrero.erick.retrofit.api.ZeldaItem
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {
    lateinit var miRecycler:RecyclerView
    lateinit var adapter:ZeldaAdapter
    lateinit var elementosZelda:MutableList<ZeldaItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        elementosZelda = mutableListOf()

        miRecycler = findViewById(R.id.rvZelda)
        adapter = ZeldaAdapter(elementosZelda)

        miRecycler.adapter = adapter
        miRecycler.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)


        lifecycleScope.launch {
            try {
                val response = ApiRepository().fetchContents()
                Log.d("API","recibido: $response")
                elementosZelda.addAll(response)
                adapter.notifyDataSetChanged()
            }catch (ex:Exception){
                Log.e("ERROR API", "${ex.message}")
            }

        }

    }
}