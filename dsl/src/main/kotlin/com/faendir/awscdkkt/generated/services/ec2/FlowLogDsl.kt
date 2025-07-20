package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.FlowLog
import software.amazon.awscdk.services.ec2.FlowLogProps
import software.constructs.Construct

@Generated
public fun Construct.flowLog(
  id: String,
  props: FlowLogProps,
  initializer: @AwsCdkDsl FlowLog.() -> Unit = {},
): FlowLog = FlowLog(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFlowLog(id: String, initializer: @AwsCdkDsl FlowLog.Builder.() -> Unit = {}): FlowLog = FlowLog.Builder.create(this, id).apply(initializer).build()
