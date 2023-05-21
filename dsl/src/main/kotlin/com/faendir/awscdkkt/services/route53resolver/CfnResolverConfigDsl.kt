package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverConfig
import software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResolverConfig(
  id: String,
  props: CfnResolverConfigProps,
  initializer: CfnResolverConfig.() -> Unit = {},
): CfnResolverConfig = CfnResolverConfig(this, id, props).apply(initializer)
