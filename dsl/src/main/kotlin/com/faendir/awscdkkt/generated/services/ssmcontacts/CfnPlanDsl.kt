package com.faendir.awscdkkt.generated.services.ssmcontacts

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnPlan
import software.amazon.awscdk.services.ssmcontacts.CfnPlanProps
import software.constructs.Construct

@Generated
public fun Construct.cfnPlan(id: String, props: CfnPlanProps): CfnPlan = CfnPlan(this, id, props)

@Generated
public fun Construct.cfnPlan(
  id: String,
  props: CfnPlanProps,
  initializer: @AwsCdkDsl CfnPlan.() -> Unit,
): CfnPlan = CfnPlan(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnPlan(id: String, initializer: @AwsCdkDsl CfnPlan.Builder.() -> Unit):
    CfnPlan = CfnPlan.Builder.create(this, id).apply(initializer).build()
