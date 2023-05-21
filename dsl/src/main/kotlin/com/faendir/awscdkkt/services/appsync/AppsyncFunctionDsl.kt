package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AppsyncFunction
import software.amazon.awscdk.services.appsync.AppsyncFunctionProps
import software.constructs.Construct

@Generated
public fun Construct.appsyncFunction(
  id: String,
  props: AppsyncFunctionProps,
  initializer: AppsyncFunction.() -> Unit = {},
): AppsyncFunction = AppsyncFunction(this, id, props).apply(initializer)
