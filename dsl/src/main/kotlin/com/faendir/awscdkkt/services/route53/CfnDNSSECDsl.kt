@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
