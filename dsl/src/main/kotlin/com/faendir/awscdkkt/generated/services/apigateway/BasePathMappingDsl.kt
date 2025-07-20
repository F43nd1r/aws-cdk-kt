package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.BasePathMapping
import software.amazon.awscdk.services.apigateway.BasePathMappingProps
import software.constructs.Construct

@Generated
public fun Construct.basePathMapping(
  id: String,
  props: BasePathMappingProps,
  initializer: @AwsCdkDsl BasePathMapping.() -> Unit = {},
): BasePathMapping = BasePathMapping(this, id, props).apply(initializer)

@Generated
public fun Construct.buildBasePathMapping(id: String, initializer: @AwsCdkDsl BasePathMapping.Builder.() -> Unit = {}): BasePathMapping = BasePathMapping.Builder.create(this, id).apply(initializer).build()
