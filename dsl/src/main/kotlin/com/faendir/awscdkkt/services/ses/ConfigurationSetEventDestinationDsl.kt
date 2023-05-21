package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.configurationSetEventDestination(
  id: String,
  props: ConfigurationSetEventDestinationProps,
  initializer: ConfigurationSetEventDestination.() -> Unit = {},
): ConfigurationSetEventDestination = ConfigurationSetEventDestination(this, id,
    props).apply(initializer)
