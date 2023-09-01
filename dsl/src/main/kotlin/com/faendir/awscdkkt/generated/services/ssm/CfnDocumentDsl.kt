package com.faendir.awscdkkt.generated.services.ssm

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ssm.CfnDocument
import software.amazon.awscdk.services.ssm.CfnDocumentProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDocument(
  id: String,
  props: CfnDocumentProps,
  initializer: @AwsCdkDsl CfnDocument.() -> Unit = {},
): CfnDocument = CfnDocument(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDocument(id: String, initializer: @AwsCdkDsl
    CfnDocument.Builder.() -> Unit = {}): CfnDocument = CfnDocument.Builder.create(this,
    id).apply(initializer).build()
