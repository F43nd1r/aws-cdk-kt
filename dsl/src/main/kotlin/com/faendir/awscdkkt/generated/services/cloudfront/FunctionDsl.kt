package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.Function
import software.amazon.awscdk.services.cloudfront.FunctionProps
import software.constructs.Construct

@Generated
public fun Construct.function(id: String, props: FunctionProps): Function = Function(this, id,
    props)

@Generated
public fun Construct.function(
  id: String,
  props: FunctionProps,
  initializer: @AwsCdkDsl Function.() -> Unit,
): Function = Function(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFunction(id: String, initializer: @AwsCdkDsl Function.Builder.() -> Unit):
    Function = Function.Builder.create(this, id).apply(initializer).build()
