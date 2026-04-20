package org.example.project

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import org.example.project.ui.screens.ProfileScreenContent
import org.example.project.ui.theme.ProfileAppTheme
import org.example.project.viewmodel.ProfileViewModel

@Composable
fun App() {
    val profileViewModel: ProfileViewModel = viewModel { ProfileViewModel() }
    val uiState by profileViewModel.uiState.collectAsState()

    ProfileAppTheme(darkTheme = uiState.isDarkMode) {
        ProfileScreenContent(
            uiState = uiState,
            onEditClick = profileViewModel::startEditing,
            onNameChange = profileViewModel::onEditNameChange,
            onBioChange = profileViewModel::onEditBioChange,
            onSaveClick = profileViewModel::saveProfile,
            onCancelClick = profileViewModel::cancelEditing,
            onDarkModeToggle = profileViewModel::setDarkMode
        )
    }
}
