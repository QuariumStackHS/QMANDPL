import os
from shutil import copyfile
os.system(".\gradlew build")
copyfile("build/libs/QuariumMod-0.0.1.jar", "C:/Users/slow/Desktop/server/mods\QuariumMod.jar")
input("")