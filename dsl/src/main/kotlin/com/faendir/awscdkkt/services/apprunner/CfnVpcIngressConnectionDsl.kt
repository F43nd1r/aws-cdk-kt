@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps
import software.constructs.Construct

public fun Construct.cfnVpcIngressConnection(
  id: String,
  props: CfnVpcIngressConnectionProps,
  initializer: CfnVpcIngressConnection.() -> Unit = {},
): CfnVpcIngressConnection = CfnVpcIngressConnection(this, id, props).apply(initializer)
