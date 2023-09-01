package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Method
import software.amazon.awscdk.services.apigateway.MethodProps
import software.constructs.Construct

@Generated
public fun Construct.method(
  id: String,
  props: MethodProps,
  initializer: @AwsCdkDsl Method.() -> Unit = {},
): Method = Method(this, id, props).apply(initializer)

@Generated
public fun Construct.buildMethod(id: String, initializer: @AwsCdkDsl Method.Builder.() -> Unit =
    {}): Method = Method.Builder.create(this, id).apply(initializer).build()
