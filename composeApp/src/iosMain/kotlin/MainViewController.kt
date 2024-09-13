import androidx.compose.ui.window.ComposeUIViewController
import data.local.db.getDataBaseBuilder
import data.local.db.getRoomDatabase
import di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin(
            todoDatabase = getRoomDatabase(getDataBaseBuilder()),
        )
    }
) { App() }