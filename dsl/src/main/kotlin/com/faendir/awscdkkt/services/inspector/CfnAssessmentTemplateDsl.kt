@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
