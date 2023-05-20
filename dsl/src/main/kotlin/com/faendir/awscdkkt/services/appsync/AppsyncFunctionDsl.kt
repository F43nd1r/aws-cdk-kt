@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
