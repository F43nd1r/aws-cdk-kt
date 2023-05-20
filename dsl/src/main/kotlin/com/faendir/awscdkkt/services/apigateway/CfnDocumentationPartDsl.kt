@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDocumentationPart
import software.amazon.awscdk.services.apigateway.CfnDocumentationPartProps
import software.constructs.Construct

public fun Construct.cfnDocumentationPart(
  id: String,
  props: CfnDocumentationPartProps,
  initializer: CfnDocumentationPart.() -> Unit = {},
): CfnDocumentationPart = CfnDocumentationPart(this, id, props).apply(initializer)
