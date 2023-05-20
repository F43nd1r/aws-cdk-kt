@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.ConfigurationSet
import software.amazon.awscdk.services.ses.ConfigurationSetProps
import software.constructs.Construct

public fun Construct.configurationSet(id: String, initializer: ConfigurationSet.() -> Unit = {}):
    ConfigurationSet = ConfigurationSet(this, id).apply(initializer)

public fun Construct.configurationSet(
  id: String,
  props: ConfigurationSetProps,
  initializer: ConfigurationSet.() -> Unit = {},
): ConfigurationSet = ConfigurationSet(this, id, props).apply(initializer)
