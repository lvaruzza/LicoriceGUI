if [ -d dist ]; then
 rm -Rf dist
fi
B=$PWD
echo $B

mkdir dist
cd dist
mkdir Licorice
cd Licorice
cp $B/GUI/target/gui-*-jar-with-dependencies.jar Licorice.jar
cp -r $B/licorice/native .
cp $B/GUI/licorice.properties.orig licorice.properties
cp $B/GUI/Licorice.bat .
mkdir genome
#cp -Rv $B/genome .
cd ..
zip -r licorice.zip Licorice
cp licorice.zip ~/customers
cd $B
