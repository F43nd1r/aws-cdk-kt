package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnScheduledAction
import software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnScheduledAction(
  id: String,
  props: CfnScheduledActionProps,
  initializer: @AwsCdkDsl CfnScheduledAction.() -> Unit = {},
): CfnScheduledAction = CfnScheduledAction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnScheduledAction(id: String, initializer: @AwsCdkDsl CfnScheduledAction.Builder.() -> Unit = {}): CfnScheduledAction = CfnScheduledAction.Builder.create(this, id).apply(initializer).build()
