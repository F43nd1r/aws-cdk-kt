@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.elasticbeanstalk

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersion
import software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps
import software.constructs.Construct

public fun Construct.cfnApplicationVersion(
  id: String,
  props: CfnApplicationVersionProps,
  initializer: CfnApplicationVersion.() -> Unit = {},
): CfnApplicationVersion = CfnApplicationVersion(this, id, props).apply(initializer)
