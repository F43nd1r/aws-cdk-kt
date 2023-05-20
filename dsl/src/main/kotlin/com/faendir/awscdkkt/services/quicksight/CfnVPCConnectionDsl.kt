@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnVPCConnection
import software.amazon.awscdk.services.quicksight.CfnVPCConnectionProps
import software.constructs.Construct

public fun Construct.cfnVPCConnection(id: String, initializer: CfnVPCConnection.() -> Unit = {}):
    CfnVPCConnection = CfnVPCConnection(this, id).apply(initializer)

public fun Construct.cfnVPCConnection(
  id: String,
  props: CfnVPCConnectionProps,
  initializer: CfnVPCConnection.() -> Unit = {},
): CfnVPCConnection = CfnVPCConnection(this, id, props).apply(initializer)
