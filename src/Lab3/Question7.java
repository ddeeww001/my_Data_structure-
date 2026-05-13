package Lab3;

public class Question7<T> {

        // Node ภายในต้องใช้ Type T เช่นกัน
        private class Node {
            T data;
            Node next;

            Node(T data) {
                this.data = data;
                this.next = null;
            }
        }

        private Node head;
        private int size;

        public Question7() {
            this.head = null;
            this.size = 0;
        }

        // เพิ่มข้อมูลไปที่หน้าสุด
        public void addToFront(T data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
            size++;
        }

        // เพิ่มข้อมูลไปที่ท้ายสุด
        public void addToBack(T data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
            size++;
        }

        // ดึงข้อมูลตาม Index
        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
            }
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }

        // แสดงข้อมูลทั้งหมดใน List
        public void display() {
            Node current = head;
            System.out.print("[ ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println("]");
        }

        public int getSize() {
            return size;
        }

    public static void main(String[] args) {

        // 1. ใช้งานกับ String
        System.out.println("--- String List ---");
        Question7<String> names = new Question7<>();
        names.addToBack("Alice");
        names.addToBack("Bob");
        names.addToFront("Charlie");
        names.display(); // ผลลัพธ์: [ Charlie Alice Bob ]
        System.out.println("Element at index 1: " + names.get(1));

        System.out.println();

        // 2. ใช้งานกับ Integer (ตัวเลข)
        System.out.println("--- Integer List ---");
        Question7<Integer> numbers = new Question7<>();
        numbers.addToBack(100);
        numbers.addToBack(200);
        numbers.addToFront(50);
        numbers.display(); // ผลลัพธ์: [ 50 100 200 ]
        System.out.println("Total size: " + numbers.getSize());
    }
}


    // คลาสหลักสำหรับทดสอบการใช้งาน




