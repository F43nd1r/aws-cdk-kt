@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnTaskTemplate
import software.amazon.awscdk.services.connect.CfnTaskTemplateProps
import software.constructs.Construct

public fun Construct.cfnTaskTemplate(
  id: String,
  props: CfnTaskTemplateProps,
  initializer: CfnTaskTemplate.() -> Unit = {},
): CfnTaskTemplate = CfnTaskTemplate(this, id, props).apply(initializer)
