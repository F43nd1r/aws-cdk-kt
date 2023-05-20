@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codestarconnections

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codestarconnections.CfnConnection
import software.amazon.awscdk.services.codestarconnections.CfnConnectionProps
import software.constructs.Construct

public fun Construct.cfnConnection(
  id: String,
  props: CfnConnectionProps,
  initializer: CfnConnection.() -> Unit = {},
): CfnConnection = CfnConnection(this, id, props).apply(initializer)
