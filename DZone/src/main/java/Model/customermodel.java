package Model;

public class customermodel {
		private String Password,Username,EmailAdderss,Repeat_Password;

		public String getPassword() {
			return Password;
		}

		public void setPassword(String password) {
			Password = password;
		}

		public String getUsername() {
			return Username;
		}

		public void setUsername(String username) {
			Username = username;
		}

		public String getEmailAdderss() {
			return EmailAdderss;
		}

		public void setEmailAdderss(String emailAdderss) {
			EmailAdderss = emailAdderss;
		}

		public String getConfirmPassword() {
			return Repeat_Password;
		}

		public void setConfirmPassword(String confirmPassword) {
			Repeat_Password = confirmPassword;
		}

		@Override
		public String toString() {
			return "customermodel [Password=" + Password + ", Username=" + Username + ", EmailAdderss=" + EmailAdderss
					+ ", ConfirmPassword=" + Repeat_Password + "]";
		}
		
		
}
