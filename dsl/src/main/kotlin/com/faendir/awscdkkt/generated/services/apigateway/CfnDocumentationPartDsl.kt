package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnDocumentationPart.() -> Unit = {},
): CfnDocumentationPart = CfnDocumentationPart(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDocumentationPart(id: String, initializer: @AwsCdkDsl CfnDocumentationPart.Builder.() -> Unit = {}): CfnDocumentationPart = CfnDocumentationPart.Builder.create(this, id).apply(initializer).build()
