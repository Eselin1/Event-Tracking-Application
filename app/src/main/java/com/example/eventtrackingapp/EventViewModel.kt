import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class EventViewModel(application: Application) : AndroidViewModel(application) {
    private val dao = EventDatabase.getDatabase(application).eventDao()
    val allEvents: LiveData<List<EventEntity>> = dao.getAllEvents()

    fun insert(event: EventEntity) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.insertEvent(event)
        }
    }

    fun delete(event: EventEntity) {
        viewModelScope.launch(Dispatchers.IO) {
            dao.deleteEvent(event)
        }
    }
}
