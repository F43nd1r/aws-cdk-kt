@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
