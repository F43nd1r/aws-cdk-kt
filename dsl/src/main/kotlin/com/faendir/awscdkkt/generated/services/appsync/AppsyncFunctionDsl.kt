package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl AppsyncFunction.() -> Unit = {},
): AppsyncFunction = AppsyncFunction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAppsyncFunction(id: String, initializer: @AwsCdkDsl
    AppsyncFunction.Builder.() -> Unit = {}): AppsyncFunction = AppsyncFunction.Builder.create(this,
    id).apply(initializer).build()
