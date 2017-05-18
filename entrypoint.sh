if [ -z "$1" ]; then
    echo "Usage: docker run [options] <label> <TaskName>"
    exit 2
fi

task_name="$1"

# try to go to the task directory
cd /checker/tasks || exit 2

# try to show a friendly message if students use the package statement
if grep -q '^package ' /checker/input/*.java; then
    echo 'You are using the `package` statement, but our unit tests expect'
    echo 'all classes to be in the default package. In other words, please'
    echo 'remove the `package` statement and upload your solution again.'
    exit 1
fi

exec ant \
    -Dbuild.dir=/checker/scratch/build \
    -Dchecker.input=/checker/input \
    -Dchecker.task=$task_name \
    -Dchecker.output=/checker/output/storage \
    checkall
