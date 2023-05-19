@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupPlan
import software.amazon.awscdk.services.backup.CfnBackupPlanProps
import software.constructs.Construct

public fun Construct.cfnBackupPlan(
  id: String,
  props: CfnBackupPlanProps,
  initializer: CfnBackupPlan.() -> Unit = {},
): CfnBackupPlan = CfnBackupPlan(this, id, props).apply(initializer)
