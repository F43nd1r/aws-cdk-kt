@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplate
import software.amazon.awscdk.services.pinpoint.CfnInAppTemplateProps
import software.constructs.Construct

public fun Construct.cfnInAppTemplate(
  id: String,
  props: CfnInAppTemplateProps,
  initializer: CfnInAppTemplate.() -> Unit = {},
): CfnInAppTemplate = CfnInAppTemplate(this, id, props).apply(initializer)
