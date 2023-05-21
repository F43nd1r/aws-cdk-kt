package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupVault

@Generated
public
    fun lockConfigurationTypeProperty(initializer: CfnBackupVault.LockConfigurationTypeProperty.Builder.() -> Unit
    = {}): CfnBackupVault.LockConfigurationTypeProperty =
    CfnBackupVault.LockConfigurationTypeProperty.builder().apply(initializer).build()
