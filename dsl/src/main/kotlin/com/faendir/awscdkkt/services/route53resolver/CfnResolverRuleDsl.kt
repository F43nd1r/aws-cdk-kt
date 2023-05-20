@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverRule
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps
import software.constructs.Construct

public fun Construct.cfnResolverRule(
  id: String,
  props: CfnResolverRuleProps,
  initializer: CfnResolverRule.() -> Unit = {},
): CfnResolverRule = CfnResolverRule(this, id, props).apply(initializer)
