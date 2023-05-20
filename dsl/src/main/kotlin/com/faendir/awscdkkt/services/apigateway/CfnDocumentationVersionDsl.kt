@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersion
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps
import software.constructs.Construct

public fun Construct.cfnDocumentationVersion(
  id: String,
  props: CfnDocumentationVersionProps,
  initializer: CfnDocumentationVersion.() -> Unit = {},
): CfnDocumentationVersion = CfnDocumentationVersion(this, id, props).apply(initializer)
