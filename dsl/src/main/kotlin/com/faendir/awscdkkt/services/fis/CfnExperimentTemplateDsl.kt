@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.fis

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.fis.CfnExperimentTemplate
import software.amazon.awscdk.services.fis.CfnExperimentTemplateProps
import software.constructs.Construct

public fun Construct.cfnExperimentTemplate(
  id: String,
  props: CfnExperimentTemplateProps,
  initializer: CfnExperimentTemplate.() -> Unit = {},
): CfnExperimentTemplate = CfnExperimentTemplate(this, id, props).apply(initializer)
