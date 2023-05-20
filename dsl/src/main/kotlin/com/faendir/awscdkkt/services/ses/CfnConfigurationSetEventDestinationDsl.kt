@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
