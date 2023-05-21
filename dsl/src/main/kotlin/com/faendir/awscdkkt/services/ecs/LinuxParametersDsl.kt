package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.LinuxParameters
import software.amazon.awscdk.services.ecs.LinuxParametersProps
import software.constructs.Construct

@Generated
public fun Construct.linuxParameters(id: String, initializer: LinuxParameters.() -> Unit = {}):
    LinuxParameters = LinuxParameters(this, id).apply(initializer)

@Generated
public fun Construct.linuxParameters(
  id: String,
  props: LinuxParametersProps,
  initializer: LinuxParameters.() -> Unit = {},
): LinuxParameters = LinuxParameters(this, id, props).apply(initializer)
