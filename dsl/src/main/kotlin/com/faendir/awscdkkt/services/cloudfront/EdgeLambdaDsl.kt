@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.EdgeLambda

public fun edgeLambda(initializer: EdgeLambda.Builder.() -> Unit): EdgeLambda =
    EdgeLambda.builder().apply(initializer).build()
