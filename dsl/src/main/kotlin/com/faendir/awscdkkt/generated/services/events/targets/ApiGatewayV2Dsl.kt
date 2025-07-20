package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.IHttpApi
import software.amazon.awscdk.services.events.targets.ApiGatewayV2

@Generated
public fun buildApiGatewayV2(httpApi: IHttpApi, initializer: @AwsCdkDsl ApiGatewayV2.Builder.() -> Unit = {}): ApiGatewayV2 = ApiGatewayV2.Builder.create(httpApi).apply(initializer).build()
