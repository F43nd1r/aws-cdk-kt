package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnResolver
import software.amazon.awscdk.services.appsync.CfnResolverProps
import software.constructs.Construct

@Generated
public fun Construct.cfnResolver(
  id: String,
  props: CfnResolverProps,
  initializer: @AwsCdkDsl CfnResolver.() -> Unit = {},
): CfnResolver = CfnResolver(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnResolver(id: String, initializer: @AwsCdkDsl CfnResolver.Builder.() -> Unit = {}): CfnResolver = CfnResolver.Builder.create(this, id).apply(initializer).build()
