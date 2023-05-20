@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.quicksight

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.quicksight.CfnTemplate
import software.amazon.awscdk.services.quicksight.CfnTemplateProps
import software.constructs.Construct

public fun Construct.cfnTemplate(
  id: String,
  props: CfnTemplateProps,
  initializer: CfnTemplate.() -> Unit = {},
): CfnTemplate = CfnTemplate(this, id, props).apply(initializer)
