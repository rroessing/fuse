import generated_1490874398211.ORDERS05.IDOC.E1EDK14


//you can get the message as request.body : String

print request.body
def list =  [ 	new E1EDK14([segment:"1",qualf:"005", orgid: "something"]),  
				new E1EDK14([segment:"1",qualf:"006",orgid:"10"])
				
			];



return list