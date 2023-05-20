@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.BasePathMapping
import software.amazon.awscdk.services.apigateway.BasePathMappingProps
import software.constructs.Construct

public fun Construct.basePathMapping(
  id: String,
  props: BasePathMappingProps,
  initializer: BasePathMapping.() -> Unit = {},
): BasePathMapping = BasePathMapping(this, id, props).apply(initializer)
