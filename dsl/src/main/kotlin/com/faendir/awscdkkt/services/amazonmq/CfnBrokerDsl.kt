package com.faendir.awscdkkt.services.amazonmq

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.amazonmq.CfnBroker
import software.amazon.awscdk.services.amazonmq.CfnBrokerProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBroker(
  id: String,
  props: CfnBrokerProps,
  initializer: CfnBroker.() -> Unit = {},
): CfnBroker = CfnBroker(this, id, props).apply(initializer)
