package com.faendir.awscdkkt.generated.services.cloudfront.origins

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.cloudfront.origins.RestApiOrigin
import software.amazon.awscdk.services.cloudfront.origins.RestApiOriginProps

@Generated
public fun restApiOrigin(restApi: RestApi): RestApiOrigin = RestApiOrigin(restApi)

@Generated
public fun restApiOrigin(restApi: RestApi, props: RestApiOriginProps): RestApiOrigin =
    RestApiOrigin(restApi, props)

@Generated
public fun buildRestApiOrigin(restApi: RestApi, initializer: @AwsCdkDsl
    RestApiOrigin.Builder.() -> Unit): RestApiOrigin =
    RestApiOrigin.Builder.create(restApi).apply(initializer).build()
