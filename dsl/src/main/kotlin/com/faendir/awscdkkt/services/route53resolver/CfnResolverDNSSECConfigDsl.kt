@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig
import software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfigProps
import software.constructs.Construct

public fun Construct.cfnResolverDNSSECConfig(
  id: String,
  props: CfnResolverDNSSECConfigProps,
  initializer: CfnResolverDNSSECConfig.() -> Unit = {},
): CfnResolverDNSSECConfig = CfnResolverDNSSECConfig(this, id, props).apply(initializer)

public fun Construct.cfnResolverDNSSECConfig(id: String,
    initializer: CfnResolverDNSSECConfig.() -> Unit = {}): CfnResolverDNSSECConfig =
    CfnResolverDNSSECConfig(this, id).apply(initializer)
