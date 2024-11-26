<?php
$conn = new mysqli("localhost", "root", "password", "basketball");

if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

$sql = "SELECT * FROM players";
$result = $conn->query($sql);

echo "<h1>Basketball Players</h1><ul>";
while ($row = $result->fetch_assoc()) {
    echo "<li>" . $row['name'] . " - " . $row['position'] . "</li>";
}
echo "</ul>";

$conn->close();
?>
