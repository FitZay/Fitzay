package com.fitzay.workouttracker.strengthtraining.ui.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0*2\b\u0010+\u001a\u0004\u0018\u00010\u0004J\u0006\u0010,\u001a\u00020-J\b\u0010.\u001a\u00020-H\u0002J\u0010\u0010/\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\"\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\b\u00103\u001a\u0004\u0018\u00010!H\u0014J\u0012\u00104\u001a\u00020-2\b\u00105\u001a\u0004\u0018\u000106H\u0014J-\u00107\u001a\u00020-2\u0006\u00101\u001a\u00020\b2\u000e\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u0004092\u0006\u0010:\u001a\u00020;H\u0016\u00a2\u0006\u0002\u0010<J\u0010\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u00020\bH\u0002J\u0012\u0010?\u001a\u0004\u0018\u00010\u00042\u0006\u0010@\u001a\u00020\u0018H\u0002J\b\u0010A\u001a\u00020-H\u0002J\b\u0010B\u001a\u00020-H\u0002J\b\u0010C\u001a\u00020-H\u0002J\b\u0010D\u001a\u00020-H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R(\u0010\u001f\u001a\u0010\u0012\f\u0012\n \"*\u0004\u0018\u00010!0!0 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020(X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/fitzay/workouttracker/strengthtraining/ui/activities/ProfileAct;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "binding", "Lcom/fitzay/workouttracker/strengthtraining/databinding/ActivityProfileBinding;", "choicer", "", "convertCentiToFtInch_1st", "getConvertCentiToFtInch_1st", "()I", "setConvertCentiToFtInch_1st", "(I)V", "convertCentiToFtInch_2nd", "getConvertCentiToFtInch_2nd", "setConvertCentiToFtInch_2nd", "convertFtInchToCentiMeter", "", "getConvertFtInchToCentiMeter", "()D", "setConvertFtInchToCentiMeter", "(D)V", "imageBitmap", "Landroid/graphics/Bitmap;", "kgToP", "getKgToP", "setKgToP", "pToKg", "getPToKg", "setPToKg", "resultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "getResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "selectedImageUri", "Landroid/net/Uri;", "centimeterToFeet", "Lkotlin/Pair;", "centemeter", "disableBtn", "", "goToSettings", "loadImage", "onActivityResult", "requestCode", "resultCode", "data", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "openChoiceToUser", "isGalleryOrCamera", "saveUserProfilePic", "bitmap", "setDefaults", "showBothSelectorDialog", "showSettingsDialog", "showToast", "app_debug"})
public final class ProfileAct extends androidx.appcompat.app.AppCompatActivity {
    private com.fitzay.workouttracker.strengthtraining.databinding.ActivityProfileBinding binding;
    private android.graphics.Bitmap imageBitmap;
    private android.net.Uri selectedImageUri;
    private int choicer = -1;
    private final java.lang.String TAG = "Profile";
    private double convertFtInchToCentiMeter = 0.0;
    private int convertCentiToFtInch_1st = 0;
    private int convertCentiToFtInch_2nd = 0;
    private double kgToP = 0.0;
    private double pToKg = 0.0;
    @org.jetbrains.annotations.NotNull
    private androidx.activity.result.ActivityResultLauncher<android.content.Intent> resultLauncher;
    
    public ProfileAct() {
        super();
    }
    
    public final double getConvertFtInchToCentiMeter() {
        return 0.0;
    }
    
    public final void setConvertFtInchToCentiMeter(double p0) {
    }
    
    public final int getConvertCentiToFtInch_1st() {
        return 0;
    }
    
    public final void setConvertCentiToFtInch_1st(int p0) {
    }
    
    public final int getConvertCentiToFtInch_2nd() {
        return 0;
    }
    
    public final void setConvertCentiToFtInch_2nd(int p0) {
    }
    
    public final double getKgToP() {
        return 0.0;
    }
    
    public final void setKgToP(double p0) {
    }
    
    public final double getPToKg() {
        return 0.0;
    }
    
    public final void setPToKg(double p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setDefaults() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> centimeterToFeet(@org.jetbrains.annotations.Nullable
    java.lang.String centemeter) {
        return null;
    }
    
    public final void disableBtn() {
    }
    
    private final void openChoiceToUser(int isGalleryOrCamera) {
    }
    
    @java.lang.Override
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull
    int[] grantResults) {
    }
    
    @java.lang.Override
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable
    android.content.Intent data) {
    }
    
    private final void showSettingsDialog() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.activity.result.ActivityResultLauncher<android.content.Intent> getResultLauncher() {
        return null;
    }
    
    public final void setResultLauncher(@org.jetbrains.annotations.NotNull
    androidx.activity.result.ActivityResultLauncher<android.content.Intent> p0) {
    }
    
    private final void showToast() {
    }
    
    private final void goToSettings() {
    }
    
    private final void loadImage(android.graphics.Bitmap imageBitmap) {
    }
    
    private final void showBothSelectorDialog() {
    }
    
    private final java.lang.String saveUserProfilePic(android.graphics.Bitmap bitmap) {
        return null;
    }
}