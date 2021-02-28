#!/bin/sh

echo "First arg: $1"
echo "Second arg: $2"
current=""
declare -a args
bool=false
while [[ $[#] -ne 0 ]]; do
	#statements
	if [ $current == "init"];
	then
		bool=true
	else
		if [ $current =="push" ];
		then
			bool=true
			args+=($1)

		else
			case $1 in
				pop)
				bool=true
				current="pop"
				;;
				push)
				bool=true
				current="push"
				;;
				peek)
				bool=true
				current="peek"
				;;
				show)
				bool=true
				current="show"
				;;
				*)
				echo "command not found"
				bool=bool
				break
				;;
			esac
			args+=($1)
		fi;
		shift
	fi

done
	if [[ "$bool" = true ]]; then
		java -cp build/classes/simulator/Simulator "${args[0]}"
	fi
exit 0