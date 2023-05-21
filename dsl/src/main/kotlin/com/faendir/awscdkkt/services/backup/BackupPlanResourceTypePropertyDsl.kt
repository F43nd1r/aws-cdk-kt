package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupPlan

@Generated
public
    fun backupPlanResourceTypeProperty(initializer: CfnBackupPlan.BackupPlanResourceTypeProperty.Builder.() -> Unit
    = {}): CfnBackupPlan.BackupPlanResourceTypeProperty =
    CfnBackupPlan.BackupPlanResourceTypeProperty.builder().apply(initializer).build()
