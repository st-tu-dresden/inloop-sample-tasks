# INLOOP example task repository

This is an example task repository for [INLOOP](https://github.com/st-tu-dresden/inloop).

## Setup

To import these tasks into INLOOP, clone this repository into the same folder as your `inloop` folder is.
So it should look like this:
```
inloop@inloop:~$ l
inloop/  inloop-sample-tasks/
```

Change in `inloop/setting.py` the line
`GIT_ROOT = str(env("GIT_ROOT", cast=Path, default=BASE_DIR.parent / "inloop-tasks"))` to
`GIT_ROOT = str(env("GIT_ROOT", cast=Path, default=BASE_DIR.parent / "inloop-sample-tasks"))`.


Then run the following comands:
```
inloop@inloop:~$ cd inloop && source .state/venv/bin/activate
(venv) inloop@inloop:~/inloop$ ./manage.py shell_plus
>>> from inloop.gh_import.tasks import update_tasks
>>> update_tasks.call_local()
```
**Hint**: To exit the shell, type `quit()`.


## Update

To rebuild the tasks type `make dockerimage`.

**Hint**: The removing of tasks has to be made manually via the `Administration`-Panel of INLOOP.
