@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnFileSystem

public fun backupPolicyProperty(initializer: CfnFileSystem.BackupPolicyProperty.Builder.() -> Unit):
    CfnFileSystem.BackupPolicyProperty =
    CfnFileSystem.BackupPolicyProperty.builder().apply(initializer).build()
