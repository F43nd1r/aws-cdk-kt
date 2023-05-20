@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
