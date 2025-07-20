package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RequestValidator
import software.amazon.awscdk.services.apigateway.RequestValidatorProps
import software.constructs.Construct

@Generated
public fun Construct.requestValidator(
  id: String,
  props: RequestValidatorProps,
  initializer: @AwsCdkDsl RequestValidator.() -> Unit = {},
): RequestValidator = RequestValidator(this, id, props).apply(initializer)

@Generated
public fun Construct.buildRequestValidator(id: String, initializer: @AwsCdkDsl RequestValidator.Builder.() -> Unit = {}): RequestValidator = RequestValidator.Builder.create(this, id).apply(initializer).build()
