package presentation.resources

import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
//import androidx.compose.ui.res.dimensionResource

internal val shapes = Shapes(
)

@Composable
fun defaultElevation(): CardElevation =
    CardDefaults.elevatedCardElevation(
//        defaultElevation = dimensionResource(id = R.dimen.padding_xsmall),
//        pressedElevation = dimensionResource(id = R.dimen.padding_xsmall),
//        focusedElevation = dimensionResource(id = R.dimen.padding_xsmall),
//        hoveredElevation = dimensionResource(id = R.dimen.padding_xsmall),
//        draggedElevation = dimensionResource(id = R.dimen.padding_xsmall)
    )