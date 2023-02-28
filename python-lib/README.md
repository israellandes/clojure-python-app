To convert Python project folder 'python-lib/mypythonlib-israellandes' to a Pip package, navigate to the 'python-lib' directory containing the 'setup.py' file and execute the following commands:

python setup.py sdist bdist_wheel
# creates a 'dist/*' folder

twine upload dist/*
# Uploads folder to PyPi

# Lastly, install your package with pip install
