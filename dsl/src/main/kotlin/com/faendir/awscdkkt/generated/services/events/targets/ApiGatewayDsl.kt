package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RestApi
import software.amazon.awscdk.services.events.targets.ApiGateway
import software.amazon.awscdk.services.events.targets.ApiGatewayProps

@Generated
public fun apiGateway(restApi: RestApi): ApiGateway = ApiGateway(restApi)

@Generated
public fun apiGateway(restApi: RestApi, props: ApiGatewayProps): ApiGateway = ApiGateway(restApi,
    props)

@Generated
public fun buildApiGateway(restApi: RestApi, initializer: @AwsCdkDsl ApiGateway.Builder.() -> Unit):
    ApiGateway = ApiGateway.Builder.create(restApi).apply(initializer).build()
