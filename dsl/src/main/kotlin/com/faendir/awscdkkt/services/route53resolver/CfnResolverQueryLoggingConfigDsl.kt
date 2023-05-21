package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResolverQueryLoggingConfig(id: String,
    initializer: CfnResolverQueryLoggingConfig.() -> Unit = {}): CfnResolverQueryLoggingConfig =
    CfnResolverQueryLoggingConfig(this, id).apply(initializer)

@Generated
public fun Construct.cfnResolverQueryLoggingConfig(
  id: String,
  props: CfnResolverQueryLoggingConfigProps,
  initializer: CfnResolverQueryLoggingConfig.() -> Unit = {},
): CfnResolverQueryLoggingConfig = CfnResolverQueryLoggingConfig(this, id, props).apply(initializer)
