# Tugas 4 - Profile App: State Management & MVVM

## 👨‍💻 Penulis
Nama  : Awi septian Prasetyo
NIM   : 123140201

## 📱 Deskripsi Proyek
Proyek ini adalah tugas praktikum pengembangan **Profile App** yang mengimplementasikan arsitektur **MVVM (Model-View-ViewModel)** menggunakan Jetpack Compose. Tujuan utama proyek ini adalah memisahkan tampilan antarmuka (UI) dari logika pengelolaan data (State) agar *codebase* menjadi lebih terstruktur, *testable*, dan *maintainable*.

## ✨ Fitur Utama
1. **Arsitektur MVVM Terstruktur**
   - Logika dan status aplikasi dikelola sepenuhnya oleh `ProfileViewModel`.
   - Menggunakan `StateFlow` untuk reaktivitas UI yang efisien.
   - Status tampilan dibungkus secara rapi dalam *data class* `ProfileUiState`.

2. **Edit Profile Form (State Hoisting)**
   - Pengguna dapat mengubah Nama dan Bio.
   - Form input menggunakan komponen `LabeledTextField` kustom yang bersifat *stateless* berkat penerapan konsep *State Hoisting*.
   - Pembaruan data ke *ViewModel* hanya terjadi ketika pengguna menekan tombol **Save Changes**.

3. **Dark Mode Toggle**
   - Fitur *switch* untuk mengaktifkan tema gelap (*Dark Mode*).
   - Status tema dikelola melalui *ViewModel* sehingga preferensi tema tetap tersimpan (tidak *reset*) meskipun terjadi perubahan konfigurasi seperti rotasi layar.

## 📁 Struktur Folder (Clean Architecture)
Proyek ini membagi kode ke dalam tiga *layer* utama:
- `data/`
  - `ProfileUiState.kt` : Menyimpan model representasi status UI (*immutable data class*).
- `viewmodel/`
  - `ProfileViewModel.kt` : Mengelola logika aplikasi dan *StateFlow*.
- `ui/`
  - `ProfileScreen.kt` : Layar utama aplikasi yang melakukan *observe* terhadap UI State.
  - `components/LabeledTextField.kt` : Komponen *reusable* untuk input teks.

## 🚀 Cara Menjalankan Aplikasi
1. *Clone* repositori ini ke dalam Android Studio.
2. Pastikan dependensi *ViewModel Compose* sudah ditambahkan pada file `build.gradle.kts` (Module: app):
   ```kotlin
   implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.0")
