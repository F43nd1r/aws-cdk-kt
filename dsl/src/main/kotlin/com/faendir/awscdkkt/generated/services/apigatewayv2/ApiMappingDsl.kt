package com.faendir.awscdkkt.generated.services.apigatewayv2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.ApiMapping
import software.amazon.awscdk.services.apigatewayv2.ApiMappingProps
import software.constructs.Construct

@Generated
public fun Construct.apiMapping(
  id: String,
  props: ApiMappingProps,
  initializer: @AwsCdkDsl ApiMapping.() -> Unit = {},
): ApiMapping = ApiMapping(this, id, props).apply(initializer)

@Generated
public fun Construct.buildApiMapping(id: String, initializer: @AwsCdkDsl
    ApiMapping.Builder.() -> Unit = {}): ApiMapping = ApiMapping.Builder.create(this,
    id).apply(initializer).build()
