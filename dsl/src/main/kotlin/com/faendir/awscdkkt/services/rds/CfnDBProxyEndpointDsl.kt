@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBProxyEndpoint
import software.amazon.awscdk.services.rds.CfnDBProxyEndpointProps
import software.constructs.Construct

public fun Construct.cfnDBProxyEndpoint(
  id: String,
  props: CfnDBProxyEndpointProps,
  initializer: CfnDBProxyEndpoint.() -> Unit = {},
): CfnDBProxyEndpoint = CfnDBProxyEndpoint(this, id, props).apply(initializer)
