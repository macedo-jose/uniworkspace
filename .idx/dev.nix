# To learn more about how to use Nix to configure your environment
# see: https://developers.google.com/idx/guides/customize-idx-env
{ pkgs, ... }: {
  # Which nixpkgs channel to use.
  channel = "unstable";
  # Use https://search.nixos.org/packages to find packages
  packages = [ pkgs.jdk
               pkgs.fish
             ];

  services.docker.enable = true;
      
  # Sets environment variables in the workspace
  env = {};
  # Search for the extensions you want on https://open-vsx.org/ and use "publisher.id"
  idx.extensions = [
       "vscodevim.vim"
       "vscjava.vscode-java-pack"
       "vscode-icons-team.vscode-icons"
       "anwar.papyrus-pdf"
  ];
  # Enable previews
  idx.previews = {
    enable = false;
      previews = {
      # web = {
      #   # Example: run "npm run dev" with PORT set to IDX's defined port for previews,
      #   # and show it in IDX's web preview panel
      #   command = ["npm" "run" "dev"];
      #   manager = "web";
      #   env = {
      #     # Environment variables to set for your server
      #     PORT = "$PORT";
      #   };
      # };
    };
  };
    # Workspace lifecycle hooks
  idx.workspace = {
      # Runs when a workspace is first created
      onCreate = {
        # Example: install JS dependencies from NPM
        # npm-install = "npm install";
        # Open editors for the following files by default, if they exist:
        default.openFiles = [ ".idx/dev.nix" "README.md" ];
      };
      # Runs when the workspace is (re)started
      onStart = {
        # Example: start a background task to watch and re-build backend code
        # watch-backend = "npm run watch-backend";
      };
    };
}