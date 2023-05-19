@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnPushTemplate
import software.amazon.awscdk.services.pinpoint.CfnPushTemplateProps
import software.constructs.Construct

public fun Construct.cfnPushTemplate(
  id: String,
  props: CfnPushTemplateProps,
  initializer: CfnPushTemplate.() -> Unit = {},
): CfnPushTemplate = CfnPushTemplate(this, id, props).apply(initializer)
