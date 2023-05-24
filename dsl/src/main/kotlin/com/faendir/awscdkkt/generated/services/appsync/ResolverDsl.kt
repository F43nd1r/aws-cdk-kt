package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.Resolver
import software.amazon.awscdk.services.appsync.ResolverProps
import software.constructs.Construct

@Generated
public fun Construct.resolver(id: String, props: ResolverProps): Resolver = Resolver(this, id,
    props)

@Generated
public fun Construct.resolver(
  id: String,
  props: ResolverProps,
  initializer: @AwsCdkDsl Resolver.() -> Unit,
): Resolver = Resolver(this, id, props).apply(initializer)

@Generated
public fun Construct.buildResolver(id: String, initializer: @AwsCdkDsl Resolver.Builder.() -> Unit):
    Resolver = Resolver.Builder.create(this, id).apply(initializer).build()
