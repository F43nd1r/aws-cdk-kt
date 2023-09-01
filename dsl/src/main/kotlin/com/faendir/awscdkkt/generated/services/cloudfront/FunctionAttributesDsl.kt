package com.faendir.awscdkkt.generated.services.cloudfront

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.FunctionAttributes

@Generated
public fun buildFunctionAttributes(initializer: @AwsCdkDsl FunctionAttributes.Builder.() -> Unit =
    {}): FunctionAttributes = FunctionAttributes.Builder().apply(initializer).build()
