@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSet
import software.amazon.awscdk.services.ses.CfnConfigurationSetProps
import software.constructs.Construct

public fun Construct.cfnConfigurationSet(id: String, initializer: CfnConfigurationSet.() -> Unit =
    {}): CfnConfigurationSet = CfnConfigurationSet(this, id).apply(initializer)

public fun Construct.cfnConfigurationSet(
  id: String,
  props: CfnConfigurationSetProps,
  initializer: CfnConfigurationSet.() -> Unit = {},
): CfnConfigurationSet = CfnConfigurationSet(this, id, props).apply(initializer)
