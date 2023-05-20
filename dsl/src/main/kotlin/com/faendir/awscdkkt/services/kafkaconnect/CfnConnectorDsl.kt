@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kafkaconnect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kafkaconnect.CfnConnector
import software.amazon.awscdk.services.kafkaconnect.CfnConnectorProps
import software.constructs.Construct

public fun Construct.cfnConnector(
  id: String,
  props: CfnConnectorProps,
  initializer: CfnConnector.() -> Unit = {},
): CfnConnector = CfnConnector(this, id, props).apply(initializer)
