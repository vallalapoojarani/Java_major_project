

# Java Encoder & Decoder

A simple Java-based Encoder and Decoder project for converting plain text into encoded format and decoding it back into readable text.

---

## Features

* Encode plain text into a secure format
* Decode encoded text back to original text
* Easy-to-use command-line interface
* Lightweight and beginner-friendly Java project
* Supports custom encoding logic

---

## Technologies Used

* Java
* OOP Concepts
* File Handling (optional)
* Command Line Interface

---

## Project Structure

```bash
EncoderDecoder/
│
├── src/
│   ├── Encoder.java
│   ├── Decoder.java
│   └── Main.java
│
├── README.md
└── LICENSE
```

---

## Requirements

Before running the project, make sure you have:

* Java JDK 8 or above
* Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)
* Command Prompt / Terminal

Check Java installation:

```bash
java -version
javac -version
```

---

## How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/EncoderDecoder.git
cd EncoderDecoder
```

### 2. Compile the Java Files

```bash
javac src/*.java
```

### 3. Run the Program

```bash
java src/Main
```

---

## Example

### Input

```text
Hello World
```

### Encoded Output

```text
Khoor Zruog
```

### Decoded Output

```text
Hello World
```

---

## Sample Encoder Logic

Example using Caesar Cipher:

```java
public class Encoder {
    public static String encode(String text, int shift) {
        StringBuilder result = new StringBuilder();

        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isUpperCase(ch) ? 'A' : 'a';
                ch = (char) ((ch - base + shift) % 26 + base);
            }
            result.append(ch);
        }

        return result.toString();
    }
}
```

---

## Sample Decoder Logic

```java
public class Decoder {
    public static String decode(String text, int shift) {
        return Encoder.encode(text, 26 - shift);
    }
}
```

---

## Future Improvements

* GUI support using Java Swing or JavaFX
* File encryption/decryption
* Password-protected encoding
* Base64 and AES support
* Web version using Spring Boot

---

## Contributing

Contributions are welcome.

1. Fork the repository
2. Create a new branch
3. Commit your changes
4. Push to your branch
5. Open a Pull Request

---

## License

This project is licensed under the MIT License.

---

## Author

Developed using Java for learning and practice purposes.

<img width="720" height="1600" alt="WhatsApp Image 2026-05-19 at 11 21 20 AM" src="https://github.com/user-attachments/assets/1a55d173-98b5-494e-9996-1fe0a498ab82" />
<img width="720" height="1600" alt="WhatsApp Image 2026-05-19 at 11 21 19 AM" src="https://github.com/user-attachments/assets/dcae2615-e2fc-49e4-8e2e-a24aac2af7a9" />
