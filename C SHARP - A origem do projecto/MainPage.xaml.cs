using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Runtime.InteropServices.WindowsRuntime;
using Windows.Foundation;
using Windows.Foundation.Collections;
using Windows.UI.Xaml;
using Windows.UI.Xaml.Controls;
using Windows.UI.Xaml.Controls.Primitives;
using Windows.UI.Xaml.Data;
using Windows.UI.Xaml.Input;
using Windows.UI.Xaml.Media;
using Windows.UI.Xaml.Navigation;
using Windows.Media.Playback;
using Windows.Media.Core;

// The Blank Page item template is documented at https://go.microsoft.com/fwlink/?LinkId=402352&clcid=0x409

namespace Coffee_Addicts
{
    /// <summary>
    /// An empty page that can be used on its own or navigated to within a Frame.
    /// </summary>
    public sealed partial class MainPage : Page
    {
        MediaPlayer player;
        public MainPage()
        {
            this.InitializeComponent();
            player = new MediaPlayer();
        }

        
        private async void Portugal(object sender, RoutedEventArgs e)
        {
            Info.Text = " Country selected: \n\n Portugal \n\n Average price for coffee: \n\n 0.65€ \n\n Popular brands: \n\n Delta \n\n How to ask for coffee: \n\n Dê-me um café, se faz favor.";

            Windows.Storage.StorageFolder folder = await Windows.ApplicationModel.Package.Current.InstalledLocation.GetFolderAsync(@"Assets");
            Windows.Storage.StorageFile file = await folder.GetFileAsync("Portuguese.mp3");

            player.AutoPlay = false;
            player.Source = MediaSource.CreateFromStorageFile(file);

            player.Play();
        }


        private async void Espanha(object sender, RoutedEventArgs e)
        { 
            Info.Text = " Country selected: \n\n Espanha \n\n Average price for coffee: 1.65€ \n\n Popular brands: \n\n --- \n\n How to ask for coffee: \n\n Dame un café solo, por favor.";

            Windows.Storage.StorageFolder folder = await Windows.ApplicationModel.Package.Current.InstalledLocation.GetFolderAsync(@"Assets");
            Windows.Storage.StorageFile file = await folder.GetFileAsync("Spanish.mp3");

            player.AutoPlay = false;
            player.Source = MediaSource.CreateFromStorageFile(file);

            player.Play();
        }


        private async void Inglaterra(object sender, RoutedEventArgs e)
        {
            Info.Text = "Country selected: \n\n England \n\n Average price for coffee: \n\n £4.27 \n\n Popular brands: \n\n --- \n\n How to ask for coffee: \n\n One coffee. Please.";

            Windows.Storage.StorageFolder folder = await Windows.ApplicationModel.Package.Current.InstalledLocation.GetFolderAsync(@"Assets");
            Windows.Storage.StorageFile file = await folder.GetFileAsync("English.mp3");

            player.AutoPlay = false;
            player.Source = MediaSource.CreateFromStorageFile(file);

            player.Play();

        }

        

        private async void Franca(object sender, RoutedEventArgs e)
        {
            Info.Text = "Country selected: \n\n French \n\n Average price for coffee: \n\n 2.50€ \n\n Popular brands: \n\n --- \n\n How to ask for coffee: \n\n Donne-moi du café. S'il vous plait.";


            Windows.Storage.StorageFolder folder = await Windows.ApplicationModel.Package.Current.InstalledLocation.GetFolderAsync(@"Assets");
            Windows.Storage.StorageFile file = await folder.GetFileAsync("French.mp3");

            player.AutoPlay = false;
            player.Source = MediaSource.CreateFromStorageFile(file);

            player.Play();
        }

        

        private async void Alemanha(object sender, RoutedEventArgs e)
        {
            Info.Text = "Country selected: \n\n Germany \n\n Average price for coffee: \n\n 2.65€ \n\n Popular brands: \n\n --- \n\n How to ask for coffee: \n\n Gib mir Kaffee. Bitte.";

            Windows.Storage.StorageFolder folder = await Windows.ApplicationModel.Package.Current.InstalledLocation.GetFolderAsync(@"Assets");
            Windows.Storage.StorageFile file = await folder.GetFileAsync("Doitch.mp3");

            player.AutoPlay = false;
            player.Source = MediaSource.CreateFromStorageFile(file);

            player.Play();
        }

        

        private void More(object sender, RoutedEventArgs e)
        {
            Info.Text = " Maybe more Translations \n\n and features \n\n in a nearby future. \n\n Hope you enjoy \n\n the app.\n\n \n\n Best Regards  \n\n Pedro Loureiro";
        }

        

    }
}
