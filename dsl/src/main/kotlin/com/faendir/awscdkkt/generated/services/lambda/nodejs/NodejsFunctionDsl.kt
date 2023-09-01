package com.faendir.awscdkkt.generated.services.lambda.nodejs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.nodejs.NodejsFunction
import software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps
import software.constructs.Construct

@Generated
public fun Construct.nodejsFunction(id: String, initializer: @AwsCdkDsl NodejsFunction.() -> Unit =
    {}): NodejsFunction = NodejsFunction(this, id).apply(initializer)

@Generated
public fun Construct.nodejsFunction(
  id: String,
  props: NodejsFunctionProps,
  initializer: @AwsCdkDsl NodejsFunction.() -> Unit = {},
): NodejsFunction = NodejsFunction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNodejsFunction(id: String, initializer: @AwsCdkDsl
    NodejsFunction.Builder.() -> Unit = {}): NodejsFunction = NodejsFunction.Builder.create(this,
    id).apply(initializer).build()
