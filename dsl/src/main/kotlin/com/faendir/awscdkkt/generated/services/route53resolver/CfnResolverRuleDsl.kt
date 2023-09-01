package com.faendir.awscdkkt.generated.services.route53resolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverRule
import software.amazon.awscdk.services.route53resolver.CfnResolverRuleProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResolverRule(
  id: String,
  props: CfnResolverRuleProps,
  initializer: @AwsCdkDsl CfnResolverRule.() -> Unit = {},
): CfnResolverRule = CfnResolverRule(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResolverRule(id: String, initializer: @AwsCdkDsl
    CfnResolverRule.Builder.() -> Unit = {}): CfnResolverRule = CfnResolverRule.Builder.create(this,
    id).apply(initializer).build()
