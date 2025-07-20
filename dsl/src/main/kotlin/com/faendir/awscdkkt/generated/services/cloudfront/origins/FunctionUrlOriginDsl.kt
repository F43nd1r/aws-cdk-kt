package com.faendir.awscdkkt.generated.services.cloudfront.origins

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.FunctionUrlOrigin
import software.amazon.awscdk.services.lambda.IFunctionUrl

@Generated
public fun buildFunctionUrlOrigin(lambdaFunctionUrl: IFunctionUrl, initializer: @AwsCdkDsl FunctionUrlOrigin.Builder.() -> Unit = {}): FunctionUrlOrigin = FunctionUrlOrigin.Builder.create(lambdaFunctionUrl).apply(initializer).build()
