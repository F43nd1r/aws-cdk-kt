package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplate
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEmailTemplate(
  id: String,
  props: CfnEmailTemplateProps,
  initializer: CfnEmailTemplate.() -> Unit = {},
): CfnEmailTemplate = CfnEmailTemplate(this, id, props).apply(initializer)
