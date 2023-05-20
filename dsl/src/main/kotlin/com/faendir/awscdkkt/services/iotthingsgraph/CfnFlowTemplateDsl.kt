@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
