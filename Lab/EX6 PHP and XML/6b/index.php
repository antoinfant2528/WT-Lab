<?php
$xml = simplexml_load_file("players.xml");

echo "<h1>Basketball Players</h1><ul>";
foreach ($xml->player as $player) {
    echo "<li>" . $player->name . " - " . $player->position . "</li>";
}
echo "</ul>";
?>
