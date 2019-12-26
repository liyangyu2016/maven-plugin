def file = new File(basedir,'bulid.log')
def countMain=false
def countTest=fase
file.eachLine{
if(it=~/src.main.java:5 lines of code in 1 files/)
countMain=true
if(it=~/src.test.java:0 lines of code in 0 files/)
countTest=true
}
if(!countMain) 
throw new RuntimeException("incorrect src/main/java count info");
if(!countTest) 
throw new RuntimeException("incorrect src/test/java count info");
