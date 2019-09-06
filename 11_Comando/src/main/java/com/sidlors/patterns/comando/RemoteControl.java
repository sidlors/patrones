package com.sidlors.patterns.comando;

public class RemoteControl{

    public RemoteControl(){
      onCommands= new Command[7];
      offCommands= new Command[7];
      Command noCommand= new  NoCommand();

      for(int i=0;i<onCommands.length;i++){
          onCommands[i]=noCommand;
          offCommands[i]=noCommand;
      }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommand[slot]=onCommand;
        offCommands[slot]=offCommand;
    }

    public void onButtomWasPushed(int slot){
        onCommands[slot].execute();
    }

    public void offButtomWasPushed(){
        offCommands[slot].execute();

    }

    public String toString(){
        StringBuilder stringBuff=new StringBuilder();
        stringBuff.append(".....Remote Control......\n");
        for(int i=0;i<onCommands.length;i++){
            stringBuff.append("[slot"+i+"] "+ onCommands[i].getClass().getName()+
            "       "+ offCommands[i].getClass().getName()+"\n");
        }
        return stringBuff.toString();
    }
}