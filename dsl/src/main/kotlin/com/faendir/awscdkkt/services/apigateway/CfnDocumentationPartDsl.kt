package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDocumentationPart(
  id: String,
  props: CfnDocumentationPartProps,
  initializer: CfnDocumentationPart.() -> Unit = {},
): CfnDocumentationPart = CfnDocumentationPart(this, id, props).apply(initializer)
