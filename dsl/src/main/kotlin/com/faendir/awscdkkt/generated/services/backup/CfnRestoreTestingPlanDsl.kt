package com.faendir.awscdkkt.generated.services.backup

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.backup.CfnRestoreTestingPlan
import software.amazon.awscdk.services.backup.CfnRestoreTestingPlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRestoreTestingPlan(
  id: String,
  props: CfnRestoreTestingPlanProps,
  initializer: @AwsCdkDsl CfnRestoreTestingPlan.() -> Unit = {},
): CfnRestoreTestingPlan = CfnRestoreTestingPlan(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRestoreTestingPlan(id: String, initializer: @AwsCdkDsl
    CfnRestoreTestingPlan.Builder.() -> Unit = {}): CfnRestoreTestingPlan =
    CfnRestoreTestingPlan.Builder.create(this, id).apply(initializer).build()
