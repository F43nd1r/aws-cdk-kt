package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApiProps

@Generated
public fun buildRestApiProps(initializer: @AwsCdkDsl RestApiProps.Builder.() -> Unit): RestApiProps
    = RestApiProps.Builder().apply(initializer).build()
