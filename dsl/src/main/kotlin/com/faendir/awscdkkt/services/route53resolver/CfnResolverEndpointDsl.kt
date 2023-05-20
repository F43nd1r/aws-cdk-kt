@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53resolver

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps
import software.constructs.Construct

public fun Construct.cfnResolverEndpoint(
  id: String,
  props: CfnResolverEndpointProps,
  initializer: CfnResolverEndpoint.() -> Unit = {},
): CfnResolverEndpoint = CfnResolverEndpoint(this, id, props).apply(initializer)
