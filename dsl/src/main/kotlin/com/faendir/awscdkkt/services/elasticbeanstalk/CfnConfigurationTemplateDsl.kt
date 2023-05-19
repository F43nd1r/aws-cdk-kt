@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.elasticbeanstalk

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplate
import software.amazon.awscdk.services.elasticbeanstalk.CfnConfigurationTemplateProps
import software.constructs.Construct

public fun Construct.cfnConfigurationTemplate(
  id: String,
  props: CfnConfigurationTemplateProps,
  initializer: CfnConfigurationTemplate.() -> Unit = {},
): CfnConfigurationTemplate = CfnConfigurationTemplate(this, id, props).apply(initializer)
