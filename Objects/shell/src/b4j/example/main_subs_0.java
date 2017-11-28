package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _application_error(RemoteObject _error,RemoteObject _stacktrace) throws Exception{
try {
		Debug.PushSubsStack("Application_Error (main) ","main",0,main.ba,main.mostCurrent,28);
if (RapidSub.canDelegate("application_error")) return b4j.example.main.remoteMe.runUserSub(false, "main","application_error", _error, _stacktrace);
Debug.locals.put("Error", _error);
Debug.locals.put("StackTrace", _stacktrace);
 BA.debugLineNum = 28;BA.debugLine="Sub Application_Error (Error As Exception, StackTr";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 29;BA.debugLine="Return True";
Debug.ShouldStop(268435456);
if (true) return main.__c.getField(true,"True");
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appstart(RemoteObject _args) throws Exception{
try {
		Debug.PushSubsStack("AppStart (main) ","main",0,main.ba,main.mostCurrent,11);
if (RapidSub.canDelegate("appstart")) return b4j.example.main.remoteMe.runUserSub(false, "main","appstart", _args);
Debug.locals.put("Args", _args);
 BA.debugLineNum = 11;BA.debugLine="Sub AppStart (Args() As String)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 12;BA.debugLine="Args = Array As String(8888)";
Debug.ShouldStop(2048);
_args = RemoteObject.createNewArray("String",new int[] {1},new Object[] {BA.NumberToString(8888)});Debug.locals.put("Args", _args);
 BA.debugLineNum = 13;BA.debugLine="If Args.Length<1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",_args.getField(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 14;BA.debugLine="Log( \" \")";
Debug.ShouldStop(8192);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 15;BA.debugLine="Log(\"PORT BELUM DISETTING\")";
Debug.ShouldStop(16384);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("PORT BELUM DISETTING")));
 BA.debugLineNum = 16;BA.debugLine="Log( \" \")";
Debug.ShouldStop(32768);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 17;BA.debugLine="ExitApplication";
Debug.ShouldStop(65536);
main.__c.runVoidMethod ("ExitApplication");
 };
 BA.debugLineNum = 20;BA.debugLine="srvr.Initialize(\"\")";
Debug.ShouldStop(524288);
main._srvr.runVoidMethod ("Initialize",main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 21;BA.debugLine="srvr.Port =  Args(0)";
Debug.ShouldStop(1048576);
main._srvr.runMethod(true,"setPort",BA.numberCast(int.class, _args.getArrayElement(true,BA.numberCast(int.class, 0))));
 BA.debugLineNum = 22;BA.debugLine="srvr.Start";
Debug.ShouldStop(2097152);
main._srvr.runVoidMethod ("Start");
 BA.debugLineNum = 23;BA.debugLine="StartMessageLoop";
Debug.ShouldStop(4194304);
main.__c.runVoidMethod ("StartMessageLoop",main.ba);
 BA.debugLineNum = 24;BA.debugLine="Log(\"Server Started at port \"& srvr.Port)";
Debug.ShouldStop(8388608);
main.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Server Started at port "),main._srvr.runMethod(true,"getPort"))));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4j.example.main");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim srvr As Server";
main._srvr = RemoteObject.createNew ("anywheresoftware.b4j.object.ServerWrapper");
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}