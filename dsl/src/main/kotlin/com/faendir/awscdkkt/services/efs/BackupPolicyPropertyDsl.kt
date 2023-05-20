@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnFileSystem

public fun backupPolicyProperty(initializer: CfnFileSystem.BackupPolicyProperty.Builder.() -> Unit):
    CfnFileSystem.BackupPolicyProperty =
    CfnFileSystem.BackupPolicyProperty.builder().apply(initializer).build()
