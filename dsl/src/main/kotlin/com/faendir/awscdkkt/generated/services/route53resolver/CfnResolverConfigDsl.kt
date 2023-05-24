package com.faendir.awscdkkt.generated.services.route53resolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverConfig
import software.amazon.awscdk.services.route53resolver.CfnResolverConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResolverConfig(id: String, props: CfnResolverConfigProps): CfnResolverConfig
    = CfnResolverConfig(this, id, props)

@Generated
public fun Construct.cfnResolverConfig(
  id: String,
  props: CfnResolverConfigProps,
  initializer: @AwsCdkDsl CfnResolverConfig.() -> Unit,
): CfnResolverConfig = CfnResolverConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResolverConfig(id: String, initializer: @AwsCdkDsl
    CfnResolverConfig.Builder.() -> Unit): CfnResolverConfig =
    CfnResolverConfig.Builder.create(this, id).apply(initializer).build()
