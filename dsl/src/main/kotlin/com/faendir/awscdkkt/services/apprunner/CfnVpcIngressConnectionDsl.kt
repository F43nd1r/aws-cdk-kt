package com.faendir.awscdkkt.services.apprunner

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnection
import software.amazon.awscdk.services.apprunner.CfnVpcIngressConnectionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVpcIngressConnection(
  id: String,
  props: CfnVpcIngressConnectionProps,
  initializer: CfnVpcIngressConnection.() -> Unit = {},
): CfnVpcIngressConnection = CfnVpcIngressConnection(this, id, props).apply(initializer)
