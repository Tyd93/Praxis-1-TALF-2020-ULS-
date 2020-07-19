program promedio(input, output);
	var
		valor, suma, media: real;
		cuenta: integer;
	begin
		suma := 0;
		cuenta := 0;
		read(valor);
		while not eof do
			begin
				suma := suma + valor;
				cuenta := cuenta + 1;
				read(valor);
			end; {while}
		if cuenta >0
			then
				begin
					media := suma/cuenta;
					writeln(cuenta, 'valores leidos, promedio =', media);
				end
			else writeln('ningun valor leido');
		end.{promedio}