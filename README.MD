import java.util.ArrayList; // Mengimpor ArrayList, yang digunakan untuk menyimpan daftar tugas.
import java.util.Scanner; // Digunakan untuk mengimpor kelas Scanner.

public class TodoList2A {} //  Mendeklarasikan kelas TodoList2A.
private ArrayList<String> todoList; // Membuat atribut todoList, yang merupakan ArrayList<String>.

// Constructor to initialize the ArrayList
    public TodoList2A() {}
        todoList = new ArrayList<>(); //Mendeklarasi untuk kelas TodoList2A, menginisialisasi variabel todoList dengan objek ArrayList kosong.

// Method to add a task
    public void addTask(String task) {}
        todoList.add(task);
        System.out.println("Task added successfully!"); //Mendeklarasi metode bertipe String, menambahkan task ke dalam ArrayList, menampilkan pesan task berhasil ditambahkan.

// Method to remove a task
    public void removeTask(String task) {}
        if (todoList.remove(task)) {
            System.out.println("Task removed successfully!");
        } else {}
            System.out.println("Task not found."); //Mendeklarasi metode bertipe String, menghapus task jika ditemukan, jika berhasil dihapus menampilkan pesan sukses, jika tidak ditemukan dalam todoList, menampilkamn pesan task tidak ditemukan.

// Method to display all tasks
    public void displayTasks() {}
        if (todoList.isEmpty()) {
            System.out.println("No tasks available.");
        } else {}
            System.out.println("\nTo-Do List:");
            for (int i = 0; i < todoList.size(); i++) {}
                System.out.println((i + 1) + ". " + todoList.get(i)); //Mendeklarasi metode displayTasks, memeriksa todoList kosong, jika kosong menampilkan pesan task tidak tersedia, jika tidak kosong, menampilkan pesan "To-Do List", melakukan perulangan setiap elemen todoList, menampilkan nomor urut task.

// fitur search task by index
    public void searchTaskByIndex(int index) {}
        if (index >= 0 && index < todoList.size()) {
            System.out.println("Task at index " + (index + 1) + ": " + todoList.get(index));
        } else {}
            System.out.println("Invalid index. No task found."); //Mendeklarasi metode yang menerima index bertipe int, memriksa index valid lebih besar atau sama dengan 0 dan lebih kecil dari ukuran todoList, jika index valid menampilkan index yang diminta, jika index tidak valid, menampilkan index tidak valid.

// fitur remove task by index
    public void removeTaskByIndex(int index) {}
        if (index >= 0 && index < todoList.size()) {
            String removedTask = todoList.remove(index);
            System.out.println("Task \"" + removedTask + "\" removed successfully!");
        } else {}
            System.out.println("Invalid index. Task not removed."); //Mendeklarasi metode bertipe int, memriksa index valid atau tidak, menghapus task pada index dan menyimpan task yang dihapus dalam variabel, menampilkan pesan task berhasil dihapus, jika index tidak valid, menampilkan pesan index tidak valid.

public static void main(String[] args) {}
        TodoList2A app = new TodoList2A();
        Scanner scanner = new Scanner(System.in);
        boolean running = true; //Mendeklrasikan metode utama (main), membuat objek app, membuat objek scanner untuk membaca input dari pengguna, mendeklarasikan dan menginisialisasi variabel boolean.

 while (running) {}
            System.out.println("\nTo-Do List Application");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task By Task Name");
            System.out.println("3. Remove Task By Index");
            System.out.println("4. Search Task By index");
            System.out.println("5. Display Tasks");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: "); //Loop berjalan selama running bernilai true, menampilkan pesan.

int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
//Membaca input angka ke variabel.

switch (choice) { //Mengevaluasi nilai dari choice
                case 1:
                    System.out.print("Enter task to add: "); //Meminta untuk memasukkan nilai.
                    String taskToAdd = scanner.nextLine(); //Membaca input dan menyimpan dalam variabel.
                    app.addTask(taskToAdd);
                    break; //Memanggil metode untuk menambahkan, break mengakhiri case 1.

                case 2:
                    System.out.print("Enter task to remove: "); //Meminta untuk memasukkan nama yang ingin dihapus.
                    String taskToRemove = scanner.nextLine(); //Membaca input dan menyimpan dalam variabel.
                    app.removeTask(taskToRemove);
                    break; //Memanggil metode untuk menghapus, break mengakhiri case 2. 

                case 3:
                    System.out.print("Enter index to remove: "); //Meminta untuk memasukkan index yang ingin dihapus.
                    int indexToRemove = scanner.nextInt() - 1; //Membaca indeks yang akan dihapus, mengurangi 1 karena index mulai dari 0
                    app.removeTaskByIndex(indexToRemove);
                    break; //Memanggil metode untuk menghapus index, break mengakhiri case 3.

                case 4:
                    System.out.print("Enter index to search: "); //Meminta untuk memasukkan index yang ingin dicari.
                    int indexToSearch = scanner.nextInt() - 1; //Membaca index yang ingin dicari, mengurangi 1
                    app.searchTaskByIndex(indexToSearch);
                    break; //Memanggil metode untuk mencari index, break mengakhiri case 4.

                case 5:
                    app.displayTasks();
                    break; //Memanggil metode untuk menampilkan semua task, break mengakhiri case 5.

                case 6:
                    running = false; //Mengubah nilai running menjadi false.
                    System.out.println("Exiting the application...");
                    break; //Menampilkan pesan, break mengakhiri case 6.

                default: //Jika choice tidak sesuai dengan pilihan maka akan masuk ke default.
                    System.out.println("Invalid choice. Please try again."); //Mencetak pesan kesalahan jika tidak valid.
            }

        scanner.close(); //Menutup objek scanner.