package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupVaultProps

@Generated
public fun backupVaultProps(initializer: BackupVaultProps.Builder.() -> Unit = {}): BackupVaultProps
    = BackupVaultProps.builder().apply(initializer).build()
