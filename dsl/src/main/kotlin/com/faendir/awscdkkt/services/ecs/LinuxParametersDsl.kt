@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.LinuxParameters
import software.amazon.awscdk.services.ecs.LinuxParametersProps
import software.constructs.Construct

public fun Construct.linuxParameters(id: String, initializer: LinuxParameters.() -> Unit = {}):
    LinuxParameters = LinuxParameters(this, id).apply(initializer)

public fun Construct.linuxParameters(
  id: String,
  props: LinuxParametersProps,
  initializer: LinuxParameters.() -> Unit = {},
): LinuxParameters = LinuxParameters(this, id, props).apply(initializer)
