package com.faendir.awscdkkt.generated.services.route53resolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfig
import software.amazon.awscdk.services.route53resolver.CfnResolverQueryLoggingConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResolverQueryLoggingConfig(id: String,
    props: CfnResolverQueryLoggingConfigProps): CfnResolverQueryLoggingConfig =
    CfnResolverQueryLoggingConfig(this, id, props)

@Generated
public fun Construct.cfnResolverQueryLoggingConfig(
  id: String,
  props: CfnResolverQueryLoggingConfigProps,
  initializer: @AwsCdkDsl CfnResolverQueryLoggingConfig.() -> Unit,
): CfnResolverQueryLoggingConfig = CfnResolverQueryLoggingConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnResolverQueryLoggingConfig(id: String): CfnResolverQueryLoggingConfig =
    CfnResolverQueryLoggingConfig(this, id)

@Generated
public fun Construct.cfnResolverQueryLoggingConfig(id: String, initializer: @AwsCdkDsl
    CfnResolverQueryLoggingConfig.() -> Unit): CfnResolverQueryLoggingConfig =
    CfnResolverQueryLoggingConfig(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnResolverQueryLoggingConfig(id: String, initializer: @AwsCdkDsl
    CfnResolverQueryLoggingConfig.Builder.() -> Unit): CfnResolverQueryLoggingConfig =
    CfnResolverQueryLoggingConfig.Builder.create(this, id).apply(initializer).build()
