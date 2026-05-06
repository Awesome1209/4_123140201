# Tugas 4 - Profile App MVVM 📱

Repositori ini berisi pengembangan aplikasi profil menggunakan **Compose Multiplatform** dengan penerapan arsitektur **MVVM (Model-View-ViewModel)** dan **State Management** yang reaktif.

---

## 👤 Identitas Mahasiswa
| Data | Keterangan |
| :--- | :--- |
| **Nama** | Awi Septian Prasetyo |
| **NIM** | 123140201 |
| **Mata Kuliah** | Pengembangan Aplikasi Mobile |
| **Program Studi** | Teknik Informatika |

---

## 📝 Deskripsi Proyek
Project ini merupakan pembaruan dari tugas sebelumnya (**Profile App**). Pada Tugas 4, fokus utama adalah implementasi **State Management** dan pola arsitektur **MVVM** menggunakan **Compose Multiplatform**. 

Aplikasi ini menampilkan profil pengguna dengan tampilan modern dan responsif, serta menyediakan fitur:
*   ✅ Menampilkan data profil secara dinamis.
*   ✅ Fitur edit nama dan bio.
*   ✅ Switch tema (Light/Dark Mode).
*   ✅ Manajemen UI state secara reaktif menggunakan `StateFlow`.

---

## 📸 Video & Screenshot

### 🎥 Demo Video
[Klik di sini untuk melihat video demonstrasi](https://drive.google.com/drive/folders/1_LfpLpUr39LGJHy_cD_H-1eySeB6txRK?usp=sharing)

### 🖼️ Screenshot Aplikasi
| Profile View (Light) | Edit Profile (Light) |
| :---: | :---: |
| <img width="720" height="1600" alt="4-1" src="https://github.com/user-attachments/assets/f23d839e-cf64-4a81-9268-b72a8948f4a9" /> |

| Profile View (Dark) | Edit Profile (Dark) |
| :---: | :---: |
| <img src="[https://github.com/user-attachments/assets/03c38f8f-0676-474f-82a6-686b933d5336](https://github.com/user-attachments/assets/03c38f8f-0676-474f-82a6-686b933d5336)" width="300" /> | <img src="[https://github.com/user-attachments/assets/630f63ae-bd4b-4dd2-995d-33099febcef7](https://github.com/user-attachments/assets/630f63ae-bd4b-4dd2-995d-33099febcef7)" width="300" /> |

---

## 🎯 Tujuan Tugas
Tugas ini dibuat untuk memenuhi requirement praktikum minggu 4, yaitu:
1.  Mengimplementasikan **MVVM Pattern**.
2.  Membuat **ProfileViewModel** dengan **StateFlow**.
3.  Menggunakan **ProfileUiState** untuk manajemen keadaan UI.
4.  Menerapkan **State Hoisting** pada komponen input.
5.  Menambahkan fitur **Edit Profile**.
6.  Menambahkan fitur **Dark Mode Toggle**.
7.  Menyusun struktur project yang rapi (`ui/`, `viewmodel/`, dan `data/`).

---

## ✨ Fitur Utama

1.  **Profile View**: Menampilkan foto profil, nama, email, dan bio.
2.  **Edit Profile**: Pengguna dapat mengubah nama & bio, serta menyimpan atau membatalkan perubahan.
3.  **Dark Mode**: Mendukung penggantian tema aplikasi secara instan.
4.  **Responsive UI**: Layout adaptif; satu kolom pada layar kecil (HP) dan dua kolom pada layar lebar.

---

## 🛠️ Penerapan Konsep Materi

### 🔹 State Management
Menggunakan pendekatan *reactive UI*, di mana perubahan *state* secara otomatis memicu pembaruan tampilan.

### 🔹 MVVM Architecture
*   **Model / Data**: Representasi data profil.
*   **ViewModel**: Pengelola UI state dan logika bisnis/event.
*   **View**: Composable function yang mengamati state dari ViewModel.

### 🔹 StateFlow & State Hoisting
*   **StateFlow**: Digunakan dalam `ProfileViewModel` untuk mengekspos data state yang *observable*.
*   **State Hoisting**: Memisahkan state dari komponen input (stateless) ke parent agar lebih terkendali.

---

## 📁 Struktur Folder
```text
composeApp/src/commonMain/kotlin/org/example/project/
├── data/
│   └── Profile.kt
├── viewmodel/
│   ├── ProfileUiState.kt
│   └── ProfileViewModel.kt
├── ui/
│   ├── components/
│   │   ├── ProfileTopBar.kt
│   │   ├── ProfileHeaderCard.kt
│   │   ├── EditBannerCard.kt
│   │   ├── ProfileSettingsCard.kt
│   │   ├── ProfileEditorCard.kt
│   │   └── LabeledTextField.kt
│   ├── screens/
│   │   └── ProfileScreen.kt
│   └── theme/
│       └── AppTheme.kt
```

---

## 🧩 Penjelasan Komponen

*   **`ProfileViewModel`**: Pusat kendali state, event edit, dan dark mode.
*   **`ProfileUiState`**: Data class yang menampung semua variabel state (data profil, status edit, dll).
*   **`ProfileScreen`**: Komposisi utama yang mengatur layout responsif.
*   **`ProfileHeaderCard`**: Komponen visual untuk identitas utama pengguna.
*   **`EditBannerCard`**: Tombol aksi untuk masuk ke mode edit.
*   **`ProfileSettingsCard`**: Area informasi detail dan toggle tema.
*   **`ProfileEditorCard`**: Form input untuk pengeditan data.

---

## 🚀 Teknologi yang Digunakan
*   **Kotlin**
*   **Compose Multiplatform**
*   **Material 3**
*   **MVVM Architecture**
*   **StateFlow**
*   **Jetpack / Lifecycle ViewModel**

---

## 💻 Cara Menjalankan Project
1.  Buka project menggunakan **Android Studio**.
2.  Tunggu hingga proses **Gradle Sync** selesai.
3.  Pilih target device (Android Emulator atau Desktop).
4.  Klik **Run**.

---

## 📈 Kelebihan & Kendala

### Kelebihan
*   Struktur kode terorganisir dan mudah dikembangkan (*maintainable*).
*   State lebih aman karena terpusat di ViewModel.
*   Mendukung tampilan responsif dan integrasi Dark Mode yang mulus.

### Kendala
*   Sinkronisasi resource gambar dan tema pada Compose Multiplatform.
*   Penyesuaian layout responsif tanpa menggunakan `Modifier.weight(...)`.
*   Menjaga tampilan tetap sesuai referensi sambil memenuhi kriteria tugas.

---

## 💡 Kesimpulan
Project ini berhasil mendemonstrasikan efektivitas penggunaan **State + ViewModel** dalam menghasilkan aplikasi dengan alur data yang jelas, UI yang reaktif, dan arsitektur yang kuat pada ekosistem Compose Multiplatform.
