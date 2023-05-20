@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHealthCheck
import software.amazon.awscdk.services.route53.CfnHealthCheckProps
import software.constructs.Construct

public fun Construct.cfnHealthCheck(
  id: String,
  props: CfnHealthCheckProps,
  initializer: CfnHealthCheck.() -> Unit = {},
): CfnHealthCheck = CfnHealthCheck(this, id, props).apply(initializer)
