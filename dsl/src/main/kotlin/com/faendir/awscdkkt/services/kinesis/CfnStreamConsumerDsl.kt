package com.faendir.awscdkkt.services.kinesis

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.CfnStreamConsumer
import software.amazon.awscdk.services.kinesis.CfnStreamConsumerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStreamConsumer(
  id: String,
  props: CfnStreamConsumerProps,
  initializer: CfnStreamConsumer.() -> Unit = {},
): CfnStreamConsumer = CfnStreamConsumer(this, id, props).apply(initializer)
