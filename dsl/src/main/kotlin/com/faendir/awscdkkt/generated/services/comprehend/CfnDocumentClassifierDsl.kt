package com.faendir.awscdkkt.generated.services.comprehend

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDocumentClassifier(
  id: String,
  props: CfnDocumentClassifierProps,
  initializer: @AwsCdkDsl CfnDocumentClassifier.() -> Unit = {},
): CfnDocumentClassifier = CfnDocumentClassifier(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDocumentClassifier(id: String, initializer: @AwsCdkDsl CfnDocumentClassifier.Builder.() -> Unit = {}): CfnDocumentClassifier = CfnDocumentClassifier.Builder.create(this, id).apply(initializer).build()
