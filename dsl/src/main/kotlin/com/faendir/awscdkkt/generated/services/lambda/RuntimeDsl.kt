package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.Runtime
import software.amazon.awscdk.services.lambda.RuntimeFamily

@Generated
public fun buildRuntime(name: String, initializer: @AwsCdkDsl Runtime.Builder.() -> Unit = {}):
    Runtime = Runtime.Builder.create(name).apply(initializer).build()

@Generated
public fun buildRuntime(
  name: String,
  family: RuntimeFamily,
  initializer: @AwsCdkDsl Runtime.Builder.() -> Unit = {},
): Runtime = Runtime.Builder.create(name, family).apply(initializer).build()
