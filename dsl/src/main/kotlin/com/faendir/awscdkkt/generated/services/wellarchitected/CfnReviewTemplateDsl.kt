package com.faendir.awscdkkt.generated.services.wellarchitected

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.wellarchitected.CfnReviewTemplate
import software.amazon.awscdk.services.wellarchitected.CfnReviewTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReviewTemplate(
  id: String,
  props: CfnReviewTemplateProps,
  initializer: @AwsCdkDsl CfnReviewTemplate.() -> Unit = {},
): CfnReviewTemplate = CfnReviewTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnReviewTemplate(id: String, initializer: @AwsCdkDsl CfnReviewTemplate.Builder.() -> Unit = {}): CfnReviewTemplate = CfnReviewTemplate.Builder.create(this, id).apply(initializer).build()
