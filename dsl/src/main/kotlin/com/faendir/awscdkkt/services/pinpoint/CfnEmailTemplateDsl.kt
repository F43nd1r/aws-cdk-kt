@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.pinpoint

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplate
import software.amazon.awscdk.services.pinpoint.CfnEmailTemplateProps
import software.constructs.Construct

public fun Construct.cfnEmailTemplate(
  id: String,
  props: CfnEmailTemplateProps,
  initializer: CfnEmailTemplate.() -> Unit = {},
): CfnEmailTemplate = CfnEmailTemplate(this, id, props).apply(initializer)
