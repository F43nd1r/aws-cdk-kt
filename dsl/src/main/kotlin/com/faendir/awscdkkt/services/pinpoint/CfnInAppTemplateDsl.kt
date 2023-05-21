package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnInAppTemplate(
  id: String,
  props: CfnInAppTemplateProps,
  initializer: CfnInAppTemplate.() -> Unit = {},
): CfnInAppTemplate = CfnInAppTemplate(this, id, props).apply(initializer)
