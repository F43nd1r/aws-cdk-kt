package com.faendir.awscdkkt.generated.services.route53resolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig
import software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResolverDNSSECConfig(id: String, initializer: @AwsCdkDsl CfnResolverDNSSECConfig.() -> Unit = {}): CfnResolverDNSSECConfig = CfnResolverDNSSECConfig(this, id).apply(initializer)

@Generated
public fun Construct.cfnResolverDNSSECConfig(
  id: String,
  props: CfnResolverDNSSECConfigProps,
  initializer: @AwsCdkDsl CfnResolverDNSSECConfig.() -> Unit = {},
): CfnResolverDNSSECConfig = CfnResolverDNSSECConfig(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResolverDNSSECConfig(id: String, initializer: @AwsCdkDsl CfnResolverDNSSECConfig.Builder.() -> Unit = {}): CfnResolverDNSSECConfig = CfnResolverDNSSECConfig.Builder.create(this, id).apply(initializer).build()
