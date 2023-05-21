package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSet
import software.amazon.awscdk.services.ses.CfnConfigurationSetProps
import software.constructs.Construct

@Generated
public fun Construct.cfnConfigurationSet(id: String, initializer: CfnConfigurationSet.() -> Unit =
    {}): CfnConfigurationSet = CfnConfigurationSet(this, id).apply(initializer)

@Generated
public fun Construct.cfnConfigurationSet(
  id: String,
  props: CfnConfigurationSetProps,
  initializer: CfnConfigurationSet.() -> Unit = {},
): CfnConfigurationSet = CfnConfigurationSet(this, id, props).apply(initializer)
