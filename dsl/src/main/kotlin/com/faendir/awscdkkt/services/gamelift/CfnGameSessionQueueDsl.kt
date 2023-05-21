package com.faendir.awscdkkt.services.gamelift

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
  initializer: CfnGameSessionQueue.() -> Unit = {},
): CfnGameSessionQueue = CfnGameSessionQueue(this, id, props).apply(initializer)
