package com.faendir.awscdkkt.services.fis

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import software.amazon.awscdk.services.fis.CfnExperimentTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnExperimentTemplate(
  id: String,
  props: CfnExperimentTemplateProps,
  initializer: CfnExperimentTemplate.() -> Unit = {},
): CfnExperimentTemplate = CfnExperimentTemplate(this, id, props).apply(initializer)
