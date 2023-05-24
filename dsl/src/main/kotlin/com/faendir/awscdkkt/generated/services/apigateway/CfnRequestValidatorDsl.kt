package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnRequestValidator
import software.amazon.awscdk.services.apigateway.CfnRequestValidatorProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRequestValidator(id: String, props: CfnRequestValidatorProps):
    CfnRequestValidator = CfnRequestValidator(this, id, props)

@Generated
public fun Construct.cfnRequestValidator(
  id: String,
  props: CfnRequestValidatorProps,
  initializer: @AwsCdkDsl CfnRequestValidator.() -> Unit,
): CfnRequestValidator = CfnRequestValidator(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRequestValidator(id: String, initializer: @AwsCdkDsl
    CfnRequestValidator.Builder.() -> Unit): CfnRequestValidator =
    CfnRequestValidator.Builder.create(this, id).apply(initializer).build()
