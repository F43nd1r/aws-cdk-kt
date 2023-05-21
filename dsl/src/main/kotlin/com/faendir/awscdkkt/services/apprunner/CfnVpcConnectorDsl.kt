package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnVpcConnector
import software.amazon.awscdk.services.apprunner.CfnVpcConnectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVpcConnector(
  id: String,
  props: CfnVpcConnectorProps,
  initializer: CfnVpcConnector.() -> Unit = {},
): CfnVpcConnector = CfnVpcConnector(this, id, props).apply(initializer)
