package solutionpiece.code.library.LG;

public class LGIR_TV_Codes {

    public int[] pattern = {1901, 4453, 625, 1614, 625, 1588, 625, 1614, 625, 442, 625, 442, 625, 468, 625, 442, 625, 494, 572, 1614, 625, 1588, 625, 1614, 625, 494, 572, 442, 651, 442, 625, 442, 625, 442,
            625, 1614, 625, 1588, 651, 1588, 625, 442, 625, 494, 598, 442, 625, 442, 625, 520, 572, 442, 625, 442, 625, 442, 651, 1588, 625, 1614, 625, 1588, 625, 1614, 625, 1588, 625, 48958};

    public int transmit_pattern = 138400;

    public String button_power, button_menu, button_enter;

    public String button_0, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9;

    public String button_channel_list, button_channel_plus, button_channel_minus;

    public String button_mute, button_volume_plus, button_volume_minus;

    public String button_index, button_AV;

    public String button_cursor_up, button_cursor_down, button_cursor_left, button_cursor_right;

    public String button_red, button_green, button_blue, button_yellow;

      public void GetLGCodes()
      {
          button_power = "0000 006d 0022 0002 0154 00ab 0015 0015 0015 0015 0015 0041 0015 0016 0015 0016 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0015 0015 0041 0015 0041 0015 0040 0015 0040 0015 0040 0015 0015 0015 0015 0015 0015 0015 0041 0015 0016 0015 0016 0015 0015 0015 0016 0015 0041 0015 0041 0015 0040 0015 0015 0015 0040 0015 0041 0015 0041 0015 0040 0015 0612 0154 0056 0015 0e5d";
          button_mute = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";

          button_1 = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";
          button_2 = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 003f 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 003f 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";
          button_3 = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";
          button_4 = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 0015 0016 003f 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";
          button_5 = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 003f 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 0015 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";
          button_6 = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";
          button_7 = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";
          button_8 = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 003f 0016 0015 0016 0015 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";
          button_9 = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 0015 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";
          button_0 = "0000 006c 0022 0002 0155 00ac 0015 0016 0015 0015 0015 0042 0015 0015 0015 0016 0015 0015 0015 0016 0015 0015 0015 0042 0015 0040 0015 0016 0015 0040 0015 0041 0015 0040 0015 0041 0015 0040 0015 0016 0015 0015 0015 0016 0015 0015 0015 0041 0015 0015 0015 0016 0015 0015 0015 0042 0015 0040 0015 0042 0015 0040 0015 0016 0015 0040 0015 0042 0015 0040 0015 05f6 0155 0056 0015 0e5b";

          button_AV = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";
          button_index = "0000 006d 0022 0002 0154 00aa 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0015 0015 0015 0041 0015 0040 0015 0015 0015 0015 0015 0040 0015 0015 0015 0040 0015 0041 0015 0015 0015 0015 0015 0040 0015 0040 0015 0015 0015 0040 0015 0611 0154 0056 0015 0e64";

          button_channel_list = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 0015 0016 0015 0016 003f 0016 05f3 0156 0055 0016 0e4d";

          button_volume_plus = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";
          button_volume_minus = "0000 006d 0022 0002 0157 00ab 0016 0015 0016 0015 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 0015 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 003f 0016 05f3 0156 0055 0016 0e4d";

          button_channel_plus = "0000 006D 0022 0002 0156 00AC 0015 0015 0015 0015 0015 0041 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0041 0015 0041 0015 0015 0015 0041 0015 0041 0015 0041 0015 0041 0015 0041 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0041 0015 0041 0015 0041 0015 0041 0015 0041 0015 0041 0015 0041 0015 0041 0015 0619 0156 0056 0015 0E6F";
          button_channel_minus= "0000 006D 0022 0002 0156 00AC 0015 0015 0015 0015 0015 0041 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0041 0015 0041 0015 0015 0015 0041 0015 0041 0015 0041 0015 0041 0015 0041 0015 0041 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0041 0015 0041 0015 0041 0015 0041 0015 0041 0015 0041 0015 0041 0015 0619 0156 0056 0015 0E6F";

          button_enter = "0000 006d 0022 0002 0154 00aa 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0041 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0041 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0040 0015 0015 0015 0040 0015 0041 0015 0015 0015 0041 0015 0040 0015 0041 0015 0015 0015 0040 0015 0611 0154 0056 0015 0e64";

          button_cursor_up = "0000 006d 0022 0002 0154 00aa 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0041 0015 0015 0015 0040 0015 0040 0015 0041 0015 0040 0015 0041 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0015 0015 0040 0015 0041 0015 0040 0015 0041 0015 0040 0015 0041 0015 0015 0015 0041 0015 0611 0154 0056 0015 0e64";
          button_cursor_left = "0000 006d 0022 0002 0154 00aa 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0041 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0041 0015 0040 0015 0041 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0611 0154 0056 0015 0e64";
          button_cursor_right = "0000 006d 0022 0002 0154 00aa 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0041 0015 0015 0015 0040 0015 0040 0015 0041 0015 0040 0015 0041 0015 0015 0015 0040 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0611 0154 0056 0015 0e64";
          button_cursor_down = "0000 006d 0022 0002 0154 00aa 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0041 0015 0015 0015 0041 0015 0040 0015 0041 0015 0040 0015 0041 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0041 0015 0040 0015 0041 0015 0040 0015 0041 0015 0015 0015 0041 0015 0611 0154 0056 0015 0e64";

          button_menu = "0000 006d 0028 0000 0154 00aa 0015 0015 0015 0015 0015 0040 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0015 0040 0015 0041 0015 0015 0015 0040 0015 0040 0015 0041 0015 0040 0015 0041 0015 0040 0015 0041 0015 0015 0015 0015 0015 0015 0015 0015 0015 0041 0015 0015 0015 0015 0015 0015 0015 0040 0015 0041 0015 0040 0015 0041 0015 0015 0015 0040 0015 0611 0154 0056 0015 0e64";

          button_red = "0000 006d 0026 0000 0155 00aa 0016 0015 0016 0015 0016 0040 0016 0015 0016 0015 0016 0015 0016 0014 0016 0015 0016 0040 0016 0040 0016 0014 0016 0040 0016 0040 0016 0040 0016 0040 0016 0040 0016 0014 0016 0040 0016 0015 0016 0014 0016 0040 0016 0040 0016 0040 0016 0015 0016 0040 0016 0015 0016 0040 0016 0040 0016 0015 0016 0014 0016 0015 0016 0040 0016 060a 0155 0055 0016 0e58 0155 0055 0016 00aa";
          button_green = "0000 006d 0026 0000 0155 00aa 0016 0015 0016 0015 0016 0040 0016 0015 0016 0015 0016 0015 0016 0014 0016 0015 0016 0040 0016 0040 0016 0014 0016 0040 0016 0040 0016 0040 0016 0040 0016 0040 0016 0040 0016 0015 0016 0015 0016 0014 0016 0040 0016 0040 0016 0040 0016 0015 0016 0015 0016 0040 0016 0040 0016 0040 0016 0015 0016 0014 0016 0015 0016 0040 0016 060a 0155 0055 0016 0e58 0155 0055 0016 00aa";
          button_blue = "0000 006d 0026 0000 0155 00aa 0016 0015 0016 0015 0016 0040 0016 0015 0016 0015 0016 0015 0016 0014 0016 0015 0016 0040 0016 0040 0016 0014 0016 0040 0016 0040 0016 0040 0016 0040 0016 0040 0016 0040 0016 0015 0016 0015 0016 0014 0016 0015 0016 0040 0016 0040 0016 0014 0016 0015 0016 0040 0016 0040 0016 0040 0016 0040 0016 0014 0016 0015 0016 0040 0016 060a 0155 0055 0016 0e58 0155 0055 0016 00aa";
          button_yellow = "0000 006d 0026 0000 0155 00aa 0016 0015 0016 0015 0016 0040 0016 0014 0016 0015 0016 0015 0016 0014 0016 0014 0016 0040 0016 0040 0016 0014 0016 0040 0016 0040 0016 0040 0016 0040 0016 0040 0016 0040 0016 0040 0016 0015 0016 0014 0016 0015 0016 0040 0016 0040 0016 0015 0016 0015 0016 0015 0016 0040 0016 0040 0016 0040 0016 0014 0016 0015 0016 0040 0016 060b 0155 0055 0016 0e58 0155 0055 0016 00aa";
      }




}
