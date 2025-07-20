package com.faendir.awscdkkt.generated.services.datazone

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnSubscriptionTarget
import software.amazon.awscdk.services.datazone.CfnSubscriptionTargetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubscriptionTarget(
  id: String,
  props: CfnSubscriptionTargetProps,
  initializer: @AwsCdkDsl CfnSubscriptionTarget.() -> Unit = {},
): CfnSubscriptionTarget = CfnSubscriptionTarget(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSubscriptionTarget(id: String, initializer: @AwsCdkDsl CfnSubscriptionTarget.Builder.() -> Unit = {}): CfnSubscriptionTarget = CfnSubscriptionTarget.Builder.create(this, id).apply(initializer).build()
