# INLOOP example task repository

This is an example task repository for [INLOOP](https://github.com/st-tu-dresden/inloop).

## Setup

To import these tasks into INLOOP, clone this repository into the same folder as your `inloop` folder is.
So it should look like this:
```
inloop@inloop:~$ l
inloop/  inloop-sample-tasks/
```

Then run the following comands:
```
inloop@inloop:~$ cd inloop
inloop@inloop:~$ export GIT_ROOT=/path/to/inloop-sample-tasks
inloop@inloop:~$ source .state/venv/bin/activate
(venv) inloop@inloop:~/inloop$ ./manage.py shell_plus
>>> from inloop.gh_import.tasks import update_tasks
>>> update_tasks.call_local()
```
**Hint**: To exit the shell, type `quit()`.


## Update

To rebuild the tasks type `make dockerimage`.

**Hint**: Tasks have to be removed manually in the INLOOP administration panel.
