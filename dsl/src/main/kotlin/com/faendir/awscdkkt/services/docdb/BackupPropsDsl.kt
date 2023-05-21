package com.faendir.awscdkkt.services.docdb

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.docdb.BackupProps

@Generated
public fun backupProps(initializer: BackupProps.Builder.() -> Unit = {}): BackupProps =
    BackupProps.builder().apply(initializer).build()
