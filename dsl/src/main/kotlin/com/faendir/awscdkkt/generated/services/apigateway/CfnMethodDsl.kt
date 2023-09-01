package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnMethod
import software.amazon.awscdk.services.apigateway.CfnMethodProps
import software.constructs.Construct

@Generated
public fun Construct.cfnMethod(
  id: String,
  props: CfnMethodProps,
  initializer: @AwsCdkDsl CfnMethod.() -> Unit = {},
): CfnMethod = CfnMethod(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnMethod(id: String, initializer: @AwsCdkDsl CfnMethod.Builder.() -> Unit
    = {}): CfnMethod = CfnMethod.Builder.create(this, id).apply(initializer).build()
