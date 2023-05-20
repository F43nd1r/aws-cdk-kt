@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps
import software.constructs.Construct

public fun Construct.cfnConfigurationSetEventDestination(
  id: String,
  props: CfnConfigurationSetEventDestinationProps,
  initializer: CfnConfigurationSetEventDestination.() -> Unit = {},
): CfnConfigurationSetEventDestination = CfnConfigurationSetEventDestination(this, id,
    props).apply(initializer)
