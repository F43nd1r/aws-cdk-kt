package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupSelectionOptions

@Generated
public fun backupSelectionOptions(initializer: BackupSelectionOptions.Builder.() -> Unit = {}):
    BackupSelectionOptions = BackupSelectionOptions.builder().apply(initializer).build()
