package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.EdgeLambda

@Generated
public fun buildEdgeLambda(initializer: @AwsCdkDsl EdgeLambda.Builder.() -> Unit = {}): EdgeLambda =
    EdgeLambda.Builder().apply(initializer).build()
