package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnSmsTemplate
import software.amazon.awscdk.services.pinpoint.CfnSmsTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSmsTemplate(
  id: String,
  props: CfnSmsTemplateProps,
  initializer: CfnSmsTemplate.() -> Unit = {},
): CfnSmsTemplate = CfnSmsTemplate(this, id, props).apply(initializer)
