@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.LaunchTemplate
import software.amazon.awscdk.services.ec2.LaunchTemplateProps
import software.constructs.Construct

public fun Construct.launchTemplate(id: String, initializer: LaunchTemplate.() -> Unit = {}):
    LaunchTemplate = LaunchTemplate(this, id).apply(initializer)

public fun Construct.launchTemplate(
  id: String,
  props: LaunchTemplateProps,
  initializer: LaunchTemplate.() -> Unit = {},
): LaunchTemplate = LaunchTemplate(this, id, props).apply(initializer)
