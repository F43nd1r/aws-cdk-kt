package com.faendir.awscdkkt.generated.services.billingconductor

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.billingconductor.CfnBillingGroup
import software.amazon.awscdk.services.billingconductor.CfnBillingGroupProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBillingGroup(id: String, props: CfnBillingGroupProps): CfnBillingGroup =
    CfnBillingGroup(this, id, props)

@Generated
public fun Construct.cfnBillingGroup(
  id: String,
  props: CfnBillingGroupProps,
  initializer: @AwsCdkDsl CfnBillingGroup.() -> Unit,
): CfnBillingGroup = CfnBillingGroup(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBillingGroup(id: String, initializer: @AwsCdkDsl
    CfnBillingGroup.Builder.() -> Unit): CfnBillingGroup = CfnBillingGroup.Builder.create(this,
    id).apply(initializer).build()
