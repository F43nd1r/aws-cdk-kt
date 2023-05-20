@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.BackupPlan
import software.amazon.awscdk.services.backup.BackupPlanProps
import software.constructs.Construct

public fun Construct.backupPlan(id: String, initializer: BackupPlan.() -> Unit = {}): BackupPlan =
    BackupPlan(this, id).apply(initializer)

public fun Construct.backupPlan(
  id: String,
  props: BackupPlanProps,
  initializer: BackupPlan.() -> Unit = {},
): BackupPlan = BackupPlan(this, id, props).apply(initializer)
