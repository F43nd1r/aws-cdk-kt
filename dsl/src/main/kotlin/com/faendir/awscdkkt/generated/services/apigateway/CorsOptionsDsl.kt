package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CorsOptions

@Generated
public fun buildCorsOptions(initializer: @AwsCdkDsl CorsOptions.Builder.() -> Unit = {}):
    CorsOptions = CorsOptions.Builder().apply(initializer).build()
