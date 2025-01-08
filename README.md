# **PacketCapture**

**PacketCapture** is a Java-based application that captures and analyzes network packets using **Tshark**, the command-line interface for **Wireshark**. This project seamlessly integrates Java and Tshark, offering an efficient solution for real-time network packet analysis.

## 📚 **Features**

-   📡 **Real-Time Packet Capture:** Capture network packets as they are transmitted.
-   🛠️ **Packet Analysis with Tshark:** Leverage Tshark's powerful analysis tools.
-   💻 **Command-Line Interface (CLI):** Intuitive interface for configuration and usage.
-   📦 **Modular Design:** Easily extend and integrate new features.

## ⚙️ **Requirements**

-   **Java 11** or higher
-   **Tshark** (Ensure it's installed and added to your system's PATH)
-   **Gradle** for dependency management and builds

## 🚀 **Setup and Usage**

### **1. Clone the Repository, Install Dependencies, Build, Configure Tshark, Run, and Test the Application**

```bash
git clone <repository_url>
cd PacketCapture
gradle build
tshark -v
gradle run
gradle test
```
