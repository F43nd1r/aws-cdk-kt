@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.directoryservice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftADProps
import software.constructs.Construct

public fun Construct.cfnMicrosoftAD(
  id: String,
  props: CfnMicrosoftADProps,
  initializer: CfnMicrosoftAD.() -> Unit = {},
): CfnMicrosoftAD = CfnMicrosoftAD(this, id, props).apply(initializer)
