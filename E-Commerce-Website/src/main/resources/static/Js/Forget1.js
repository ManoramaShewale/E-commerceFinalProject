
const forget=()=>{
let result = confirm("Otp is sent to your register Email Id")
    if (result) {
      let otp;
      do {
        otp = prompt("Enter the 6-digit OTP");
        if (otp === "") {
          alert("Please enter the OTP");
        } else if (otp.length !== 6) {
          alert("Please enter a 6-digit OTP");
        }
      } while (otp === "" || otp.length !== 6);

      alert("Suceesfull");
    }
    
    else {
      alert("Please enter valid otp");
    }

};
  

