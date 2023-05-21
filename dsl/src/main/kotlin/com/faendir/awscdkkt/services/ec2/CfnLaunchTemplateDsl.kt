package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate
import software.amazon.awscdk.services.ec2.CfnLaunchTemplateProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLaunchTemplate(
  id: String,
  props: CfnLaunchTemplateProps,
  initializer: CfnLaunchTemplate.() -> Unit = {},
): CfnLaunchTemplate = CfnLaunchTemplate(this, id, props).apply(initializer)
