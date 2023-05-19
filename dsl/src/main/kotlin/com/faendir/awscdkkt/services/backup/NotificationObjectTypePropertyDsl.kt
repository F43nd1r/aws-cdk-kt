@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupVault

public
    fun notificationObjectTypeProperty(initializer: CfnBackupVault.NotificationObjectTypeProperty.Builder.() -> Unit):
    CfnBackupVault.NotificationObjectTypeProperty =
    CfnBackupVault.NotificationObjectTypeProperty.builder().apply(initializer).build()
