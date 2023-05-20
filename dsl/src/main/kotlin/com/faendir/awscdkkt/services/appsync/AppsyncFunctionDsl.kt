@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.AppsyncFunction
import software.amazon.awscdk.services.appsync.AppsyncFunctionProps
import software.constructs.Construct

public fun Construct.appsyncFunction(
  id: String,
  props: AppsyncFunctionProps,
  initializer: AppsyncFunction.() -> Unit = {},
): AppsyncFunction = AppsyncFunction(this, id, props).apply(initializer)
