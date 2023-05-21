package com.faendir.awscdkkt.services.apigateway

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
  initializer: BasePathMapping.() -> Unit = {},
): BasePathMapping = BasePathMapping(this, id, props).apply(initializer)
