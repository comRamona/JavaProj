import java.util.Arrays;


public class AbsolutePath {
	public static String ensureAbsolute(String path) {
		if(path.charAt(0)=='/') return path;          //or path.startsWith
		else path=(System.getProperty("user.dir")+'/').concat(path);
		return path; }
		public static String[] absoluteSplitPath(String s) {
			return SplitPathName.splitPath(ensureAbsolute(s));
		}
	public static void main(String[] args) {
		String[] full=absoluteSplitPath(args[0]);
		System.out.println(Arrays.toString(full));
	}

}
