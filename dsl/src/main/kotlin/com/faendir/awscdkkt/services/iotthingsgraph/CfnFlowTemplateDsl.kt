@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.iotthingsgraph

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplate
import software.amazon.awscdk.services.iotthingsgraph.CfnFlowTemplateProps
import software.constructs.Construct

public fun Construct.cfnFlowTemplate(
  id: String,
  props: CfnFlowTemplateProps,
  initializer: CfnFlowTemplate.() -> Unit = {},
): CfnFlowTemplate = CfnFlowTemplate(this, id, props).apply(initializer)
