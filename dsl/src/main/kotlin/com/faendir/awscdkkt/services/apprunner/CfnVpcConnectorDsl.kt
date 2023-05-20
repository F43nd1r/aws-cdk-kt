@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnVpcConnector
import software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps
import software.constructs.Construct

public fun Construct.cfnVpcConnector(
  id: String,
  props: CfnVpcConnectorProps,
  initializer: CfnVpcConnector.() -> Unit = {},
): CfnVpcConnector = CfnVpcConnector(this, id, props).apply(initializer)
