package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.IRestApi
import software.amazon.awscdk.services.events.targets.ApiGateway

@Generated
public fun buildApiGateway(restApi: IRestApi, initializer: @AwsCdkDsl ApiGateway.Builder.() -> Unit = {}): ApiGateway = ApiGateway.Builder.create(restApi).apply(initializer).build()
