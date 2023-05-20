@file:Generated(value = ["Generated based on CDK v2.79.1"])

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
