# Introduction 
SimpleTP is a Minecraft Plugin that simplifies teleporting to the server spawn location.

# Commands
* **/spawn** <br>
  Teleport to the Server spawn.

* **/setspawn [ unset, [ normalize-view, normalize-position ]]** <br>
  Set/Unset the Server spawn.
  - **unset** <br>
    Clears the currently stored spawn location.
  - **normalize-view** <br>
    Normalizes the rotation of the players head (yaw and pitch) to one of the following degrees: 90, 180, 270, 360
  - **normalize-position** <br>
    Normalizes the players position to the center of the block.

# Localizing
The chat messages can be customized in the configuration file.

# Configuration
See an example configuration at [src/main/resources/config.yml](src/main/resources/config.yml).