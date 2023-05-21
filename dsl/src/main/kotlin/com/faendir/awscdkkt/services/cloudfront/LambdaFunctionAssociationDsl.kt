package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation

@Generated
public fun lambdaFunctionAssociation(initializer: LambdaFunctionAssociation.Builder.() -> Unit =
    {}): LambdaFunctionAssociation = LambdaFunctionAssociation.builder().apply(initializer).build()
