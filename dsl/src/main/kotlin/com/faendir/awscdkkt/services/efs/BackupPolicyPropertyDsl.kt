package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.CfnFileSystem

@Generated
public fun backupPolicyProperty(initializer: CfnFileSystem.BackupPolicyProperty.Builder.() -> Unit =
    {}): CfnFileSystem.BackupPolicyProperty =
    CfnFileSystem.BackupPolicyProperty.builder().apply(initializer).build()
