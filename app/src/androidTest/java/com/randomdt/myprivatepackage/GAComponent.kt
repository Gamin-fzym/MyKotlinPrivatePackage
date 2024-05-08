package com.randomdt.myprivatepackage

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.window.DialogProperties

@Composable
fun GAComponent(text: String) {
    // 使用 remember 保存弹窗的状态
    val openDialog = remember { mutableStateOf(true) }

    // 如果弹窗状态为开启，则显示弹窗
    if (openDialog.value) {
        AlertDialog(
            onDismissRequest = {
                // 当外部点击或弹窗被程序关闭时更改状态
                openDialog.value = false
            },
            title = {
                Text(text = "Alert")
            },
            text = {
                Text(text)
            },
            confirmButton = {
                Button(
                    onClick = {
                        openDialog.value = false // 关闭弹窗
                    }) {
                    Text("OK")
                }
            },
            properties = DialogProperties(dismissOnBackPress = true, dismissOnClickOutside = true)
        )
    }
}