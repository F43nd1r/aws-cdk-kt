package com.faendir.awscdkkt.generated.services.route53resolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpoint
import software.amazon.awscdk.services.route53resolver.CfnResolverEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResolverEndpoint(id: String, props: CfnResolverEndpointProps):
    CfnResolverEndpoint = CfnResolverEndpoint(this, id, props)

@Generated
public fun Construct.cfnResolverEndpoint(
  id: String,
  props: CfnResolverEndpointProps,
  initializer: @AwsCdkDsl CfnResolverEndpoint.() -> Unit,
): CfnResolverEndpoint = CfnResolverEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResolverEndpoint(id: String, initializer: @AwsCdkDsl
    CfnResolverEndpoint.Builder.() -> Unit): CfnResolverEndpoint =
    CfnResolverEndpoint.Builder.create(this, id).apply(initializer).build()
