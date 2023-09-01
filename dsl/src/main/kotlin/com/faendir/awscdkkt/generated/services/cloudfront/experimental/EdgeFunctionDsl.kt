package com.faendir.awscdkkt.generated.services.cloudfront.experimental

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.experimental.EdgeFunction
import software.amazon.awscdk.services.cloudfront.experimental.EdgeFunctionProps
import software.constructs.Construct

@Generated
public fun Construct.edgeFunction(
  id: String,
  props: EdgeFunctionProps,
  initializer: @AwsCdkDsl EdgeFunction.() -> Unit = {},
): EdgeFunction = EdgeFunction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEdgeFunction(id: String, initializer: @AwsCdkDsl
    EdgeFunction.Builder.() -> Unit = {}): EdgeFunction = EdgeFunction.Builder.create(this,
    id).apply(initializer).build()
