package com.faendir.awscdkkt.generated.services.gamelift

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueue
import software.amazon.awscdk.services.gamelift.CfnGameSessionQueueProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGameSessionQueue(
  id: String,
  props: CfnGameSessionQueueProps,
  initializer: @AwsCdkDsl CfnGameSessionQueue.() -> Unit = {},
): CfnGameSessionQueue = CfnGameSessionQueue(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGameSessionQueue(id: String, initializer: @AwsCdkDsl CfnGameSessionQueue.Builder.() -> Unit = {}): CfnGameSessionQueue = CfnGameSessionQueue.Builder.create(this, id).apply(initializer).build()
