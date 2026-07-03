# Coding Notes: Bit Manipulation in Java

Bit manipulation is the process of performing logical operations on bits, the smallest unit of data in a computer. This is essential for efficient programming and understanding how data is handled at the hardware level.

## Core Operations

### 1. Get Bit
This operation checks whether a specific bit at a given position is 0 or 1.
* **Logic**:
    1. Create a `bitMask` by shifting 1 to the left by the position (`pos`) using `1 << pos`.
    2. Perform a bitwise AND (`&`) operation between the number (`n`) and the `bitMask`.
    3. If the result is 0, the bit at that position is 0; otherwise, it is 1.

### 2. Set Bit
This operation changes a specific bit at a given position to 1.
* **Logic**:
    1. Create a `bitMask` using `1 << pos`.
    2. Perform a bitwise OR (`|`) operation between the number (`n`) and the `bitMask`.
    3. The OR operation ensures that if the bit is 0, it becomes 1; if it is 1, it remains 1.

### 3. Clear Bit
This operation changes a specific bit at a given position to 0.
* **Logic**:
    1. Create a `bitMask` using `1 << pos`.
    2. Apply the NOT operator (`~`) to the `bitMask` to invert all bits.
    3. Perform a bitwise AND (`&`) operation between the number (`n`) and the inverted `bitMask`.
    4. This forces the bit at the specified position to become 0 while keeping others unchanged.

### 4. Update Bit
This operation updates a bit to either 0 or 1 based on a user-provided operation (or condition).
* **Logic**:
    * If the operation is set (e.g., 1), use the "Set Bit" logic (`bitMask | n`).
    * If the operation is clear (e.g., 0), use the "Clear Bit" logic (`~bitMask & n`).

## Summary Table

| Operation | Logic Used | Key Operators |
| :--- | :--- | :--- |
| **Get Bit** | Check bit status | `1 << pos`, `&` |
| **Set Bit** | Change to 1 | `1 << pos`, `\|` |
| **Clear Bit** | Change to 0 | `1 << pos`, `~`, `&` |
| **Update Bit** | Set or Clear | Conditional (`if-else`), `\|` or `~ &` |