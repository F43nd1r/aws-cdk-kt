@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnJobTemplate
import software.amazon.awscdk.services.iot.CfnJobTemplateProps
import software.constructs.Construct

public fun Construct.cfnJobTemplate(
  id: String,
  props: CfnJobTemplateProps,
  initializer: CfnJobTemplate.() -> Unit = {},
): CfnJobTemplate = CfnJobTemplate(this, id, props).apply(initializer)
