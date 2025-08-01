# SimulatedAnnealing-Shortest-Path-Between-Cities

This Java project uses **Simulated Annealing** to solve the **Traveling Salesman Problem (TSP)** by finding a near-optimal path that visits a set of randomly generated cities and returns to the starting point. It's designed as an educational tool to demonstrate heuristic optimization techniques.

🔗 **GitHub Repository**:  
[github.com/MohamedMoustafa-UoG/SimulatedAnnealing-Shortest-Path-Between-Cities](https://github.com/MohamedMoustafa-UoG/SimulatedAnnealing-Shortest-Path-Between-Cities/tree/master)

---

## 🧠 What Is Simulated Annealing?

Simulated Annealing is a probabilistic optimization algorithm inspired by the process of annealing in metallurgy. It accepts worse solutions with a certain probability early on to escape local minima, gradually reducing this chance as the "temperature" cools down.

---

## 🚀 How to Run

### 🔧 Prerequisites

- Java JDK 8 or higher
- A Java-compatible IDE (e.g., IntelliJ, Eclipse), or command-line Java setup

### 💻 Steps

1. **Clone the repository:**

   ```bash
   git clone https://github.com/MohamedMoustafa-UoG/SimulatedAnnealing-Shortest-Path-Between-Cities.git
   cd SimulatedAnnealing-Shortest-Path-Between-Cities
   ```

2. **Compile the source files:**

   ```bash
   javac *.java
   ```

3. **Run the program:**

   ```bash
   java SimulatedAnnealing
   ```

---

## 📂 Project Structure

| File                  | Description                                       |
|-----------------------|---------------------------------------------------|
| `SimulatedAnnealing.java` | Core implementation of the Simulated Annealing algorithm |
| `City.java`           | Represents a city with randomly generated coordinates |
| `Tour.java`           | Represents a possible path between cities        |

---

## ⚙️ Algorithm Parameters

| Parameter      | Description                                | Default Value |
|----------------|--------------------------------------------|---------------|
| `temp`         | Initial temperature                        | 100000        |
| `coolingRate`  | Rate at which the system cools             | 0.0003        |
| `cityCount`    | Number of cities in the tour               | 201           |

Modify these in `SimulatedAnnealing.java` to experiment with different configurations.

---

## 🧪 Sample Output

```text
Initial solution distance: 148392
Final solution distance: 108342
Tour: [City1 -> City5 -> ... -> City1]
```

---

## 📈 How It Works

1. Generate a random set of 201 cities.
2. Create an initial tour using a random permutation.
3. Repeatedly:
   - Swap two cities in the current tour to create a neighbor.
   - Accept the neighbor based on improvement or a probability based on the current temperature.
   - Update the best tour found so far.
4. Gradually cool the temperature until convergence.

---

## 📜 License

This project is open-source and available for educational and research use.

---

## 🙋 Support or Questions?

Feel free to open an [Issue](https://github.com/MohamedMoustafa-UoG/SimulatedAnnealing-Shortest-Path-Between-Cities/issues) if you encounter any problems or want to suggest improvements.
