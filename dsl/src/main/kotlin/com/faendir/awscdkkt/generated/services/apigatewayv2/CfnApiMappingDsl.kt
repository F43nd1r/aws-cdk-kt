package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApiMapping
import software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApiMapping(
  id: String,
  props: CfnApiMappingProps,
  initializer: @AwsCdkDsl CfnApiMapping.() -> Unit = {},
): CfnApiMapping = CfnApiMapping(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApiMapping(id: String, initializer: @AwsCdkDsl CfnApiMapping.Builder.() -> Unit = {}): CfnApiMapping = CfnApiMapping.Builder.create(this, id).apply(initializer).build()
