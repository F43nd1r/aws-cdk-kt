@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
