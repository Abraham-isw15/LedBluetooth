void setup() {
  Serial.begin(9600);
  pinMode(13,OUTPUT);
}

void loop() {
  char c;

  if (Serial.available()){
    Serial.print("AVAILABLE");
    c = Serial.read();
    Serial.print(c);
    if(c=='a'){
      digitalWrite(13,HIGH);
      Serial.print("CONECTED");
    }else if(c=='b'){
      digitalWrite(13,LOW);
      Serial.print("DISCONECTED");
    }
  }
}
