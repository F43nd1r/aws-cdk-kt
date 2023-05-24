package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionUrl
import software.amazon.awscdk.services.lambda.FunctionUrlProps
import software.constructs.Construct

@Generated
public fun Construct.functionUrl(id: String, props: FunctionUrlProps): FunctionUrl =
    FunctionUrl(this, id, props)

@Generated
public fun Construct.functionUrl(
  id: String,
  props: FunctionUrlProps,
  initializer: @AwsCdkDsl FunctionUrl.() -> Unit,
): FunctionUrl = FunctionUrl(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFunctionUrl(id: String, initializer: @AwsCdkDsl
    FunctionUrl.Builder.() -> Unit): FunctionUrl = FunctionUrl.Builder.create(this,
    id).apply(initializer).build()
