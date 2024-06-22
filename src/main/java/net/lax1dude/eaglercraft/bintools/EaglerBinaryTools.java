package net.lax1dude.eaglercraft.bintools;

/**
 * Copyright (c) 2024 lax1dude. All Rights Reserved.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 * 
 */
public class EaglerBinaryTools {

	public static void main(String[] args) throws Throwable {
		if(args.length < 1) {
			usage();
			return;
		}
		String[] argz = new String[args.length - 1];
		System.arraycopy(args, 1, argz, 0, argz.length);
		switch(args[0].toLowerCase()) {
			case "epkcompiler":
			case "epkcompile":
				EPKCompiler._main(argz);
				return;
			case "legacy-epkcompiler":
			case "legacyepkcompiler":
			case "legacy-epkcompile":
			case "legacyepkcompile":
				EPKCompilerLegacy._main(argz);
				return;
			case "epkdecompiler":
				EPKDecompiler._main(argz);
				return;
			case "obj2mdl-1.5-old":
			case "obj2mdl-1.5old":
			case "obj2mdl1.5-old":
			case "obj2mdl1.5old":
				OBJConverter._main(argz, false);
				return;
			case "obj2mdl-1.8-old":
			case "obj2mdl-1.8old":
			case "obj2mdl1.8-old":
			case "obj2mdl-old":
			case "obj2mdlold":
				OBJConverter._main(argz, true);
				return;
			case "obj2mdl-1.5-new":
			case "obj2mdl-1.5new":
			case "obj2mdl1.5-new":
			case "obj2mdl1.5new":
			case "obj2mdl-1.5":
			case "obj2mdl1.5":
				OptimizedOBJConverter._main(argz, false);
				return;
			case "obj2mdl-1.8-new":
			case "obj2mdl-1.8new":
			case "obj2mdl1.8-new":
			case "obj2mdl1.8new":
			case "obj2mdl-new":
			case "obj2mdlnew":
			case "obj2mdl-1.8":
			case "obj2mdl1.8":
			case "obj2mdl":
				OptimizedOBJConverter._main(argz, true);
				return;
			case "ebp-encode":
			case "ebpencode":
			case "ebp-encoder":
			case "ebpencoder":
				EBPFileEncoder._main(argz);
				return;
			case "ebp-decode":
			case "ebpdecode":
			case "ebp-decoder":
			case "ebpdecoder":
				EBPFileDecoder._main(argz);
				return;
			case "skybox-gen":
			case "skyboxgen":
				SkyboxGen._main(argz);
				return;
			case "light-mesh-gen":
			case "lightmeshgen":
				LightMeshGen._main(argz);
				return;
			case "eagler-bmp-gen":
			case "eaglerbmpgen":
				EaglerBMPGen._main(argz);
				return;
			default:
				usage();
				return;
		}
	}

	private static void usage() {
		System.out.println("Usage: java -jar EaglerBinaryTools.jar <epkcompiler|legacy-epkcompiler|epkdecompiler|obj2mdl-1.5|obj2mdl-1.8|ebp-encode|ebp-decode|skybox-gen|light-mesh-gen|eagler-bmp-gen> [args...]");
		System.out.println(" - 'epkcompiler': Compile an EPK file from a folder");
		System.out.println(" - 'legacy-epkcompiler': Compile an EPK file in legacy format");
		System.out.println(" - 'epkdecompiler': Decompile an EPK file into a folder");
		System.out.println(" - 'obj2mdl-1.5': Compile FNAW skin MDL file for 1.5");
		System.out.println(" - 'obj2mdl-1.8': Compile FNAW skin MDL file for 1.8");
		System.out.println(" - 'obj2mdl-1.5-old': Compile FNAW skin MDL file for 1.5 using the old OBJ converter");
		System.out.println(" - 'obj2mdl-1.8-old': Compile FNAW skin MDL file for 1.8 using the old OBJ converter");
		System.out.println(" - 'ebp-encode': Encode EBP file from PNG");
		System.out.println(" - 'ebp-decode': Decode EBP file to PNG");
		System.out.println(" - 'skybox-gen': Generate skybox.dat from OBJ for shader packs");
		System.out.println(" - 'light-mesh-gen': Generate light_point.dat from OBJ for shader packs");
		System.out.println(" - 'eagler-bmp-gen': Generate moon and lens flare BMP textures from PNG for shader packs");
	}

}
