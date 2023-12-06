package com.faendir.awscdkkt.generated.services.cloudfront.origins

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApiBase
import software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin

@Generated
public fun buildRestApiOrigin(restApi: RestApiBase, initializer: @AwsCdkDsl
    RestApiOrigin.Builder.() -> Unit = {}): RestApiOrigin =
    RestApiOrigin.Builder.create(restApi).apply(initializer).build()
