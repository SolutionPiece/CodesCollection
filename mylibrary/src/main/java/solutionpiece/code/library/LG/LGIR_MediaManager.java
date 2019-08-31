package solutionpiece.code.library.LG;

public class LGIR_MediaManager {

    public int[] pattern = {1901, 4453, 625, 1614, 625, 1588, 625, 1614, 625, 442, 625, 442, 625, 468, 625, 442, 625, 494, 572, 1614, 625, 1588, 625, 1614, 625, 494, 572, 442, 651, 442, 625, 442, 625, 442,
            625, 1614, 625, 1588, 651, 1588, 625, 442, 625, 494, 598, 442, 625, 442, 625, 520, 572, 442, 625, 442, 625, 442, 651, 1588, 625, 1614, 625, 1588, 625, 1614, 625, 1588, 625, 48958};

    public int transmit_pattern = 138400;

    public String audio_code, poweronoff_code, mute_code, menu_code, repeat_code, stop_code;
    public String okup_code, okdown_code, okleft_code, okright_code, ok_code;
    public String volup_code, voldown_code, menusetup_code, menuoption_code,


            netcast_code, powermode_code, nettest_code,
            copy_code, rotate_code, search_code, info_code, zoom_code, subtitle_code, openclose_code, backgrndmusic_code,
            exit_code, pageup_code, pagedown_code;
    public String blue_code, green_code, red_code, yellow_code,
    fastbckwrd_code, back_code, pause_code, play_code, next_code, fastfrwrd_code;


    public void MediaManager()
    {
        audio_code = "0000 006D 0022 0002 0157 00AB 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0016 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 003F 0016 003F 0016 003F 0016 0015 0016 003F 0015 05F9 0156 0055 0016 05F9";
        poweronoff_code = "0000 006D 0022 0002 0156 00AB 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0016 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 0015 0016 0015 0015 0040 0015 0015 0016 003F 0016 0015 0016 0015 0016 003F 0016 003F 0016 003F 0016 05F6 0155 0055 0016 05F6";
        mute_code = "0000 006E 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0016 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0015 0016 003F 0016 05F3 0155 0055 0016 0E3C";

        repeat_code = "0000 006D 0022 0002 0157 00AB 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 0015 0016 0015 0015 0015 0016 0015 0016 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0016 0015 0016 05F7 0156 0055 0016 05F7";
        menu_code = "0000 006D 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 003F 0016 003F 0016 003F 0016 0015 0015 0016 0015 0040 0015 0015 0016 003F 0016 0015 0016 0015 0015 0015 0016 05F7 0157 0055 0015 05F7";
        stop_code = "0000 006D 0022 0002 0157 00AB 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0016 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 003F 0016 0015 0016 0015 0016 05F8 0156 0055 0015 0E47";

        volup_code = "0000 006D 0022 0002 0157 00AB 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 0015 0016 0015 0015 0040 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 003F 0016 05F7 0156 0055 0015 0E45";
        voldown_code = "0000 006E 0022 0002 0156 00AB 0015 0040 0015 0016 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 003F 0016 003F 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 0015 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 05F4 0155 0055 0016 0E3D";
        pageup_code = "0000 006E 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0016 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 003F 0016 05F3 0155 0055 0016 0E3A";
        pagedown_code = "0000 006E 0022 0002 0156 00AA 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 05F4 0154 0055 0015 0E39";

        ok_code = "0000 006E 0022 0002 0156 00AB 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 0015 0016 0015 0015 0015 0016 003F 0016 0015 0016 003F 0016 0015 0016 003F 0016 003F 0015 0040 0015 0040 0015 05F7 0155 0055 0015 0E42";
        okup_code = "0000 006E 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0016 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 003F 0016 05F3 0155 0055 0016 0E3A";
        okdown_code = "0000 006D 0022 0002 0156 00AB 0016 003F 0016 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0040 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0040 0015 0016 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 05F9 0156 0055 0015 0E46";
        okleft_code = "0000 006E 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0016 0015 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 0015 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 003F 0016 05F3 0155 0055 0016 0E39";
        okright_code = "0000 006D 0022 0002 0156 00AB 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0016 0015 0040 0015 0015 0016 0015 0016 0015 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 05F6 0155 0055 0015 0E44";

        menusetup_code = "0000 006D 0022 0002 0156 00AC 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0016 0015 0015 0016 0015 0016 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0016 0015 0016 0015 0015 05FA 0156 0055 0016 05FA";
        menuoption_code = "0000 006E 0022 0002 0155 00AB 0016 003F 0016 0015 0015 0016 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0016 0015 003F 0016 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 05F3 0155 0055 0016 0E3B";

        fastbckwrd_code = "0000 006E 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 0015 0016 0015 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0015 0016 05F4 0155 0055 0015 0E3F";
        back_code = "0000 006D 0022 0002 0157 00AB 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 0015 0016 0015 0015 0015 0016 0015 0016 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0016 0015 0016 05F7 0156 0055 0016 05F7";
        pause_code = "0000 006D 0022 0002 0157 00AB 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0016 003F 0015 0040 0015 0016 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 003F 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 0015 0015 05FA 0156 0055 0015 0E47";
        play_code = "0000 006D 0022 0002 0156 00AC 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0016 0015 0015 0016 003F 0016 0015 0016 003F 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 0015 0015 05F9 0155 0055 0015 0E43";
        next_code = "0000 006D 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 003F 0016 003F 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 003F 0016 0015 0015 0016 0015 05F7 0156 0055 0015 0E42";
        fastfrwrd_code = "0000 006E 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0016 0015 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0015 0016 05F5 0155 0055 0016 0E3E";

        netcast_code = "0000 006D 0022 0002 0155 00AB 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 0015 0016 0015 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0016 003F 0015 0040 0015 0040 0015 0040 0015 0040 0015 0016 0015 0015 0016 05F7 0157 0055 0015 05F7";
        powermode_code = "0000 006D 0022 0002 0156 00AB 0015 0040 0015 0016 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 003F 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0015 0016 0015 0015 0016 0015 0016 05F7 0155 0055 0016 05F7";
        nettest_code = "0000 006D 0022 0002 0156 00AB 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 0015 0015 0015 0016 003F 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 003F 0016 0015 0016 003F 0016 05F6 0156 0055 0015 05F6";
        copy_code = "0000 006E 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 003F 0015 0016 0015 0015 0016 0015 0016 003F 0016 003F 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 003F 0016 0015 0016 0015 0015 0015 0016 05F2 0155 0055 0016 05F2";
        rotate_code = "0000 006D 0022 0002 0157 00AB 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 003F 0016 0015 0015 0015 0016 0015 0016 0015 0016 003F 0015 0040 0015 0040 0015 0016 0015 0040 0015 0040 0015 003F 0016 003F 0016 0015 0016 0015 0016 05F7 0156 0055 0016 05F7";
        search_code = "0000 006D 0022 0002 0156 00AB 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 0015 0015 05F9 0156 0055 0016 05F9";
        info_code = "0000 006D 0022 0002 0156 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0016 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 0015 0016 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 003F 0016 0015 0016 0015 0015 0015 0016 05F7 0156 0055 0016 0E44";
        zoom_code = "0000 006D 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 003F 0016 0015 0016 0015 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0015 0015 0016 05F7 0156 0055 0015 05F7";
        subtitle_code = "0000 006D 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 003F 0016 003F 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0015 0015 0016 05F6 0156 0055 0016 05F6";
        openclose_code = "0000 006D 0022 0002 0156 00AB 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0040 0015 0016 0015 003F 0016 003F 0016 0015 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 003F 0016 003F 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 0015 0016 0015 0015 05F9 0155 0055 0015 0E45";
        backgrndmusic_code = "0000 006D 0022 0002 0157 00AB 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0016 0015 0015 0015 0016 0015 0016 003F 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0016 0015 0016 0015 0015 05F9 0156 0055 0016 05F9";
        exit_code = "0000 006D 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0040 0015 0015 0016 0015 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0016 003F 0016 05F7 0156 0055 0015 0E45";

        blue_code = "0000 006D 0022 0002 0156 00AB 0016 003F 0016 0015 0015 0015 0016 003F 0016 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0040 0015 0015 0016 003F 0016 0015 0016 0015 0015 0016 0015 0015 0016 05F7 0157 0055 0015 05F7";
        green_code = "0000 006D 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0016 0015 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 003F 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0015 0016 0015 0016 0015 0015 0015 0016 05F6 0156 0055 0016 05F6";
        red_code = "0000 006E 0022 0002 0154 00AA 0016 003F 0016 0015 0016 0015 0015 0040 0015 0016 0015 0015 0016 003F 0016 0015 0016 0015 0015 0040 0015 0040 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0015 0016 0015 0016 003F 0016 003F 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0040 0015 0015 0016 0015 0016 0015 0015 0016 0015 05F0 0155 0055 0016 05F0";
        yellow_code = "0000 006D 0022 0002 0155 00AB 0016 003F 0016 0015 0016 0015 0015 0040 0015 0015 0016 0015 0016 003F 0016 0015 0015 0015 0016 003F 0016 003F 0016 0015 0016 003F 0016 003F 0016 0015 0015 0040 0015 0040 0015 0040 0015 0015 0016 0015 0016 003F 0016 003F 0016 003F 0016 003F 0016 0015 0015 0016 0015 0040 0015 0040 0015 0015 0016 0015 0016 0015 0015 0015 0016 05F6 0156 0055 0015 05F6";

    }

}
