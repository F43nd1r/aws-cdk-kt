@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps
import software.constructs.Construct

public fun Construct.configurationSetEventDestination(
  id: String,
  props: ConfigurationSetEventDestinationProps,
  initializer: ConfigurationSetEventDestination.() -> Unit = {},
): ConfigurationSetEventDestination = ConfigurationSetEventDestination(this, id,
    props).apply(initializer)
