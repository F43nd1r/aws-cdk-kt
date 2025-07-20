package com.faendir.awscdkkt.generated.aws_apigatewayv2_authorizers

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer
import software.amazon.awscdk.services.cognito.IUserPool

@Generated
public fun buildHttpUserPoolAuthorizer(
  id: String,
  pool: IUserPool,
  initializer: @AwsCdkDsl HttpUserPoolAuthorizer.Builder.() -> Unit = {},
): HttpUserPoolAuthorizer = HttpUserPoolAuthorizer.Builder.create(id, pool).apply(initializer).build()
