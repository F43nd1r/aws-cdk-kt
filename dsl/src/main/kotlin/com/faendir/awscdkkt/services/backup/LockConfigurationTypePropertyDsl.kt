@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupVault

public
    fun lockConfigurationTypeProperty(initializer: CfnBackupVault.LockConfigurationTypeProperty.Builder.() -> Unit):
    CfnBackupVault.LockConfigurationTypeProperty =
    CfnBackupVault.LockConfigurationTypeProperty.builder().apply(initializer).build()
