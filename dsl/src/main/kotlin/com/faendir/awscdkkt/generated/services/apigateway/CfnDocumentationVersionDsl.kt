package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersion
import software.amazon.awscdk.services.apigateway.CfnDocumentationVersionProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDocumentationVersion(
  id: String,
  props: CfnDocumentationVersionProps,
  initializer: @AwsCdkDsl CfnDocumentationVersion.() -> Unit = {},
): CfnDocumentationVersion = CfnDocumentationVersion(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDocumentationVersion(id: String, initializer: @AwsCdkDsl
    CfnDocumentationVersion.Builder.() -> Unit = {}): CfnDocumentationVersion =
    CfnDocumentationVersion.Builder.create(this, id).apply(initializer).build()
