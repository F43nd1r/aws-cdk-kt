package com.faendir.awscdkkt.generated.services.deadline

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.deadline.CfnQueueEnvironment
import software.amazon.awscdk.services.deadline.CfnQueueEnvironmentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnQueueEnvironment(
  id: String,
  props: CfnQueueEnvironmentProps,
  initializer: @AwsCdkDsl CfnQueueEnvironment.() -> Unit = {},
): CfnQueueEnvironment = CfnQueueEnvironment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnQueueEnvironment(id: String, initializer: @AwsCdkDsl
    CfnQueueEnvironment.Builder.() -> Unit = {}): CfnQueueEnvironment =
    CfnQueueEnvironment.Builder.create(this, id).apply(initializer).build()
