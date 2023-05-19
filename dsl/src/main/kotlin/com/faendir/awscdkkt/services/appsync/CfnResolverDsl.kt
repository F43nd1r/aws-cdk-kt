@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnResolver
import software.amazon.awscdk.services.appsync.CfnResolverProps
import software.constructs.Construct

public fun Construct.cfnResolver(
  id: String,
  props: CfnResolverProps,
  initializer: CfnResolver.() -> Unit = {},
): CfnResolver = CfnResolver(this, id, props).apply(initializer)
