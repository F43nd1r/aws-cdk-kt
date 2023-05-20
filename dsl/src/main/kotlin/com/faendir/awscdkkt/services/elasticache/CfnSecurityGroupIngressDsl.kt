@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticache

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngress
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps
import software.constructs.Construct

public fun Construct.cfnSecurityGroupIngress(
  id: String,
  props: CfnSecurityGroupIngressProps,
  initializer: CfnSecurityGroupIngress.() -> Unit = {},
): CfnSecurityGroupIngress = CfnSecurityGroupIngress(this, id, props).apply(initializer)
