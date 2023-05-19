@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
