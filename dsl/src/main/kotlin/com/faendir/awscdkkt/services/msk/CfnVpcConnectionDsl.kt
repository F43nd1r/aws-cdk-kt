@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.msk

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.msk.CfnVpcConnection
import software.amazon.awscdk.services.msk.CfnVpcConnectionProps
import software.constructs.Construct

public fun Construct.cfnVpcConnection(
  id: String,
  props: CfnVpcConnectionProps,
  initializer: CfnVpcConnection.() -> Unit = {},
): CfnVpcConnection = CfnVpcConnection(this, id, props).apply(initializer)
