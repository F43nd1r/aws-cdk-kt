package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnBackupPlan
import software.amazon.awscdk.services.backup.CfnBackupPlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBackupPlan(
  id: String,
  props: CfnBackupPlanProps,
  initializer: @AwsCdkDsl CfnBackupPlan.() -> Unit = {},
): CfnBackupPlan = CfnBackupPlan(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBackupPlan(id: String, initializer: @AwsCdkDsl CfnBackupPlan.Builder.() -> Unit = {}): CfnBackupPlan = CfnBackupPlan.Builder.create(this, id).apply(initializer).build()
