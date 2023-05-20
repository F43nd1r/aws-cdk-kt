@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnDNSSEC
import software.amazon.awscdk.services.route53.CfnDNSSECProps
import software.constructs.Construct

public fun Construct.cfnDNSSEC(
  id: String,
  props: CfnDNSSECProps,
  initializer: CfnDNSSEC.() -> Unit = {},
): CfnDNSSEC = CfnDNSSEC(this, id, props).apply(initializer)
