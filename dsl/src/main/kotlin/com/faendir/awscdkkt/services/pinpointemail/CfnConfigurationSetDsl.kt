@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSetProps
import software.constructs.Construct

public fun Construct.cfnConfigurationSet(
  id: String,
  props: CfnConfigurationSetProps,
  initializer: CfnConfigurationSet.() -> Unit = {},
): CfnConfigurationSet = CfnConfigurationSet(this, id, props).apply(initializer)
