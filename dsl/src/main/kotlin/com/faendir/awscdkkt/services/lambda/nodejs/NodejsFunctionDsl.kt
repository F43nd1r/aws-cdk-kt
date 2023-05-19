@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda.nodejs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.nodejs.NodejsFunction
import software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps
import software.constructs.Construct

public fun Construct.nodejsFunction(id: String, initializer: NodejsFunction.() -> Unit = {}):
    NodejsFunction = NodejsFunction(this, id).apply(initializer)

public fun Construct.nodejsFunction(
  id: String,
  props: NodejsFunctionProps,
  initializer: NodejsFunction.() -> Unit = {},
): NodejsFunction = NodejsFunction(this, id, props).apply(initializer)
