@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.inspector

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplate
import software.amazon.awscdk.services.inspector.CfnAssessmentTemplateProps
import software.constructs.Construct

public fun Construct.cfnAssessmentTemplate(
  id: String,
  props: CfnAssessmentTemplateProps,
  initializer: CfnAssessmentTemplate.() -> Unit = {},
): CfnAssessmentTemplate = CfnAssessmentTemplate(this, id, props).apply(initializer)
