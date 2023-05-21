package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupPlanProps

@Generated
public fun backupPlanProps(initializer: BackupPlanProps.Builder.() -> Unit = {}): BackupPlanProps =
    BackupPlanProps.builder().apply(initializer).build()
