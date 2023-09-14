package com.faendir.awscdkkt.generated.services.batch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.batch.LinuxParameters
import software.amazon.awscdk.services.batch.LinuxParametersProps
import software.constructs.Construct

@Generated
public fun Construct.linuxParameters(id: String, initializer: @AwsCdkDsl LinuxParameters.() -> Unit
    = {}): LinuxParameters = LinuxParameters(this, id).apply(initializer)

@Generated
public fun Construct.linuxParameters(
  id: String,
  props: LinuxParametersProps,
  initializer: @AwsCdkDsl LinuxParameters.() -> Unit = {},
): LinuxParameters = LinuxParameters(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLinuxParameters(id: String, initializer: @AwsCdkDsl
    LinuxParameters.Builder.() -> Unit = {}): LinuxParameters = LinuxParameters.Builder.create(this,
    id).apply(initializer).build()
