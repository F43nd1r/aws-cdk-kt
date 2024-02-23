package com.faendir.awscdkkt.generated.services.appconfig

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.Environment
import software.amazon.awscdk.services.appconfig.EnvironmentProps
import software.constructs.Construct

@Generated
public fun Construct.environment(
  id: String,
  props: EnvironmentProps,
  initializer: @AwsCdkDsl Environment.() -> Unit = {},
): Environment = Environment(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEnvironment(id: String, initializer: @AwsCdkDsl
    Environment.Builder.() -> Unit = {}): Environment = Environment.Builder.create(this,
    id).apply(initializer).build()
