package com.faendir.awscdkkt.generated.services.inspector

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplate
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAssessmentTemplate(
  id: String,
  props: CfnAssessmentTemplateProps,
  initializer: @AwsCdkDsl CfnAssessmentTemplate.() -> Unit = {},
): CfnAssessmentTemplate = CfnAssessmentTemplate(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAssessmentTemplate(id: String, initializer: @AwsCdkDsl
    CfnAssessmentTemplate.Builder.() -> Unit = {}): CfnAssessmentTemplate =
    CfnAssessmentTemplate.Builder.create(this, id).apply(initializer).build()
