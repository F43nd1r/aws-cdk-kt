package com.faendir.awscdkkt.services.appflow

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appflow.CfnConnector
import software.amazon.awscdk.services.appflow.CfnConnectorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConnector(
  id: String,
  props: CfnConnectorProps,
  initializer: CfnConnector.() -> Unit = {},
): CfnConnector = CfnConnector(this, id, props).apply(initializer)
