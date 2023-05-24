package com.faendir.awscdkkt.generated.services.location

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.location.CfnTrackerConsumer
import software.amazon.awscdk.services.location.CfnTrackerConsumerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTrackerConsumer(id: String, props: CfnTrackerConsumerProps):
    CfnTrackerConsumer = CfnTrackerConsumer(this, id, props)

@Generated
public fun Construct.cfnTrackerConsumer(
  id: String,
  props: CfnTrackerConsumerProps,
  initializer: @AwsCdkDsl CfnTrackerConsumer.() -> Unit,
): CfnTrackerConsumer = CfnTrackerConsumer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTrackerConsumer(id: String, initializer: @AwsCdkDsl
    CfnTrackerConsumer.Builder.() -> Unit): CfnTrackerConsumer =
    CfnTrackerConsumer.Builder.create(this, id).apply(initializer).build()
