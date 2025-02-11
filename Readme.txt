# Java Installation Guide

## Step 1: Install Java JDK (Latest Version)
- Download the Java JDK executable file from the official [Oracle website](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenJDK](https://openjdk.org/).
- Follow the installation instructions provided by the installer.
- After installation, set up Java **Environment Variables** if necessary.

## Step 2: Install Visual Studio Code (VSCode) and Java Extensions
- Download and install **Visual Studio Code (VSCode)** from [here](https://code.visualstudio.com/).
- Launch **VSCode** and navigate to the Extensions Marketplace.
- Search and install the following Java extensions:
  - [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
  - [Debugger for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-debug)
  - [Language Support for Java(TM) by Red Hat](https://marketplace.visualstudio.com/items?itemName=redhat.java)
  - [Java Test Runner](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-test)

## Step 3: Setup Environment Variables (If Needed)
1. Open **Control Panel > System and Security > System > Advanced System Settings > Environment Variables**.
2. Under **System Variables**, check if `JAVA_HOME` is set to the path where Java JDK is installed. If not:
   - Click **New** and set `JAVA_HOME` as the variable name.
   - Set the variable value to your JDK installation path (e.g., `C:\Program Files\Java\jdk-XX`).
3. Edit the **Path** variable:
   - Add `%JAVA_HOME%\bin` to ensure Java commands are accessible from the command line.

---

## 🔥 Shortcuts and Tips
🚀 Use these shortcuts in VSCode to speed up Java development:

| Shortcut | Function |
|----------|----------|
| `class` | Generates a Java class template |
| `psvm`  | Generates `public static void main(String[] args)` |

---

✅ Now, you're all set to start coding in Java using VSCode! 🎉  
Happy Coding! 🚀
