package com.faendir.awscdkkt.services.inspector

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
  initializer: CfnAssessmentTemplate.() -> Unit = {},
): CfnAssessmentTemplate = CfnAssessmentTemplate(this, id, props).apply(initializer)
