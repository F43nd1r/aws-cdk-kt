package com.faendir.awscdkkt.generated.services.cloudfront.origins

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.FunctionUrlOriginProps

@Generated
public fun buildFunctionUrlOriginProps(initializer: @AwsCdkDsl
    FunctionUrlOriginProps.Builder.() -> Unit = {}): FunctionUrlOriginProps =
    FunctionUrlOriginProps.Builder().apply(initializer).build()
