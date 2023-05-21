package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupPlan
import software.amazon.awscdk.services.backup.BackupPlanProps
import software.constructs.Construct

@Generated
public fun Construct.backupPlan(id: String, initializer: BackupPlan.() -> Unit = {}): BackupPlan =
    BackupPlan(this, id).apply(initializer)

@Generated
public fun Construct.backupPlan(
  id: String,
  props: BackupPlanProps,
  initializer: BackupPlan.() -> Unit = {},
): BackupPlan = BackupPlan(this, id, props).apply(initializer)
