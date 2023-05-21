package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.BackupProps

@Generated
public fun backupProps(initializer: BackupProps.Builder.() -> Unit = {}): BackupProps =
    BackupProps.builder().apply(initializer).build()
