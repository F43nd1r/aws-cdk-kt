package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationSetEventDestination(
  id: String,
  props: CfnConfigurationSetEventDestinationProps,
  initializer: CfnConfigurationSetEventDestination.() -> Unit = {},
): CfnConfigurationSetEventDestination = CfnConfigurationSetEventDestination(this, id,
    props).apply(initializer)
