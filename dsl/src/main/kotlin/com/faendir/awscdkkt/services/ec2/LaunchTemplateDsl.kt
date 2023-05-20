@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.LaunchTemplate
import software.amazon.awscdk.services.ec2.LaunchTemplateProps
import software.constructs.Construct

public fun Construct.launchTemplate(
  id: String,
  props: LaunchTemplateProps,
  initializer: LaunchTemplate.() -> Unit = {},
): LaunchTemplate = LaunchTemplate(this, id, props).apply(initializer)

public fun Construct.launchTemplate(id: String, initializer: LaunchTemplate.() -> Unit = {}):
    LaunchTemplate = LaunchTemplate(this, id).apply(initializer)
