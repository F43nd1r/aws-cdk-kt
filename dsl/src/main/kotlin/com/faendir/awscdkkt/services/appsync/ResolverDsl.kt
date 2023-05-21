package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.Resolver
import software.amazon.awscdk.services.appsync.ResolverProps
import software.constructs.Construct

@Generated
public fun Construct.resolver(
  id: String,
  props: ResolverProps,
  initializer: Resolver.() -> Unit = {},
): Resolver = Resolver(this, id, props).apply(initializer)
