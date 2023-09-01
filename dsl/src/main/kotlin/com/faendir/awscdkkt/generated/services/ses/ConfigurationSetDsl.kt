package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.ConfigurationSet
import software.amazon.awscdk.services.ses.ConfigurationSetProps
import software.constructs.Construct

@Generated
public fun Construct.configurationSet(id: String, initializer: @AwsCdkDsl
    ConfigurationSet.() -> Unit = {}): ConfigurationSet = ConfigurationSet(this,
    id).apply(initializer)

@Generated
public fun Construct.configurationSet(
  id: String,
  props: ConfigurationSetProps,
  initializer: @AwsCdkDsl ConfigurationSet.() -> Unit = {},
): ConfigurationSet = ConfigurationSet(this, id, props).apply(initializer)

@Generated
public fun Construct.buildConfigurationSet(id: String, initializer: @AwsCdkDsl
    ConfigurationSet.Builder.() -> Unit = {}): ConfigurationSet =
    ConfigurationSet.Builder.create(this, id).apply(initializer).build()
