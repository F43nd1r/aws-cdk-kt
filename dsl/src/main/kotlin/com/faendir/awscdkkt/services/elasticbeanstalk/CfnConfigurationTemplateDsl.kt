@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
