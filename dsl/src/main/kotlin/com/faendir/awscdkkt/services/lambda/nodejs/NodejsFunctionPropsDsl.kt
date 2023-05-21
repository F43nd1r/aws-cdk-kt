package com.faendir.awscdkkt.services.lambda.nodejs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.nodejs.NodejsFunctionProps

@Generated
public fun nodejsFunctionProps(initializer: NodejsFunctionProps.Builder.() -> Unit = {}):
    NodejsFunctionProps = NodejsFunctionProps.builder().apply(initializer).build()
