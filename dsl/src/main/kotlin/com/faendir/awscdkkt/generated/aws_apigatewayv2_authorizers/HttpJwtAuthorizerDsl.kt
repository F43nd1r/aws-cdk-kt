package com.faendir.awscdkkt.generated.aws_apigatewayv2_authorizers

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer

@Generated
public fun buildHttpJwtAuthorizer(
  id: String,
  jwtIssuer: String,
  initializer: @AwsCdkDsl HttpJwtAuthorizer.Builder.() -> Unit = {},
): HttpJwtAuthorizer = HttpJwtAuthorizer.Builder.create(id, jwtIssuer).apply(initializer).build()
