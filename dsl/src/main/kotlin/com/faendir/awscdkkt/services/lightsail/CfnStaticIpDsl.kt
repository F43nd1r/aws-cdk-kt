package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnStaticIp
import software.amazon.awscdk.services.lightsail.CfnStaticIpProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStaticIp(
  id: String,
  props: CfnStaticIpProps,
  initializer: CfnStaticIp.() -> Unit = {},
): CfnStaticIp = CfnStaticIp(this, id, props).apply(initializer)
