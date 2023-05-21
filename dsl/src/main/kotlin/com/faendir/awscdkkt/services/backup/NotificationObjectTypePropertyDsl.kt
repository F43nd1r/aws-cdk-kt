package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupVault

@Generated
public
    fun notificationObjectTypeProperty(initializer: CfnBackupVault.NotificationObjectTypeProperty.Builder.() -> Unit
    = {}): CfnBackupVault.NotificationObjectTypeProperty =
    CfnBackupVault.NotificationObjectTypeProperty.builder().apply(initializer).build()
