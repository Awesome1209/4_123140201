# Tugas 4 - Profile App MVVM
---
**Nama:** Awi Septian Prasetyo
**NIM:** 123140201  
**Mata Kuliah:** Pengembangan Aplikasi Mobile  
**Program Studi:** Teknik Informatika  

---
## Deskripsi Proyek
Project ini merupakan pengembangan dari tugas sebelumnya berupa **Profile App**, yang pada Tugas 4 diperbarui dengan menerapkan konsep **State Management** dan **MVVM (Model - View - ViewModel)** menggunakan **Compose Multiplatform**.

Aplikasi ini menampilkan profil pengguna dengan tampilan modern dan responsif, serta menyediakan fitur:
- menampilkan data profil
- mengedit nama dan bio
- mengaktifkan atau menonaktifkan dark mode
- mengelola UI state secara reaktif menggunakan `StateFlow`
---
## Video & Screenshot

Tambahkan screenshot hasil aplikasi di bawah ini:

### Video
https://drive.google.com/drive/folders/1_LfpLpUr39LGJHy_cD_H-1eySeB6txRK?usp=sharing

### 1. Profile View Light Mode
<img width="720" height="1600" alt="4-1" src="https://github.com/user-attachments/assets/f23d839e-cf64-4a81-9268-b72a8948f4a9" />)

### 2. Edit Profile Light Mode
<img width="720" height="1600" alt="4-2" src="https://github.com/user-attachments/assets/247b8b52-a45a-48ed-a149-d32dd92d351f" />


### 3. Profile View Dark Mode
<img width="720" height="1600" alt="4-3" src="https://github.com/user-attachments/assets/03c38f8f-0676-474f-82a6-686b933d5336" />


### 4. Edit Profile Dark Mode
<img width="720" height="1600" alt="4-4" src="https://github.com/user-attachments/assets/630f63ae-bd4b-4dd2-995d-33099febcef7" />

---
## Tujuan Tugas
Tugas ini dibuat untuk memenuhi requirement praktikum minggu 4, yaitu:
1. Mengimplementasikan **MVVM Pattern**
2. Membuat **ProfileViewModel** dengan **StateFlow**
3. Menggunakan **ProfileUiState**
4. Menerapkan **State Hoisting** pada komponen input
5. Menambahkan fitur **Edit Profile**
6. Menambahkan fitur **Dark Mode Toggle**
7. Menyusun struktur project yang rapi: `ui/`, `viewmodel/`, dan `data/`

## Fitur Utama
### 1. Profile View
Menampilkan data profil pengguna berupa:
- foto profil
- nama
- email
- bio

### 2. Edit Profile
Pengguna dapat:
- mengubah nama
- mengubah bio
- menyimpan perubahan
- membatalkan proses edit

### 3. Dark Mode
Pengguna dapat mengganti tema aplikasi antara:
- Light Mode
- Dark Mode

### 4. Responsive UI
Tampilan aplikasi dibuat responsif:
- pada layar kecil (HP), komponen ditampilkan secara vertikal
- pada layar lebar, layout dibagi menjadi dua kolom
---
## Penerapan Konsep Materi
### State Management
Aplikasi ini menggunakan pendekatan reactive UI, di mana perubahan state akan langsung memengaruhi tampilan UI.

### MVVM
Struktur aplikasi dibagi menjadi:
- **Model / Data** → menyimpan data profil
- **ViewModel** → mengelola UI state dan event
- **View** → composable untuk menampilkan UI

### StateFlow
`ProfileViewModel` menggunakan `MutableStateFlow` untuk menyimpan state, lalu diekspos sebagai `StateFlow` agar dapat diamati oleh UI.

### State Hoisting
Komponen input dibuat stateless, di mana nilai state dan callback perubahan dikirim dari parent composable.

## Struktur Folder
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
````

## Penjelasan Komponen

### `ProfileViewModel`

Berfungsi untuk:

* menyimpan state aplikasi
* mengelola event edit profile
* menyimpan dark mode state
* mengontrol mode edit

### `ProfileUiState`

Berisi state yang digunakan UI, seperti:

* data profil
* status edit
* nilai input edit
* status dark mode
* pesan status

### `ProfileScreen`

Screen utama yang:

* mengambil state dari `ProfileViewModel`
* menampilkan layout responsif
* meneruskan event ke ViewModel

### `ProfileHeaderCard`

Menampilkan foto profil, nama, email, dan bio.

### `EditBannerCard`

Card aksi utama untuk memulai proses edit profile.

### `ProfileSettingsCard`

Menampilkan informasi profil dan toggle dark mode.

### `ProfileEditorCard`

Form edit profil yang digunakan untuk mengubah nama dan bio.

## Teknologi yang Digunakan

* **Kotlin**
* **Compose Multiplatform**
* **Material 3**
* **MVVM Architecture**
* **StateFlow**
* **Jetpack / Lifecycle ViewModel**

## Cara Menjalankan Project

1. Buka project di **Android Studio**
2. Tunggu hingga Gradle selesai sync
3. Pilih target device / emulator
4. Jalankan project

## Kelebihan Implementasi

* UI lebih rapi dan modern
* struktur kode lebih terorganisir
* mudah dikembangkan
* state lebih aman dan terpusat
* mendukung tampilan responsif
* dark mode sudah terintegrasi dalam UI state

## Kendala Selama Pengerjaan

Beberapa kendala yang ditemui selama proses pengerjaan:

* penyesuaian resource gambar untuk Compose Multiplatform
* penyesuaian layout responsif tanpa `Modifier.weight(...)`
* sinkronisasi dark mode dengan UI state
* penyesuaian tampilan agar sesuai referensi UI namun tetap memenuhi requirement tugas

## Kesimpulan

Melalui tugas ini, saya mempelajari bagaimana menerapkan:

* state management dalam Compose
* recomposition
* state hoisting
* MVVM dengan ViewModel
* StateFlow untuk UI state
* penyusunan UI yang lebih reusable, maintainable, dan responsif

Project ini menunjukkan bahwa penggunaan **State + ViewModel** dapat menghasilkan aplikasi dengan alur data yang lebih jelas, UI yang reaktif, serta struktur kode yang lebih baik.
