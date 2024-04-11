package guerrero.erick.retrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import guerrero.erick.retrofit.api.ApiRepository
import guerrero.erick.retrofit.api.ZeldaApi
import kotlinx.coroutines.launch
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lifecycleScope.launch {
            try {
                val response = ApiRepository().fetchContents()
                Log.d("API","recibido: $response")
            }catch (ex:Exception){
                Log.e("ERROR API", "${ex.message}")
            }

        }

    }
}