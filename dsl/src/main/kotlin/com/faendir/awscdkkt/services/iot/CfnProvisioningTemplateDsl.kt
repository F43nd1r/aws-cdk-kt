@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnProvisioningTemplate
import software.amazon.awscdk.services.iot.CfnProvisioningTemplateProps
import software.constructs.Construct

public fun Construct.cfnProvisioningTemplate(
  id: String,
  props: CfnProvisioningTemplateProps,
  initializer: CfnProvisioningTemplate.() -> Unit = {},
): CfnProvisioningTemplate = CfnProvisioningTemplate(this, id, props).apply(initializer)
