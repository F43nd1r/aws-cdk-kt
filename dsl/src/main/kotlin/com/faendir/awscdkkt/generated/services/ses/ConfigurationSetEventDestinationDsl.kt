package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestination
import software.amazon.awscdk.services.ses.ConfigurationSetEventDestinationProps
import software.constructs.Construct

@Generated
public fun Construct.configurationSetEventDestination(id: String,
    props: ConfigurationSetEventDestinationProps): ConfigurationSetEventDestination =
    ConfigurationSetEventDestination(this, id, props)

@Generated
public fun Construct.configurationSetEventDestination(
  id: String,
  props: ConfigurationSetEventDestinationProps,
  initializer: @AwsCdkDsl ConfigurationSetEventDestination.() -> Unit,
): ConfigurationSetEventDestination = ConfigurationSetEventDestination(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildConfigurationSetEventDestination(id: String, initializer: @AwsCdkDsl
    ConfigurationSetEventDestination.Builder.() -> Unit): ConfigurationSetEventDestination =
    ConfigurationSetEventDestination.Builder.create(this, id).apply(initializer).build()
