package com.faendir.awscdkkt.generated.services.route53globalresolver

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53globalresolver.CfnGlobalResolver
import software.amazon.awscdk.services.route53globalresolver.CfnGlobalResolverProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGlobalResolver(
  id: String,
  props: CfnGlobalResolverProps,
  initializer: @AwsCdkDsl CfnGlobalResolver.() -> Unit = {},
): CfnGlobalResolver = CfnGlobalResolver(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGlobalResolver(id: String, initializer: @AwsCdkDsl CfnGlobalResolver.Builder.() -> Unit = {}): CfnGlobalResolver = CfnGlobalResolver.Builder.create(this, id).apply(initializer).build()
